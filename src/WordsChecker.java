import java.util.HashSet;

public class WordsChecker{

    private String TEXT;
    private String[] words;
    private HashSet<String> text = new HashSet<>();
    public WordsChecker (String TEXT) {
        this.TEXT = TEXT;
        this.words = TEXT.split("\\P{IsAlphabetic}+");
    }

    public boolean hasWord (String word) {
        for (int i = 0; i < words.length; i++){
            text.add(words[i].toLowerCase());
        }

        if(text.contains(word.toLowerCase()))
            return true;
        return false;
    }
}
