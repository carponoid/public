
package assesment.oxbury;

import java.io.IOException;
import java.util.List;

import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.CannotDeleteCurrentBranchException;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.api.errors.InvalidRemoteException;
import org.eclipse.jgit.api.errors.NotMergedException;
import org.eclipse.jgit.api.errors.TransportException;
import org.eclipse.jgit.lib.Repository;
import org.eclipse.jgit.transport.RemoteConfig;
import org.json.JSONArray;
import org.json.JSONObject;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class GitOperations {

    private static final String ERROR_TEXT = "Unexpected code ";

    public static final String helpText = """
                    Tool that helps management of bitbucket pull requests from the commandline

            Usage: $(basename "$0") [$ACTION_LIST] [options]
            help         : show this help
            list         : list (open) PRs in this repo
            checkout     : check out a pull request in git
            squash-msg   : copy a reasonable message to the clipboard for merging a PR
            squash-merge : merge the PR using the message from 'squash-msg'
            approve      : approve a PR (though should you from the CLI?)
            unapprove    : remove your approval
            decline      : decline a PR
            close-branch : change the 'close_source_branch' field
            completion   : returns command bash completion

            'squash-msg' | 'squash-merge' | 'approve' | 'unapprove' | 'decline' | 'close-branch'
            Without an argument, the pull request that belongs to the current branch
            is used.

            Arguments
            <PR> The PR number to operate on.

            'close-branch' can toggle true or false (default true)
            -c : true|false (e.g. -c false) to toggle the state

            'squash-merge' can do dangerous things
            -D : force close the branch regardless of the PR setting. If not
               specified then the PR will be merged according to the PR
               settings.

            'list' can additionally filter by state
            -s : the state (e.g. -s OPEN) OPEN|MERGED|DECLINED|SUPERSEDED
               If you get it wrong, you'll get all the PRs which may take
               longer than you want. Defaults to 'OPEN'

            Examples
            If we are on the branch 'fix/owasp'

            # Squash Merge the PR associated with 'fix/owasp' and close (delete) the source branch
            # The local branch 'fix/owasp' is deleted and you will end up on the 'main' branch
            bsh ❯ bb-pr squash-merge -D

            # Squash Merge the PR associated with 'feat/owasp' according its PR settings
            # The local branch 'fix/owasp' is deleted and you will end up on the 'main' branch
            bsh ❯ bb-pr squash-merge

            # Squash Merge the PR#5 leaving you on the 'feat/owasp'
            bsh ❯ bb-pr squash-merge 5

            # Squash Merge the PR#5 deleting the source branch leaving you on the 'feat/owasp'
            bsh ❯ bb-pr squash-merge -D 5
                    """;

    private static final String CURL_AUTH = "${BITBUCKET_USER}:${BITBUCKET_TOKEN}";
    private static final String BITBUCKET_API_URL = "https://api.bitbucket.org/2.0/repositories";
    private static OkHttpClient client = new OkHttpClient();
    private static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");

    private enum METHOD {
        GET, POST, PUT, DELETE
    }

    /**
     * Helper method to perform CURL via OkHttpClient
     * * @param url
     * 
     * @return
     * @throws IOException
     */
    private static String curl(String url, String payload, METHOD httpMethod) throws IOException {

        Request.Builder reqBuilder = new Request.Builder()
                .url(BITBUCKET_API_URL + url)
                .addHeader("Content-Type", "application/json")
                .addHeader("Accept", "application/json");
        RequestBody body = null;
        if (payload != null) {
            body = RequestBody.create(payload, JSON); // Assumed it is going to be JSON always
        }

        switch (httpMethod) {
            case METHOD.POST:
                reqBuilder.post(body);
                break;
            case METHOD.PUT:
                reqBuilder.put(body);
                break;
            case METHOD.DELETE:
                reqBuilder.delete(body);
                break;
            default:
                break;
        }
        Request request = reqBuilder.build();
        try (Response response = client.newCall(request).execute()) {
            if (response.isSuccessful())
                return response.body().string();
            else
                return ERROR_TEXT + response;
        }
    }

    /**
     * List all PRs for the given status, OPEN is default status
     * 
     * @param remoteURL
     * @param state
     * @return
     * @throws IOException
     */
    public static String list(String remoteURL, String state) throws IOException {
        if (state == null) {
            state = "OPEN";
        }
        String url = remoteURL + "/pullrequests?state=" + state;
        return curl(url, null, METHOD.GET);
    }

    /**
     * Finds the branch using the given PR id and switch to the branch
     * 
     * @param repository
     * @param remoteURL
     * @param prID
     * @throws InvalidRemoteException
     * @throws TransportException
     * @throws GitAPIException
     * @throws IOException
     */
    public static String checkout(Repository repository, String remoteURL, String prID)
            throws InvalidRemoteException, TransportException, GitAPIException, IOException {
        isPRIdValid(prID);
        // Fetch All Remotes
        try (Git git = new Git(repository)) {
            List<RemoteConfig> remotes = git.remoteList().call();
            for (RemoteConfig remote : remotes) {
                git.fetch()
                        .setRemote(remote.getName())
                        .setRefSpecs(remote.getFetchRefSpecs())
                        .call();
            }
            // Get the branch name using PR id
            String jsonResponse = curl(remoteURL + "/pullrequests/" + prID, null, METHOD.GET);
            JSONObject json = new JSONObject(jsonResponse);
            String branchName = json.getJSONObject("source").getJSONObject("branch").getString("name");
            return "Checked out to "+git.checkout().setName(branchName).call().getName();
        }

    }

    public static String decline(String remoteURL, String prID) throws IOException {
        isPRIdValid(prID);
        String url = remoteURL + String.format("/pullrequests/%s/decline", prID);

        return curl(url, null, METHOD.POST);
    }

    public static String approve(String remoteURL, String prID) throws IOException {
        isPRIdValid(prID);
        String url = remoteURL + String.format("/pullrequests/%s/approve", prID);
        return curl(url, null, METHOD.POST);
    }

    public static String unapprove(String remoteURL, String prID) throws IOException {
        isPRIdValid(prID);
        String url = remoteURL + String.format("/pullrequests/%s/approve", prID);
        return curl(url, null, METHOD.DELETE);
    }

    private static void isPRIdValid(String prID) {
        if (prID == null || prID.trim().length() == 0) {
            throw new IllegalArgumentException("Invalid prID: " + prID);
        }
    }

    public static String squashMerge(Repository repository, String remoteApiURL, String... args)
            throws IOException, NotMergedException, CannotDeleteCurrentBranchException, GitAPIException {

        String prID = null;
        boolean deleteBranch = true;
        boolean deleteLocalBranches = false;
        // Logic, by default delete the branch unless a PR id is supplied and perform
        // basic validation on args supplied.
        if (args != null) {
            // Can accept max of 2 arguments
            if (args.length > 2) {
                return helpText;
            }
            if (args.length == 2) {
                if (args[0] != "-D") {
                    return helpText;
                }
                prID = args[1];
            } else if (args[0] != "-D") {
                prID = args[0];
                deleteBranch = false;
            }
        }
        if (prID == null) { // then we are branch based, so get the PR id associated with the branch
            deleteLocalBranches = true;
            prID = getPRID(remoteApiURL);
        }
        // If prID is still null then return with error
        if (prID == null) {
            return "Unable to execute merge, PR ID associated with branch cannot be identified ";
        }
        // Now perform the squash merge operation

        JSONObject payload = new JSONObject();
        payload.put("type", 0);
        payload.put("message", 0);
        if (deleteBranch) {
            payload.put("close_source_branch", "true");
        }
        payload.put("merge_strategy", "squash");
        String url = remoteApiURL + String.format("/pullrequests/%s/merge", prID);
        String responseText = curl(url, payload.toString(), METHOD.POST);
        if (responseText != null && !responseText.contains(ERROR_TEXT) && deleteLocalBranches) {
            try (Git git = new Git(repository)) {
                git.branchDelete().setBranchNames(repository.getBranch()).call();
            }
        }
        return responseText;
    }

    /**
     * Helper method to get the PR id
     * 
     * @param remoteURL
     * @return
     * @throws IOException
     */
    private static String getPRID(String remoteURL) throws IOException {
        String jsonResponse = list(remoteURL, "OPEN");
        if (jsonResponse == null)
            return null;
        JSONObject jsonResponseObject = new JSONObject(jsonResponse);
        return ((JSONObject) jsonResponseObject.getJSONArray("values").get(0)).getString("id");
    }

    /**
     * 
     * 
     * Would set close_source_branch flag on the remote
     * 
     * @param remoteApiURL
     * @param args
     * @return
     * @throws IOException
     */
    public static String closeBranch(String remoteApiURL, String... args) throws IOException {
        String prID = null;
        String closeBranch = "true";
        if (args == null || args.length == 0) {
            isPRIdValid(null);
        } else if (args[0] == "-c") {
            closeBranch = args[1];
        } else {
            prID = args[0];
        }
        if (prID == null) {
            getPRID(remoteApiURL);
        }
        JSONObject pr = new JSONObject();
        pr.put("close_source_branch", closeBranch);

        String url = remoteApiURL + "/pullrequests/" + prID;
        return curl(url, pr.toString(), METHOD.PUT);
    }

    /**
     * Finds the defailt branch from the remote and switches to it
     * @param repository
     * @param remoteURL
     * @return
     * @throws InvalidRemoteException
     * @throws TransportException
     * @throws GitAPIException
     */
    public static String switchDefault(Repository repository, String remoteURL)
            throws InvalidRemoteException, TransportException, GitAPIException {

        
        String remoteDefault = Git.lsRemoteRepository()
                .setRemote("https://github.com/example")
                .callAsMap().get("HEAD").getTarget().getName();
        try (Git git = new Git(repository)) {
            return "Switched to " + git.checkout().setName(remoteDefault).call().getName();
        }
    }

    /**
     * Generated Sqush message using the given PR identifier
     * 
     * @param repository
     * @param remoteAPIURL
     * @param prID
     * @throws IOException
     */
    public static String squashMsg(Repository repository, String remoteAPIURL, String prID) throws IOException {
        return emitSquashMergeMsg(repository, remoteAPIURL, prID);
    }

    public static String emitSquashMergeMsg(Repository repository, String remoteURL, String prID) throws IOException {
        if (prID == null) {
            throw new IOException("No PR identifier provided ");
        }
        String prString = curl(remoteURL + "/pullrequests/" + prID, null, METHOD.GET);
        if (prString == null) {
            throw new IOException("Unable to retreive PR details");
        }
        JSONObject prJSON = new JSONObject(prString);
        StringBuffer buffer = new StringBuffer(prJSON.getString("title")).append("(pull request ").append(prID)
                .append(")").append("\n").append(prJSON.getString("description")).append("\n").append("Approved-By: ")
                .append("\n");
        JSONArray participants = prJSON.getJSONArray("participants");
        participants.forEach(p -> {
            JSONObject pJSON = (JSONObject) p;
            if ("true".equalsIgnoreCase(pJSON.getString("approved"))) {
                buffer.append(pJSON.query("user/display_name")).append("\n");
            }
        });

        return buffer.toString().trim();
    }
}
