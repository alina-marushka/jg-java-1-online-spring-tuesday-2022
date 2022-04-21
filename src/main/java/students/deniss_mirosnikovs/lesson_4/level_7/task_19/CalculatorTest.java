package students.deniss_mirosnikovs.lesson_4.level_7.task_19;

class CalculatorTest {

    Calculator calculator = new Calculator();

    public static void main(String[] args) {

        CalculatorTest calculatorTest = new CalculatorTest();

        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.mulTest();
        calculatorTest.divTest();
        calculatorTest.isEvenTest();
    }

    public void sumTest() {
        int result = calculator.sum(35, 40);
        assertThatEqual("Sum", result, 75);
    }

    public void subTest() {
        int result = calculator.sub(35, 15);
        assertThatEqual("Sub", result, 20);
    }

    public void mulTest() {
        int result = calculator.mul(5, 5);
        assertThatEqual("Mul", result, 25);
    }

    public void divTest() {
        int result = calculator.div(40, 8);
        assertThatEqual("Div", result, 5);
    }

    public void isEvenTest() {
        boolean result1 = calculator.isEven(40);
        boolean result2 = calculator.isEven(41);

        assertThatEqual("isEven", result1, true);
        assertThatEqual("isNotEven", result2, false);
    }

    public void assertThatEqual(String TestName, int result, int expectedResult) {

        if (result == expectedResult) {
            System.out.println(TestName + " test = OK");
        } else {
            System.out.println(TestName + " test = FAIL");
        }
    }

    public void assertThatEqual(String TestName, boolean result, boolean expectedResult) {

        if (result == expectedResult) {
            System.out.println(TestName + " test = OK");
        } else {
            System.out.println(TestName + " test = FAIL");
        }
    }
}
