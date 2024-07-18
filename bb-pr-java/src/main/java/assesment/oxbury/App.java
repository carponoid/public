package assesment.oxbury;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.lib.Repository;
import org.eclipse.jgit.storage.file.FileRepositoryBuilder;

/**
 * Hello world!
 *
 */
public class App {

  private static String getAPIURL(String gitRepoURL) {
    
    // For now I am considering only .org & .com domans & assuming the repo URL wold always end with .git
    if ( gitRepoURL.contains(".org") ){
      gitRepoURL = StringUtils.substringBetween(gitRepoURL, ".org/", ".git");
    } else {
      gitRepoURL = StringUtils.substringBetween(gitRepoURL, ".com", ".git");
    }
    return gitRepoURL;
  }

  public static void main(String[] args) throws IOException {

    String input = System.console().readLine();
    args = input.split(" ");
    int agrsLength = args != null ? args.length : 0;
    String cmd = (agrsLength == 0) ? "help" : args[0];
    if (cmd == "help") {
      System.out.println(GitOperations.helpText);
      return;
    }

    FileRepositoryBuilder builder = new FileRepositoryBuilder();
    File workDir = new File(System.getProperty("user.dir") + "/.git");
    Repository repository = builder.setGitDir(workDir)
        .readEnvironment() // scan environment GIT_* variables
        .findGitDir() // scan up the file system tree
        .build();
    String rawRemoteURL = repository.getConfig().getString("remote", "origin", "url");
    String remoteURL = rawRemoteURL.replace(".git", "");
    String remoteAPI = getAPIURL(rawRemoteURL);
    String result = null;
    try {
      result = switch (cmd) {
        case "list" -> GitOperations.list(remoteAPI, (agrsLength > 1) ? args[1] : null);
        case "checkout" -> GitOperations.checkout(repository, remoteURL, (agrsLength > 1) ? args[1] : null);
        case "squash-msg" -> GitOperations.squashMsg(repository, remoteAPI, (agrsLength > 1) ? args[1] : null);
        case "squash-merge" -> GitOperations.squashMerge(repository, remoteAPI,
            (agrsLength > 1) ? Arrays.copyOfRange(args, 1, agrsLength - 1) : null);
        case "approve" -> GitOperations.approve(remoteAPI, (agrsLength > 1) ? args[1] : null);
        case "unapprove" -> GitOperations.unapprove(remoteAPI, (agrsLength > 1) ? args[1] : null);
        case "decline" -> GitOperations.decline(remoteAPI, (agrsLength > 1) ? args[1] : null);
        case "close-branch" ->
        GitOperations.closeBranch(remoteAPI, (agrsLength > 1) ? Arrays.copyOfRange(args, 1, agrsLength - 1) : null);
        default -> GitOperations.helpText;
      };

    } catch (GitAPIException | IOException e) {
      e.printStackTrace();
      result = e.getMessage();
    }
    System.out.println(result);
  }

}
