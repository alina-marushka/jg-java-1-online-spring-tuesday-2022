package students.deniss_mirosnikovs.lesson_4.level_7.task_17;

class FizzBuzzTest {

    public static void main(String[] args) {

        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        FizzBuzz fizzBuzz = new FizzBuzz();

        System.out.println(fizzBuzz.detect(3));
        System.out.println(fizzBuzz.detect(5));
        System.out.println(fizzBuzz.detect(15));
        System.out.println(fizzBuzz.detect(4));

        fizzBuzzTest.divOnThreeTest();
        fizzBuzzTest.divOnFiveTest();
        fizzBuzzTest.divOnThreeAndFiveTest();
        fizzBuzzTest.undividedTest();
    }

    public void divOnThreeTest() {
        String expectedResult = "Fizz";

        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.detect(6);

        if (realResult.equals(expectedResult)) {
            System.out.println("Division on three test = OK");
        } else {
            System.out.println("Division on three test = FAIL");
        }
    }

    public void divOnFiveTest() {
        String expectedResult = "Buzz";

        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.detect(10);

        if (realResult.equals(expectedResult)) {
            System.out.println("Division on five test = OK");
        } else {
            System.out.println("Division on five test = FAIL");
        }
    }

    public void divOnThreeAndFiveTest() {
        String expectedResult = "FizzBuzz";

        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.detect(15);

        if (realResult.equals(expectedResult)) {
            System.out.println("Division on three and five test = OK");
        } else {
            System.out.println("Division on three and five test = FAIL");
        }
    }

    public void undividedTest() {
        String expectedResult = "";

        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.detect(4);

        if (realResult.equals(expectedResult)) {
            System.out.println("Undivided on three and five test = OK");
        } else {
            System.out.println("Undivided on three and five test = FAIL");
        }
    }
}
