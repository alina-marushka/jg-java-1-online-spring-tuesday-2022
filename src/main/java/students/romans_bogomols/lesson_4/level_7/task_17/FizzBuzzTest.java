package students.romans_bogomols.lesson_4.level_7.task_17;

class FizzBuzzTest {

    public static void main(String[] args) {
        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        fizzBuzzTest.numberMustBeDivisibleOnThree();
        fizzBuzzTest.numberMustBeDivisibleOnFive();
        fizzBuzzTest.numberMustBeDivisibleOnFiveAndOnThree();
        fizzBuzzTest.numberMustBeDivisibleOnThreeAndOnFive();
        fizzBuzzTest.numberMustBeDivisibleOnThreeOne();
        fizzBuzzTest.numberMustBeDivisibleOnFiveOne();
        fizzBuzzTest.numberMustBeDivisibleOnThreeAndOnFiveOne();
        fizzBuzzTest.numberMustNotBeDivisibleOnFiveAndOnThree();
        fizzBuzzTest.numberMustNotBeDivisibleOnFiveAndOnThreeOne();
    }
    void numberMustBeDivisibleOnThree() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.detect(3);
        assertThatEqual("Fizz",actual,"This number must be divisible on three");
    }
    void numberMustBeDivisibleOnFive() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.detect(5);
        assertThatEqual("Buzz", actual, "This number must be divisible on five");
    }
    void numberMustBeDivisibleOnThreeAndOnFive() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.detect(-30);
        assertThatEqual("FizzBuzz", actual, "This negative number must be divisible on three and five");
    }
    void numberMustBeDivisibleOnThreeOne() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.detect(-3);
        assertThatEqual("Fizz", actual, "This negative number must be divisible on three");
    }
    void numberMustBeDivisibleOnFiveOne() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.detect(-55);
        assertThatEqual("Buzz", actual, "This negative number must be divisible on five");
    }
    void numberMustBeDivisibleOnThreeAndOnFiveOne() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.detect(0);
        assertThatEqual("FizzBuzz", actual, "Zero must be divisible on 3 and 5-");
    }
    void numberMustBeDivisibleOnFiveAndOnThree() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.detect(15);
        assertThatEqual("FizzBuzz", actual, "This number must be divisible on 3 and 5");
    }
    void numberMustNotBeDivisibleOnFiveAndOnThree() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.detect(778);
        assertThatEqual("778", actual, "This number is not divisible on 3 and 5");
    }
    void numberMustNotBeDivisibleOnFiveAndOnThreeOne() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.detect(-13);
        assertThatEqual("-13", actual, "This negative number is not divisible on 3 and 5");
    }
    void assertThatEqual(String expected, String actual, String scenario) {
        if (expected.equals(actual)) {
            System.out.println("[ OK ]: " + scenario + " passed!");
        } else {
            System.out.println("[FAIL]: " + scenario + " failed!");
        }
    }
}
