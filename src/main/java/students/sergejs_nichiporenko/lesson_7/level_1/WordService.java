package students.sergejs_nichiporenko.lesson_7.level_1;

public class WordService {
    public String findMostFrequentWord(String text) {
        int count;
        int maxCount = 0;
        String[] words = getWordsFromString(text);
        String word = "";
        for (String w : words) {
            count = 1;
            for (String value : words) {
                if (w.equals(value)) {
                    count++;
                }
                if (count > maxCount) {
                    maxCount = count;
                    word = w;
                }
            }

        }
        return word;

    }

    private String[] getWordsFromString(String text) {
        String[] words = text.split("\\s+");
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].replaceAll("\\P{L}+", "").toLowerCase();
        }
        return words;
    }

    public void printMostFrequentWord(String text) {
        System.out.println("The most frequent word is: " + findMostFrequentWord(text));
    }
}
