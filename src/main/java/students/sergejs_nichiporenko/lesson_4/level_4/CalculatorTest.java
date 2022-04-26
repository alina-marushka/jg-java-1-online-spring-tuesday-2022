package students.sergejs_nichiporenko.lesson_4.level_4;

class CalculatorTest {

    Calculator calculator = new Calculator();

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subtractionTest();
        calculatorTest.multiplicationTest();
        calculatorTest.divisionTest();
        calculatorTest.maxOfTwoNumbersTest();
    }

    public void sumTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 15;
        int realResult = calculator.sum(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }

    public void subtractionTest() {
        int firstNumber = 20;
        int secondNumber = 10;
        int expectedResult = 10;
        int realResult = calculator.subtraction(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Subtraction test = OK");
        } else {
            System.out.println("Subtraction test = FAIL");
        }
    }

    public void multiplicationTest() {
        int firstNumber = 5;
        int secondNumber = 8;
        int expectedResult = 40;
        int realResult = calculator.multiplication(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Multiplication test = OK");
        } else {
            System.out.println("Multiplication test = FAIL");
        }
    }

    public void divisionTest() {
        int firstNumber = 15;
        int secondNumber = 10;
        double expectedResult = 1.5;
        double realResult = calculator.division(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Division test = OK");
        } else {
            System.out.println("Division test = FAIL");
        }
    }

    public void maxOfTwoNumbersTest() {
        int firstNumberA = 4;
        int secondNumberA = 5;
        int expectedResultA = 5;
        int realResultA = calculator.maxOfTwoNumbers(firstNumberA, secondNumberA);

        int firstNumberB = 5;
        int secondNumberB = 5;
        int expectedResultB = 5;
        int realResultB = calculator.maxOfTwoNumbers(firstNumberB, secondNumberB);

        int firstNumberC = 5;
        int secondNumberC = 5;
        int expectedResultC = 5;
        int realResultC = calculator.maxOfTwoNumbers(firstNumberC, secondNumberC);

        if (expectedResultA == realResultA && expectedResultB == realResultB && expectedResultC == realResultC) {
            System.out.println("MaxOfTwoNumbersTest = OK");
        } else {
            System.out.println("MaxOfTwoNumbersTest = FAIL");
        }
    }
}
