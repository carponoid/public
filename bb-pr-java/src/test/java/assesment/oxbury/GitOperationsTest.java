package assesment.oxbury;

import org.junit.FixMethodOrder;
import org.junit.jupiter.api.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class GitOperationsTest {
    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        // during test generation this statement threw an exception of type NullPointerException in error
        String str2 = GitOperations.decline("{\"values\": [], \"pagelen\": 10, \"size\": 0, \"page\": 1}", "{\"values\": [], \"pagelen\": 10, \"size\": 0, \"page\": 1}");
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        // during test generation this statement threw an exception of type NullPointerException in error
        String str2 = GitOperations.decline("Unexpected code Response{protocol=h2, code=404, message=, url=https://api.bitbucket.org/2.0/repositorieshi!/pullrequests?state=}", "hi!");
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        // during test generation this statement threw an exception of type NullPointerException in error
        String str2 = GitOperations.approve("Unexpected code Response{protocol=h2, code=404, message=, url=https://api.bitbucket.org/2.0/repositorieshi!/pullrequests?state=}", "hi!");
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        // during test generation this statement threw an exception of type NullPointerException in error
        String str2 = GitOperations.decline("hi!", "{\"values\": [], \"pagelen\": 10, \"size\": 0, \"page\": 1}");
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        // during test generation this statement threw an exception of type NullPointerException in error
        String str2 = GitOperations.decline("Unexpected code Response{protocol=h2, code=404, message=, url=https://api.bitbucket.org/2.0/repositories%7B%22values%22:%20[],%20%22pagelen%22:%2010,%20%22size%22:%200,%20%22page%22:%201%7D/pullrequests?state={%22values%22:%20[],%20%22pagelen%22:%2010,%20%22size%22:%200,%20%22page%22:%201}}", "hi!");
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        // during test generation this statement threw an exception of type NullPointerException in error
        String str2 = GitOperations.approve("Unexpected code Response{protocol=h2, code=404, message=, url=https://api.bitbucket.org/2.0/repositories%7B%22values%22:%20[],%20%22pagelen%22:%2010,%20%22size%22:%200,%20%22page%22:%201%7D/pullrequests?state={%22values%22:%20[],%20%22pagelen%22:%2010,%20%22size%22:%200,%20%22page%22:%201}}", "Unexpected code Response{protocol=h2, code=404, message=, url=https://api.bitbucket.org/2.0/repositoriesUnexpected%20code%20Response%7Bprotocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositorieshi!/pullrequests?state=}/pullrequests/Unexpected%20code%20Response{protocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositorieshi!/pullrequests?state=}}");
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        // during test generation this statement threw an exception of type NullPointerException in error
        String str2 = GitOperations.decline("{\"values\": [], \"pagelen\": 10, \"size\": 0, \"page\": 1}", "Unexpected code Response{protocol=h2, code=404, message=, url=https://api.bitbucket.org/2.0/repositoriesUnexpected%20code%20Response%7Bprotocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositorieshi!/pullrequests?state=}/pullrequests/Unexpected%20code%20Response{protocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositorieshi!/pullrequests?state=}}");
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        // during test generation this statement threw an exception of type NullPointerException in error
        String str2 = GitOperations.decline("Unexpected code Response{protocol=h2, code=404, message=, url=https://api.bitbucket.org/2.0/repositorieshi!/pullrequests?state=}", "Unexpected code Response{protocol=h2, code=404, message=, url=https://api.bitbucket.org/2.0/repositorieshi!/pullrequests?state=}");
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        // during test generation this statement threw an exception of type NullPointerException in error
        String str2 = GitOperations.approve("Unexpected code Response{protocol=h2, code=404, message=, url=https://api.bitbucket.org/2.0/repositoriesUnexpected%20code%20Response%7Bprotocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositorieshi!/pullrequests?state=}/pullrequests/Unexpected%20code%20Response{protocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositorieshi!/pullrequests?state=}}", "{\"values\": [], \"pagelen\": 10, \"size\": 0, \"page\": 1}");
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        // during test generation this statement threw an exception of type NullPointerException in error
        String str2 = GitOperations.approve("{\"values\": [], \"pagelen\": 10, \"size\": 0, \"page\": 1}", "Unexpected code Response{protocol=h2, code=404, message=, url=https://api.bitbucket.org/2.0/repositoriesUnexpected%20code%20Response%7Bprotocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositorieshi!/pullrequests?state=}/pullrequests/Unexpected%20code%20Response{protocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositories%7B%22values%22:%20[],%20%22pagelen%22:%2010,%20%22size%22:%200,%20%22page%22:%201%7D/pullrequests?state={%22values%22:%20[],%20%22pagelen%22:%2010,%20%22size%22:%200,%20%22page%22:%201}}/approve}");
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        // during test generation this statement threw an exception of type NullPointerException in error
        String str2 = GitOperations.approve("Unexpected code Response{protocol=h2, code=404, message=, url=https://api.bitbucket.org/2.0/repositorieshi!/pullrequests?state=}", "Unexpected code Response{protocol=h2, code=404, message=, url=https://api.bitbucket.org/2.0/repositoriesUnexpected%20code%20Response%7Bprotocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositorieshi!/pullrequests?state=}/pullrequests/Unexpected%20code%20Response{protocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositorieshi!/pullrequests?state=}}");
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        // during test generation this statement threw an exception of type NullPointerException in error
        String str2 = GitOperations.approve("hi!", "Unexpected code Response{protocol=h2, code=404, message=, url=https://api.bitbucket.org/2.0/repositoriesUnexpected%20code%20Response%7Bprotocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositorieshi!/pullrequests?state=}/pullrequests?state=Unexpected%20code%20Response{protocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositorieshi!/pullrequests?state=}}");
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        // during test generation this statement threw an exception of type NullPointerException in error
        String str2 = GitOperations.decline("{\"values\": [], \"pagelen\": 10, \"size\": 0, \"page\": 1}", "hi!");
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        // during test generation this statement threw an exception of type NullPointerException in error
        String str2 = GitOperations.decline("hi!", "Unexpected code Response{protocol=h2, code=404, message=, url=https://api.bitbucket.org/2.0/repositories%7B%22values%22:%20[],%20%22pagelen%22:%2010,%20%22size%22:%200,%20%22page%22:%201%7D/pullrequests?state={%22values%22:%20[],%20%22pagelen%22:%2010,%20%22size%22:%200,%20%22page%22:%201}}");
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        // during test generation this statement threw an exception of type NullPointerException in error
        String str2 = GitOperations.approve("Unexpected code Response{protocol=h2, code=404, message=, url=https://api.bitbucket.org/2.0/repositoriesUnexpected%20code%20Response%7Bprotocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositorieshi!/pullrequests?state=}/pullrequests/Unexpected%20code%20Response{protocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositories%7B%22values%22:%20[],%20%22pagelen%22:%2010,%20%22size%22:%200,%20%22page%22:%201%7D/pullrequests?state={%22values%22:%20[],%20%22pagelen%22:%2010,%20%22size%22:%200,%20%22page%22:%201}}/approve}", "Unexpected code Response{protocol=h2, code=404, message=, url=https://api.bitbucket.org/2.0/repositoriesUnexpected%20code%20Response%7Bprotocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositories%7B%22values%22:%20[],%20%22pagelen%22:%2010,%20%22size%22:%200,%20%22page%22:%201%7D/pullrequests?state={%22values%22:%20[],%20%22pagelen%22:%2010,%20%22size%22:%200,%20%22page%22:%201}}/pullrequests/Unexpected%20code%20Response{protocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositoriesUnexpected%20code%20Response%7Bprotocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositorieshi!/pullrequests?state=}/pullrequests/Unexpected%20code%20Response{protocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositorieshi!/pullrequests?state=}}/approve}");
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        // during test generation this statement threw an exception of type NullPointerException in error
        String str2 = GitOperations.decline("Unexpected code Response{protocol=h2, code=404, message=, url=https://api.bitbucket.org/2.0/repositoriesUnexpected%20code%20Response%7Bprotocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositoriesUnexpected%20code%20Response%7Bprotocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositorieshi!/pullrequests?state=}/pullrequests?state=Unexpected%20code%20Response{protocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositorieshi!/pullrequests?state=}}/pullrequests?state=Unexpected%20code%20Response{protocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositories%7B%22values%22:%20[],%20%22pagelen%22:%2010,%20%22size%22:%200,%20%22page%22:%201%7D/pullrequests?state={%22values%22:%20[],%20%22pagelen%22:%2010,%20%22size%22:%200,%20%22page%22:%201}}}", "Unexpected code Response{protocol=h2, code=404, message=, url=https://api.bitbucket.org/2.0/repositoriesUnexpected%20code%20Response%7Bprotocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositorieshi!/pullrequests?state=}/pullrequests/Unexpected%20code%20Response{protocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositorieshi!/pullrequests?state=}}");
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        // during test generation this statement threw an exception of type NullPointerException in error
        String str2 = GitOperations.approve("Unexpected code Response{protocol=h2, code=404, message=, url=https://api.bitbucket.org/2.0/repositorieshi!/pullrequests/Unexpected%20code%20Response%7Bprotocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositoriesUnexpected%20code%20Response%7Bprotocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositorieshi!/pullrequests?state=}/pullrequests/Unexpected%20code%20Response{protocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositories%7B%22values%22:%20[],%20%22pagelen%22:%2010,%20%22size%22:%200,%20%22page%22:%201%7D/pullrequests?state={%22values%22:%20[],%20%22pagelen%22:%2010,%20%22size%22:%200,%20%22page%22:%201}}/approve}/approve}", "Unexpected code Response{protocol=h2, code=404, message=, url=https://api.bitbucket.org/2.0/repositoriesUnexpected%20code%20Response%7Bprotocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositories%7B%22values%22:%20[],%20%22pagelen%22:%2010,%20%22size%22:%200,%20%22page%22:%201%7D/pullrequests?state={%22values%22:%20[],%20%22pagelen%22:%2010,%20%22size%22:%200,%20%22page%22:%201}}/pullrequests/Unexpected%20code%20Response{protocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositoriesUnexpected%20code%20Response%7Bprotocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositorieshi!/pullrequests?state=}/pullrequests/Unexpected%20code%20Response{protocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositorieshi!/pullrequests?state=}}/approve}");
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        // during test generation this statement threw an exception of type NullPointerException in error
        String str2 = GitOperations.approve("Unexpected code Response{protocol=h2, code=404, message=, url=https://api.bitbucket.org/2.0/repositories%7B%22values%22:%20[],%20%22pagelen%22:%2010,%20%22size%22:%200,%20%22page%22:%201%7D/pullrequests?state={%22values%22:%20[],%20%22pagelen%22:%2010,%20%22size%22:%200,%20%22page%22:%201}}", "Unexpected code Response{protocol=h2, code=404, message=, url=https://api.bitbucket.org/2.0/repositories%7B%22values%22:%20[],%20%22pagelen%22:%2010,%20%22size%22:%200,%20%22page%22:%201%7D/pullrequests?state={%22values%22:%20[],%20%22pagelen%22:%2010,%20%22size%22:%200,%20%22page%22:%201}}");
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        // during test generation this statement threw an exception of type NullPointerException in error
        String str2 = GitOperations.approve("{\"values\": [], \"pagelen\": 10, \"size\": 0, \"page\": 1}", "Unexpected code Response{protocol=h2, code=404, message=, url=https://api.bitbucket.org/2.0/repositorieshi!/pullrequests/Unexpected%20code%20Response%7Bprotocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositorieshi!/pullrequests?state=}}");
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        // during test generation this statement threw an exception of type NullPointerException in error
        String str2 = GitOperations.decline("Unexpected code Response{protocol=h2, code=404, message=, url=https://api.bitbucket.org/2.0/repositoriesUnexpected%20code%20Response%7Bprotocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositorieshi!/pullrequests?state=}/pullrequests/Unexpected%20code%20Response{protocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositories%7B%22values%22:%20[],%20%22pagelen%22:%2010,%20%22size%22:%200,%20%22page%22:%201%7D/pullrequests?state={%22values%22:%20[],%20%22pagelen%22:%2010,%20%22size%22:%200,%20%22page%22:%201}}/approve}", "hi!");
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        // during test generation this statement threw an exception of type NullPointerException in error
        String str2 = GitOperations.approve("", "Unexpected code Response{protocol=h2, code=404, message=, url=https://api.bitbucket.org/2.0/repositorieshi!/pullrequests/Unexpected%20code%20Response%7Bprotocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositorieshi!/pullrequests?state=}}");
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        // during test generation this statement threw an exception of type NullPointerException in error
        String str2 = GitOperations.approve("", "Unexpected code Response{protocol=h2, code=404, message=, url=https://api.bitbucket.org/2.0/repositoriesUnexpected%20code%20Response%7Bprotocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositorieshi!/pullrequests?state=}/pullrequests?state=Unexpected%20code%20Response{protocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositorieshi!/pullrequests?state=}}");
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        // during test generation this statement threw an exception of type NullPointerException in error
        String str2 = GitOperations.approve("Unexpected code Response{protocol=h2, code=404, message=, url=https://api.bitbucket.org/2.0/repositoriesUnexpected%20code%20Response%7Bprotocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositorieshi!/pullrequests?state=}/pullrequests/Unexpected%20code%20Response{protocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositories%7B%22values%22:%20[],%20%22pagelen%22:%2010,%20%22size%22:%200,%20%22page%22:%201%7D/pullrequests?state={%22values%22:%20[],%20%22pagelen%22:%2010,%20%22size%22:%200,%20%22page%22:%201}}/approve}", "Unexpected code Response{protocol=h2, code=404, message=, url=https://api.bitbucket.org/2.0/repositoriesUnexpected%20code%20Response%7Bprotocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositorieshi!/pullrequests?state=}/pullrequests/Unexpected%20code%20Response{protocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositorieshi!/pullrequests?state=}}");
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        // during test generation this statement threw an exception of type NullPointerException in error
        String str2 = GitOperations.decline("Unexpected code Response{protocol=h2, code=404, message=, url=https://api.bitbucket.org/2.0/repositories/pullrequests/hi!/approve}", "Unexpected code Response{protocol=h2, code=404, message=, url=https://api.bitbucket.org/2.0/repositories/pullrequests/hi!/approve}");
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        // during test generation this statement threw an exception of type NullPointerException in error
        String str2 = GitOperations.decline("Unexpected code Response{protocol=h2, code=404, message=, url=https://api.bitbucket.org/2.0/repositoriesUnexpected%20code%20Response%7Bprotocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositories%7B%22values%22:%20[],%20%22pagelen%22:%2010,%20%22size%22:%200,%20%22page%22:%201%7D/pullrequests?state={%22values%22:%20[],%20%22pagelen%22:%2010,%20%22size%22:%200,%20%22page%22:%201}}/pullrequests/Unexpected%20code%20Response{protocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositoriesUnexpected%20code%20Response%7Bprotocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositorieshi!/pullrequests?state=}/pullrequests/Unexpected%20code%20Response{protocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositorieshi!/pullrequests?state=}}/approve}", "Unexpected code Response{protocol=h2, code=404, message=, url=https://api.bitbucket.org/2.0/repositoriesUnexpected%20code%20Response%7Bprotocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositories/pullrequests/hi!/approve%7D/pullrequests/Unexpected%20code%20Response%7Bprotocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositoriesUnexpected%20code%20Response%7Bprotocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositorieshi!/pullrequests?state=}/pullrequests/Unexpected%20code%20Response{protocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositories%7B%22values%22:%20[],%20%22pagelen%22:%2010,%20%22size%22:%200,%20%22page%22:%201%7D/pullrequests?state={%22values%22:%20[],%20%22pagelen%22:%2010,%20%22size%22:%200,%20%22page%22:%201}}/approve}/approve}");
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        // during test generation this statement threw an exception of type NullPointerException in error
        String str2 = GitOperations.decline("Unexpected code Response{protocol=h2, code=404, message=, url=https://api.bitbucket.org/2.0/repositoriesUnexpected%20code%20Response%7Bprotocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositorieshi!/pullrequests?state=}/pullrequests/Unexpected%20code%20Response{protocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositories%7B%22values%22:%20[],%20%22pagelen%22:%2010,%20%22size%22:%200,%20%22page%22:%201%7D/pullrequests?state={%22values%22:%20[],%20%22pagelen%22:%2010,%20%22size%22:%200,%20%22page%22:%201}}/approve}", "Unexpected code Response{protocol=h2, code=404, message=, url=https://api.bitbucket.org/2.0/repositories%7B%22values%22:%20[],%20%22pagelen%22:%2010,%20%22size%22:%200,%20%22page%22:%201%7D/pullrequests/%7B%22values%22:%20[],%20%22pagelen%22:%2010,%20%22size%22:%200,%20%22page%22:%201%7D/approve}");
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        // during test generation this statement threw an exception of type NullPointerException in error
        String str2 = GitOperations.decline("Unexpected code Response{protocol=h2, code=404, message=, url=https://api.bitbucket.org/2.0/repositories/pullrequests/hi!/approve}", "Unexpected code Response{protocol=h2, code=404, message=, url=https://api.bitbucket.org/2.0/repositoriesUnexpected%20code%20Response%7Bprotocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositoriesUnexpected%20code%20Response%7Bprotocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositorieshi!/pullrequests?state=}/pullrequests/Unexpected%20code%20Response{protocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositorieshi!/pullrequests?state=}}/pullrequests/Unexpected%20code%20Response{protocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositories/pullrequests/hi!/approve}/approve}");
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        // during test generation this statement threw an exception of type NullPointerException in error
        String str2 = GitOperations.decline("Unexpected code Response{protocol=h2, code=404, message=, url=https://api.bitbucket.org/2.0/repositoriesUnexpected%20code%20Response%7Bprotocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositories%7B%22values%22:%20[],%20%22pagelen%22:%2010,%20%22size%22:%200,%20%22page%22:%201%7D/pullrequests?state={%22values%22:%20[],%20%22pagelen%22:%2010,%20%22size%22:%200,%20%22page%22:%201}}/pullrequests/Unexpected%20code%20Response{protocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositoriesUnexpected%20code%20Response%7Bprotocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositorieshi!/pullrequests?state=}/pullrequests/Unexpected%20code%20Response{protocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositorieshi!/pullrequests?state=}}/approve}", "Unexpected code Response{protocol=h2, code=404, message=, url=https://api.bitbucket.org/2.0/repositoriesUnexpected%20code%20Response%7Bprotocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositorieshi!/pullrequests?state=}/pullrequests/Unexpected%20code%20Response{protocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositorieshi!/pullrequests?state=}}");
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        // during test generation this statement threw an exception of type NullPointerException in error
        String str2 = GitOperations.decline("Unexpected code Response{protocol=h2, code=404, message=, url=https://api.bitbucket.org/2.0/repositorieshi!/pullrequests?state=}", "Unexpected code Response{protocol=h2, code=404, message=, url=https://api.bitbucket.org/2.0/repositorieshi!/pullrequests/Unexpected%20code%20Response%7Bprotocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositories%7B%22values%22:%20[],%20%22pagelen%22:%2010,%20%22size%22:%200,%20%22page%22:%201%7D/pullrequests/Unexpected%20code%20Response%7Bprotocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositoriesUnexpected%20code%20Response%7Bprotocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositorieshi!/pullrequests?state=}/pullrequests/Unexpected%20code%20Response{protocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositorieshi!/pullrequests?state=}}/approve}/approve}");
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        // during test generation this statement threw an exception of type NullPointerException in error
        String str2 = GitOperations.decline("", "Unexpected code Response{protocol=h2, code=404, message=, url=https://api.bitbucket.org/2.0/repositorieshi!/pullrequests?state=}");
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        // during test generation this statement threw an exception of type NullPointerException in error
        String str2 = GitOperations.approve("Unexpected code Response{protocol=h2, code=404, message=, url=https://api.bitbucket.org/2.0/repositories/pullrequests/hi!/approve}", "Unexpected code Response{protocol=h2, code=404, message=, url=https://api.bitbucket.org/2.0/repositoriesUnexpected%20code%20Response%7Bprotocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositoriesUnexpected%20code%20Response%7Bprotocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositorieshi!/pullrequests?state=}/pullrequests?state=Unexpected%20code%20Response{protocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositorieshi!/pullrequests?state=}}/pullrequests?state=Unexpected%20code%20Response{protocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositories%7B%22values%22:%20[],%20%22pagelen%22:%2010,%20%22size%22:%200,%20%22page%22:%201%7D/pullrequests?state={%22values%22:%20[],%20%22pagelen%22:%2010,%20%22size%22:%200,%20%22page%22:%201}}}");
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        // during test generation this statement threw an exception of type NullPointerException in error
        String str2 = GitOperations.decline("Unexpected code Response{protocol=h2, code=404, message=, url=https://api.bitbucket.org/2.0/repositoriesUnexpected%20code%20Response%7Bprotocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositorieshi!/pullrequests?state=}/pullrequests?state=Unexpected%20code%20Response{protocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositorieshi!/pullrequests?state=}}", "Unexpected code Response{protocol=h2, code=404, message=, url=https://api.bitbucket.org/2.0/repositoriesUnexpected%20code%20Response%7Bprotocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositorieshi!/pullrequests?state=}/pullrequests/Unexpected%20code%20Response{protocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositorieshi!/pullrequests?state=}}");
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        // during test generation this statement threw an exception of type NullPointerException in error
        String str2 = GitOperations.approve("Unexpected code Response{protocol=h2, code=404, message=, url=https://api.bitbucket.org/2.0/repositoriesUnexpected%20code%20Response%7Bprotocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositoriesUnexpected%20code%20Response%7Bprotocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositorieshi!/pullrequests?state=}/pullrequests/Unexpected%20code%20Response{protocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositorieshi!/pullrequests?state=}}/pullrequests/Unexpected%20code%20Response{protocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositories/pullrequests/hi!/approve}/approve}", "Unexpected code Response{protocol=h2, code=404, message=, url=https://api.bitbucket.org/2.0/repositories%7B%22values%22:%20[],%20%22pagelen%22:%2010,%20%22size%22:%200,%20%22page%22:%201%7D/pullrequests?state={%22values%22:%20[],%20%22pagelen%22:%2010,%20%22size%22:%200,%20%22page%22:%201}}");
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        // during test generation this statement threw an exception of type NullPointerException in error
        String str2 = GitOperations.approve("Unexpected code Response{protocol=h2, code=404, message=, url=https://api.bitbucket.org/2.0/repositories%7B%22values%22:%20[],%20%22pagelen%22:%2010,%20%22size%22:%200,%20%22page%22:%201%7D/pullrequests?state={%22values%22:%20[],%20%22pagelen%22:%2010,%20%22size%22:%200,%20%22page%22:%201}}", "Unexpected code Response{protocol=h2, code=404, message=, url=https://api.bitbucket.org/2.0/repositories%7B%22values%22:%20[],%20%22pagelen%22:%2010,%20%22size%22:%200,%20%22page%22:%201%7D/pullrequests/%7B%22values%22:%20[],%20%22pagelen%22:%2010,%20%22size%22:%200,%20%22page%22:%201%7D/approve}");
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        // during test generation this statement threw an exception of type NullPointerException in error
        String str2 = GitOperations.approve("hi!", "Unexpected code Response{protocol=h2, code=404, message=, url=https://api.bitbucket.org/2.0/repositorieshi!/pullrequests?state=}");
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        // during test generation this statement threw an exception of type NullPointerException in error
        String str2 = GitOperations.decline("Unexpected code Response{protocol=h2, code=404, message=, url=https://api.bitbucket.org/2.0/repositoriesUnexpected%20code%20Response%7Bprotocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositoriesUnexpected%20code%20Response%7Bprotocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositorieshi!/pullrequests?state=}/pullrequests/Unexpected%20code%20Response{protocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositorieshi!/pullrequests?state=}}/pullrequests/{%22values%22:%20[],%20%22pagelen%22:%2010,%20%22size%22:%200,%20%22page%22:%201}/approve}", "{\"values\": [], \"pagelen\": 10, \"size\": 0, \"page\": 1}");
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        // during test generation this statement threw an exception of type NullPointerException in error
        String str2 = GitOperations.decline("Unexpected code Response{protocol=h2, code=404, message=, url=https://api.bitbucket.org/2.0/repositorieshi!/pullrequests?state=}", "Unexpected code Response{protocol=h2, code=404, message=, url=https://api.bitbucket.org/2.0/repositoriesUnexpected%20code%20Response%7Bprotocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositorieshi!/pullrequests/Unexpected%20code%20Response%7Bprotocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositorieshi!/pullrequests?state=}}/pullrequests?state=Unexpected%20code%20Response{protocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositoriesUnexpected%20code%20Response%7Bprotocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositorieshi!/pullrequests?state=}/pullrequests/Unexpected%20code%20Response{protocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositories%7B%22values%22:%20[],%20%22pagelen%22:%2010,%20%22size%22:%200,%20%22page%22:%201%7D/pullrequests?state={%22values%22:%20[],%20%22pagelen%22:%2010,%20%22size%22:%200,%20%22page%22:%201}}/approve}}");
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        // during test generation this statement threw an exception of type NullPointerException in error
        String str2 = GitOperations.decline("Unexpected code Response{protocol=h2, code=404, message=, url=https://api.bitbucket.org/2.0/repositoriesUnexpected%20code%20Response%7Bprotocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositorieshi!/pullrequests/Unexpected%20code%20Response%7Bprotocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositorieshi!/pullrequests?state=}}/pullrequests?state=Unexpected%20code%20Response{protocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositoriesUnexpected%20code%20Response%7Bprotocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositorieshi!/pullrequests?state=}/pullrequests/Unexpected%20code%20Response{protocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositories%7B%22values%22:%20[],%20%22pagelen%22:%2010,%20%22size%22:%200,%20%22page%22:%201%7D/pullrequests?state={%22values%22:%20[],%20%22pagelen%22:%2010,%20%22size%22:%200,%20%22page%22:%201}}/approve}}", "Unexpected code Response{protocol=h2, code=404, message=, url=https://api.bitbucket.org/2.0/repositories%7B%22values%22:%20[],%20%22pagelen%22:%2010,%20%22size%22:%200,%20%22page%22:%201%7D/pullrequests/Unexpected%20code%20Response%7Bprotocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositoriesUnexpected%20code%20Response%7Bprotocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositoriesUnexpected%20code%20Response%7Bprotocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositorieshi!/pullrequests?state=}/pullrequests/Unexpected%20code%20Response{protocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositorieshi!/pullrequests?state=}}/pullrequests/Unexpected%20code%20Response{protocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositories/pullrequests/hi!/approve}/approve}}");
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        // during test generation this statement threw an exception of type NullPointerException in error
        String str2 = GitOperations.approve("Unexpected code Response{protocol=h2, code=404, message=, url=https://api.bitbucket.org/2.0/repositoriesUnexpected%20code%20Response%7Bprotocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositoriesUnexpected%20code%20Response%7Bprotocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositorieshi!/pullrequests?state=}/pullrequests/Unexpected%20code%20Response{protocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositorieshi!/pullrequests?state=}}/pullrequests/{%22values%22:%20[],%20%22pagelen%22:%2010,%20%22size%22:%200,%20%22page%22:%201}/approve}", "Unexpected code Response{protocol=h2, code=404, message=, url=https://api.bitbucket.org/2.0/repositoriesUnexpected%20code%20Response%7Bprotocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositories/pullrequests/hi!/approve%7D/pullrequests/Unexpected%20code%20Response%7Bprotocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositoriesUnexpected%20code%20Response%7Bprotocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositorieshi!/pullrequests?state=}/pullrequests/Unexpected%20code%20Response{protocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositories%7B%22values%22:%20[],%20%22pagelen%22:%2010,%20%22size%22:%200,%20%22page%22:%201%7D/pullrequests?state={%22values%22:%20[],%20%22pagelen%22:%2010,%20%22size%22:%200,%20%22page%22:%201}}/approve}/approve}");
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        // during test generation this statement threw an exception of type NullPointerException in error
        String str2 = GitOperations.approve("Unexpected code Response{protocol=h2, code=404, message=, url=https://api.bitbucket.org/2.0/repositories/pullrequests/hi!/approve}", "Unexpected code Response{protocol=h2, code=404, message=, url=https://api.bitbucket.org/2.0/repositoriesUnexpected%20code%20Response%7Bprotocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositories%7B%22values%22:%20[],%20%22pagelen%22:%2010,%20%22size%22:%200,%20%22page%22:%201%7D/pullrequests?state={%22values%22:%20[],%20%22pagelen%22:%2010,%20%22size%22:%200,%20%22page%22:%201}}/pullrequests/Unexpected%20code%20Response{protocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositorieshi!/pullrequests?state=}/approve}");
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        // during test generation this statement threw an exception of type NullPointerException in error
        String str2 = GitOperations.approve("Unexpected code Response{protocol=h2, code=404, message=, url=https://api.bitbucket.org/2.0/repositoriesUnexpected%20code%20Response%7Bprotocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositorieshi!/pullrequests/Unexpected%20code%20Response%7Bprotocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositorieshi!/pullrequests?state=}}/pullrequests?state=Unexpected%20code%20Response{protocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositoriesUnexpected%20code%20Response%7Bprotocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositorieshi!/pullrequests?state=}/pullrequests/Unexpected%20code%20Response{protocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositories%7B%22values%22:%20[],%20%22pagelen%22:%2010,%20%22size%22:%200,%20%22page%22:%201%7D/pullrequests?state={%22values%22:%20[],%20%22pagelen%22:%2010,%20%22size%22:%200,%20%22page%22:%201}}/approve}}", "Unexpected code Response{protocol=h2, code=404, message=, url=https://api.bitbucket.org/2.0/repositories%7B%22values%22:%20[],%20%22pagelen%22:%2010,%20%22size%22:%200,%20%22page%22:%201%7D/pullrequests/%7B%22values%22:%20[],%20%22pagelen%22:%2010,%20%22size%22:%200,%20%22page%22:%201%7D/approve}");
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        // during test generation this statement threw an exception of type NullPointerException in error
        String str2 = GitOperations.decline("Unexpected code Response{protocol=h2, code=404, message=, url=https://api.bitbucket.org/2.0/repositories%7B%22values%22:%20[],%20%22pagelen%22:%2010,%20%22size%22:%200,%20%22page%22:%201%7D/pullrequests/%7B%22values%22:%20[],%20%22pagelen%22:%2010,%20%22size%22:%200,%20%22page%22:%201%7D/approve}", "Unexpected code Response{protocol=h2, code=404, message=, url=https://api.bitbucket.org/2.0/repositories/pullrequests/hi!/approve}");
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        // during test generation this statement threw an exception of type NullPointerException in error
        String str2 = GitOperations.decline("Unexpected code Response{protocol=h2, code=404, message=, url=https://api.bitbucket.org/2.0/repositories%7B%22values%22:%20[],%20%22pagelen%22:%2010,%20%22size%22:%200,%20%22page%22:%201%7D/pullrequests/Unexpected%20code%20Response%7Bprotocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositoriesUnexpected%20code%20Response%7Bprotocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositoriesUnexpected%20code%20Response%7Bprotocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositorieshi!/pullrequests?state=}/pullrequests/Unexpected%20code%20Response{protocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositorieshi!/pullrequests?state=}}/pullrequests/Unexpected%20code%20Response{protocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositories/pullrequests/hi!/approve}/approve}}", "Unexpected code Response{protocol=h2, code=404, message=, url=https://api.bitbucket.org/2.0/repositoriesUnexpected%20code%20Response%7Bprotocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositorieshi!/pullrequests?state=}/pullrequests/Unexpected%20code%20Response{protocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositorieshi!/pullrequests?state=}}");
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        // during test generation this statement threw an exception of type NullPointerException in error
        String str2 = GitOperations.decline("Unexpected code Response{protocol=h2, code=404, message=, url=https://api.bitbucket.org/2.0/repositoriesUnexpected%20code%20Response%7Bprotocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositorieshi!/pullrequests?state=}/pullrequests/Unexpected%20code%20Response{protocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositorieshi!/pullrequests?state=}}", "Unexpected code Response{protocol=h2, code=404, message=, url=https://api.bitbucket.org/2.0/repositoriesUnexpected%20code%20Response%7Bprotocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositories/pullrequests/hi!/approve%7D/pullrequests/Unexpected%20code%20Response%7Bprotocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositoriesUnexpected%20code%20Response%7Bprotocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositorieshi!/pullrequests?state=}/pullrequests/Unexpected%20code%20Response{protocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositories%7B%22values%22:%20[],%20%22pagelen%22:%2010,%20%22size%22:%200,%20%22page%22:%201%7D/pullrequests?state={%22values%22:%20[],%20%22pagelen%22:%2010,%20%22size%22:%200,%20%22page%22:%201}}/approve}/approve}");
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        // during test generation this statement threw an exception of type NullPointerException in error
        String str2 = GitOperations.approve("Unexpected code Response{protocol=h2, code=404, message=, url=https://api.bitbucket.org/2.0/repositoriesUnexpected%20code%20Response%7Bprotocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositories/pullrequests/hi!/approve%7D/pullrequests/Unexpected%20code%20Response%7Bprotocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositoriesUnexpected%20code%20Response%7Bprotocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositorieshi!/pullrequests?state=}/pullrequests/Unexpected%20code%20Response{protocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositories%7B%22values%22:%20[],%20%22pagelen%22:%2010,%20%22size%22:%200,%20%22page%22:%201%7D/pullrequests?state={%22values%22:%20[],%20%22pagelen%22:%2010,%20%22size%22:%200,%20%22page%22:%201}}/approve}/approve}", "Unexpected code Response{protocol=h2, code=404, message=, url=https://api.bitbucket.org/2.0/repositoriesUnexpected%20code%20Response%7Bprotocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositorieshi!/pullrequests?state=}/pullrequests/Unexpected%20code%20Response{protocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositories%7B%22values%22:%20[],%20%22pagelen%22:%2010,%20%22size%22:%200,%20%22page%22:%201%7D/pullrequests?state={%22values%22:%20[],%20%22pagelen%22:%2010,%20%22size%22:%200,%20%22page%22:%201}}/approve}");
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        // during test generation this statement threw an exception of type NullPointerException in error
        String str2 = GitOperations.decline("", "Unexpected code Response{protocol=h2, code=404, message=, url=https://api.bitbucket.org/2.0/repositoriesUnexpected%20code%20Response%7Bprotocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositories/pullrequests/hi!/approve%7D/pullrequests/Unexpected%20code%20Response%7Bprotocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositoriesUnexpected%20code%20Response%7Bprotocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositorieshi!/pullrequests?state=}/pullrequests/Unexpected%20code%20Response{protocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositories%7B%22values%22:%20[],%20%22pagelen%22:%2010,%20%22size%22:%200,%20%22page%22:%201%7D/pullrequests?state={%22values%22:%20[],%20%22pagelen%22:%2010,%20%22size%22:%200,%20%22page%22:%201}}/approve}/approve}");
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        // during test generation this statement threw an exception of type NullPointerException in error
        String str2 = GitOperations.approve("", "Unexpected code Response{protocol=h2, code=404, message=, url=https://api.bitbucket.org/2.0/repositoriesUnexpected%20code%20Response%7Bprotocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositories%7B%22values%22:%20[],%20%22pagelen%22:%2010,%20%22size%22:%200,%20%22page%22:%201%7D/pullrequests/%7B%22values%22:%20[],%20%22pagelen%22:%2010,%20%22size%22:%200,%20%22page%22:%201%7D/approve%7D/pullrequests?state=Unexpected%20code%20Response{protocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositoriesUnexpected%20code%20Response%7Bprotocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositories/pullrequests/hi!/approve%7D/pullrequests/Unexpected%20code%20Response%7Bprotocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositorieshi!/pullrequests?state=}}}");
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        // during test generation this statement threw an exception of type NullPointerException in error
        String str2 = GitOperations.decline("Unexpected code Response{protocol=h2, code=404, message=, url=https://api.bitbucket.org/2.0/repositoriesUnexpected%20code%20Response%7Bprotocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositorieshi!/pullrequests/Unexpected%20code%20Response%7Bprotocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositorieshi!/pullrequests?state=}}/pullrequests?state=Unexpected%20code%20Response{protocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositoriesUnexpected%20code%20Response%7Bprotocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositorieshi!/pullrequests?state=}/pullrequests/Unexpected%20code%20Response{protocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositories%7B%22values%22:%20[],%20%22pagelen%22:%2010,%20%22size%22:%200,%20%22page%22:%201%7D/pullrequests?state={%22values%22:%20[],%20%22pagelen%22:%2010,%20%22size%22:%200,%20%22page%22:%201}}/approve}}", "Unexpected code Response{protocol=h2, code=404, message=, url=https://api.bitbucket.org/2.0/repositoriesUnexpected%20code%20Response%7Bprotocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositories%7B%22values%22:%20[],%20%22pagelen%22:%2010,%20%22size%22:%200,%20%22page%22:%201%7D/pullrequests/Unexpected%20code%20Response%7Bprotocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositoriesUnexpected%20code%20Response%7Bprotocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositorieshi!/pullrequests?state=}/pullrequests/Unexpected%20code%20Response{protocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositorieshi!/pullrequests?state=}}/approve}/pullrequests/Unexpected%20code%20Response{protocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositorieshi!/pullrequests?state=}}");
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        // during test generation this statement threw an exception of type NullPointerException in error
        String str2 = GitOperations.decline("", "Unexpected code Response{protocol=h2, code=404, message=, url=https://api.bitbucket.org/2.0/repositories%7B%22values%22:%20[],%20%22pagelen%22:%2010,%20%22size%22:%200,%20%22page%22:%201%7D/pullrequests/%7B%22values%22:%20[],%20%22pagelen%22:%2010,%20%22size%22:%200,%20%22page%22:%201%7D/approve}");
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        // during test generation this statement threw an exception of type NullPointerException in error
        String str2 = GitOperations.approve("Unexpected code Response{protocol=h2, code=404, message=, url=https://api.bitbucket.org/2.0/repositories%7B%22values%22:%20[],%20%22pagelen%22:%2010,%20%22size%22:%200,%20%22page%22:%201%7D/pullrequests?state={%22values%22:%20[],%20%22pagelen%22:%2010,%20%22size%22:%200,%20%22page%22:%201}}", "hi!");
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        // during test generation this statement threw an exception of type NullPointerException in error
        String str2 = GitOperations.decline("Unexpected code Response{protocol=h2, code=404, message=, url=https://api.bitbucket.org/2.0/repositories/pullrequests/hi!/approve}", "Unexpected code Response{protocol=h2, code=404, message=, url=https://api.bitbucket.org/2.0/repositories%7B%22values%22:%20[],%20%22pagelen%22:%2010,%20%22size%22:%200,%20%22page%22:%201%7D/pullrequests?state={%22values%22:%20[],%20%22pagelen%22:%2010,%20%22size%22:%200,%20%22page%22:%201}}");
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        // during test generation this statement threw an exception of type NullPointerException in error
        String str2 = GitOperations.approve("Unexpected code Response{protocol=h2, code=404, message=, url=https://api.bitbucket.org/2.0/repositorieshi!/pullrequests?state=}", "Unexpected code Response{protocol=h2, code=404, message=, url=https://api.bitbucket.org/2.0/repositories%7B%22values%22:%20[],%20%22pagelen%22:%2010,%20%22size%22:%200,%20%22page%22:%201%7D/pullrequests/%7B%22values%22:%20[],%20%22pagelen%22:%2010,%20%22size%22:%200,%20%22page%22:%201%7D/approve}");
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        // during test generation this statement threw an exception of type NullPointerException in error
        String str2 = GitOperations.approve("", "Unexpected code Response{protocol=h2, code=404, message=, url=https://api.bitbucket.org/2.0/repositoriesUnexpected%20code%20Response%7Bprotocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositorieshi!/pullrequests/Unexpected%20code%20Response%7Bprotocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositorieshi!/pullrequests?state=}}/pullrequests/Unexpected%20code%20Response{protocol=h2,%20code=404,%20message=,%20url=https://api.bitbucket.org/2.0/repositorieshi!/pullrequests?state=}}");
    }

}
