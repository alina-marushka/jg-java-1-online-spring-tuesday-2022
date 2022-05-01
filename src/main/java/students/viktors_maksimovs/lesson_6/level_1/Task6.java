package students.viktors_maksimovs.lesson_6.level_1;


class NumberUtils {

    public boolean isEven(int number) {
        return number % 2 == 0;
    }

}

class NumberTester{
    public static void main(String[] args) {
        NumberTester test = new NumberTester();
        test.evenNumber();
        test.evenNumberOne();
        test.oddNumber();
        test.oddNumberOne();



    }

    public void evenNumber() {
        NumberUtils number = new NumberUtils();
        boolean actual = number.isEven(2);
        assertThatEqual(true, actual, "2 is even number");
    }

    public void evenNumberOne() {
        NumberUtils number = new NumberUtils();
        boolean actual = number.isEven(-20);
        assertThatEqual(true, actual, "-20 is even number");
    }

    public void oddNumber() {
        NumberUtils number = new NumberUtils();
        boolean actual = number.isEven(3);
        assertThatEqual(false, actual, "3 is not even number");
    }

    public void oddNumberOne() {
        NumberUtils number = new NumberUtils();
        boolean actual = number.isEven(-9);
        assertThatEqual(false, actual, "-9 is not even number");
    }




    void assertThatEqual(boolean expected, boolean actual, String scenario) {
        if (expected == actual) {
            System.out.println("[ OK ]: " + scenario + " - PASS!");
        } else {
            System.out.println("[FAIL]: " + scenario + " - FAIL!");
        }
    }
}