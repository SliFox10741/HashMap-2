import java.util.HashSet;

public class WordsChecker{

    private String[] words;
    private HashSet<String> text = new HashSet<>();
    public WordsChecker (String TEXT) {
        this.words = TEXT.split("\\P{IsAlphabetic}+");
    }

    public boolean hasWord (String word) {
        for (String s : words) {
            text.add(s.toLowerCase());
        }

        return text.contains(word.toLowerCase());
    }
}
