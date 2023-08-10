package test.pkb;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    
    public static void main(String[] args) throws Exception {
        TextSearch search = new TextSearch();
        System.out.println(search.findLongestEvenWord("Sample text to find looongestt ve&^", false));
    }
}
