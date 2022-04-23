package students.viktors_maksimovs.lesson_4.level_7.task_17;

class FizzBuzzTest {

    public static void main (String[] args) {
        FizzBuzzTest fizzTest = new FizzBuzzTest();
        fizzTest.divOnThree();
        fizzTest.divOnFive();
        fizzTest.divOnThreeAndFive();
        fizzTest.divNotThreeAndFive();
        fizzTest.divNegThree();
        fizzTest.divNegFive();
        fizzTest.divNegThreeAndFive();
        fizzTest.divNotNegThreeAndFive();

    }

    void divOnThree() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.detect(3);
        assertThatEqual("Fizz", actual, "Number divides on 3");
    }

    void divOnFive() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.detect(5);
        assertThatEqual("Buzz", actual, "Number divides on 5");
    }

    void divOnThreeAndFive() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.detect(15);
        assertThatEqual("FizzBuzz", actual, "Number divides on 3 and 5");
    }

    void divNotThreeAndFive() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.detect(8);
        assertThatEqual("8", actual, "Number can't be divided by 3 or 5");
    }

    void divNegThree() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.detect(-9);
        assertThatEqual("Fizz", actual, "Number divides on 3");
    }

    void divNegFive() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.detect(-25);
        assertThatEqual("Buzz", actual, "Number divides on 5");
    }

    void divNegThreeAndFive() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.detect(-60);
        assertThatEqual("FizzBuzz", actual, "Number divides on 3 and 5");
    }

    void divNotNegThreeAndFive() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.detect(-16);
        assertThatEqual("-16", actual, "Number can't be divided by 3 or 5");
    }


    void assertThatEqual(String expected, String actual, String scenario) {
        if (expected.equals(actual)) {
            System.out.println("[ OK ]: " + scenario + " - PASS!");
        } else {
            System.out.println("[FAIL]: " + scenario + " - FAIL!");
        }
    }
}
