package students.romans_bogomols.lesson_6.level_1.task_6;

class NumberUtilsTest {

    public static void main(String[] args) {

        NumberUtilsTest test = new NumberUtilsTest();
        test.isNumberEven();
        test.isNumberEven1();

    }

    NumberUtils numberUtils = new NumberUtils();

    void isNumberEven() {
        assertThatEqual(true, numberUtils.isEven(2), "Number even test ");
    }

    void isNumberEven1() {
        assertThatEqual(false, numberUtils.isEven(3), "Number odd test ");
    }

    void assertThatEqual(boolean expected, boolean actual, String scenario) {
        if (expected == actual) {
            System.out.println("[ OK ]: " + scenario + " passed!");
        } else {
            System.out.println("[FAIL]: " + scenario + " failed!");
        }
    }

}