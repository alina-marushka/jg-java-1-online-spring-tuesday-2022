package students.sergejs_nichiporenko.lesson_7.level_1;

public class WordServiceTest {
    WordService wordService = new WordService();
    String testText = "And I8 0 forget just + why I taste Oh yeah, I guess4 it makes oh me smile";

    public static void main(String[] args) {
        WordServiceTest test = new WordServiceTest();
        test.correctWord();
        test.wrongWord();
    }

    public void correctWord() {
        assertEquals(wordService.findMostFrequentWord(testText), "i");
    }

    public void wrongWord() {
        assertFalse(wordService.findMostFrequentWord(testText), "oh");
    }

    private void assertEquals(String actual, String expected) {
        if (actual.equals(expected)) {
            System.out.println("Test passed!");
        } else {
            System.out.println("Test failed!");
        }
    }

    private void assertFalse(String actual, String expected) {
        if (actual.equals(expected)) {
            System.out.println("Test failed!");
        } else {
            System.out.println("Test passed!");
        }
    }
}
