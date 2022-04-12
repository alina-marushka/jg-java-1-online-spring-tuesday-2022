package instructor.lesson_4.demo_10;

class QuickMathTest {

    public static void main(String[] args) {
        QuickMathTest testRunner = new QuickMathTest();

        testRunner.firstParameterIsMax();
        testRunner.secondParameterIsMax();
        testRunner.parametersAreEqual();
    }

    void firstParameterIsMax() {
        QuickMath subject = new QuickMath();

        int expected = 100;
        int actual = subject.max(100, 50);

        assertThatEqual(expected, actual, "First parameter is max");
    }

    void secondParameterIsMax() {
        QuickMath subject = new QuickMath();

        int expected = 60;
        int actual = subject.max(10, 60);

        assertThatEqual(expected, actual, "Second parameter is max");
    }

    void parametersAreEqual() {
        QuickMath subject = new QuickMath();

        int expected = 50;
        int actual = subject.max(50, 50);

        assertThatEqual(expected, actual, "Both params are equal");
    }

    void assertThatEqual(int expected, int actual, String scenario) {
        if (expected == actual) {
            System.out.println("[ OK ]: " + scenario + " passed!");
        } else {
            System.out.println("[FAIL]: " + scenario + " failed!");
        }
    }
}
