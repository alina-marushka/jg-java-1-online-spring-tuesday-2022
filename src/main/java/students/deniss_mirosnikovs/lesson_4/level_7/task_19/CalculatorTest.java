package students.deniss_mirosnikovs.lesson_4.level_7.task_19;

class CalculatorTest {
    public static void main(String[] args) {

        CalculatorTest calculatorTest = new CalculatorTest();

        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.mulTest();
        calculatorTest.divTest();
        calculatorTest.isEvenTest();
    }

    public void sumTest() {
        Calculator calculator = new Calculator();
        int result = calculator.sum(35, 40);

        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.resultChecker("Sum", result, 75);
    }

    public void subTest() {
        Calculator calculator = new Calculator();
        int result = calculator.sub(35, 15);

        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.resultChecker("Sub", result, 20);
    }

    public void mulTest() {
        Calculator calculator = new Calculator();
        int result = calculator.mul(5, 5);

        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.resultChecker("Mul", result, 25);
    }

    public void divTest() {
        Calculator calculator = new Calculator();
        int result = calculator.div(40, 8);

        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.resultChecker("Div", result, 5);
    }

    public void isEvenTest() {
        Calculator calculator = new Calculator();
        boolean result1 = calculator.isEven(40);
        boolean result2 = calculator.isEven(41);

        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.boolResultChecker("isEven1", result1, true);
        calculatorTest.boolResultChecker("isEven2", result2, false);
    }

    public void resultChecker(String TestName, int result, int expectedResult) {

        if (result == expectedResult) {
            System.out.println(TestName + " test = OK");
        } else {
            System.out.println(TestName + " test = FAIL");
        }
    }

    public void boolResultChecker(String TestName, boolean result, boolean expectedResult) {

        if (result == expectedResult) {
            System.out.println(TestName + " test = OK");
        } else {
            System.out.println(TestName + " test = FAIL");
        }
    }
}
