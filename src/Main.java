public class Main {
    public static void main(String[] args) {

        final String TEXT = "Lorem ipsum dolor sit amet, consectetur " +
                "adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna " +
                "aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris " +
                "nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit" +
                " in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint" +
                " occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit " +
                "anim id est laborum.";

        WordsChecker wordsChecker = new WordsChecker(TEXT.toLowerCase());

        String word = "Maxim";
        System.out.println(wordsChecker.hasWord(word));
        word = "LoReM";
        System.out.println(wordsChecker.hasWord(word));
    }

}