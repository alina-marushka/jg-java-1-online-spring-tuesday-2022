package students.deniss_mirosnikovs.lesson_4.level_4;

class CalculatorTest {

    public static void main(String[] args) {

        CalculatorTest calculatorTest = new CalculatorTest();

        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.mulTest();
        calculatorTest.divTest();

        calculatorTest.isEvanTest();
        calculatorTest.isNotEvanTest();

        calculatorTest.firstOfTwoNumberMaxTest();
        calculatorTest.secondOfTwoNumberMaxTest();
        calculatorTest.bothOfTwoNumbersAreEqualTest();

        calculatorTest.firstOfThreeNumbersMaxTest();
        calculatorTest.secondOfThreeNumbersMaxTest();
        calculatorTest.thirdOfThreeNumbersMaxTest();
        calculatorTest.firstEqualOfThreeNumbersMaxTest();
        calculatorTest.secondEqualOfThreeNumbersMaxTest();
        calculatorTest.thirdEqualOfThreeNumbersMaxTest();
        calculatorTest.allEqualOfThreeNumbersMaxTest();
    }

    public void sumTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 15;

        Calculator calculator = new Calculator();
        int realResult = calculator.sum(firstNumber, secondNumber);

        if (realResult == expectedResult) {
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }

    public void subTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 5;

        Calculator calculator = new Calculator();
        int realResult = calculator.sub(firstNumber, secondNumber);

        if (realResult == expectedResult) {
            System.out.println("Sub test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }

    public void mulTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 50;

        Calculator calculator = new Calculator();
        int realResult = calculator.mul(firstNumber, secondNumber);

        if (realResult == expectedResult) {
            System.out.println("Mul test = OK");
        } else {
            System.out.println("Mul test = FAIL");
        }
    }

    public void divTest() {
        double firstNumber = 10;
        double secondNumber = 5;
        double expectedResult = 2.0;

        Calculator calculator = new Calculator();
        double realResult = calculator.div(firstNumber, secondNumber);

        if (realResult == expectedResult) {
            System.out.println("Div test = OK");
        } else {
            System.out.println("Div test = FAIL");
        }
    }

    public void isEvanTest() {
        int number = 10;
        boolean expectedResult = true;

        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(number);

        if (realResult == expectedResult) {
            System.out.println("isEven test = OK");
        } else {
            System.out.println("isEven test = FAIL");
        }
    }

    public void isNotEvanTest() {
        int number = 9;
        boolean expectedResult = false;

        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(number);

        if (realResult == expectedResult) {
            System.out.println("isNotEven test = OK");
        } else {
            System.out.println("isNotEven test = FAIL");
        }
    }

    public void firstOfTwoNumberMaxTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 10;

        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);

        if (realResult == expectedResult) {
            System.out.println("First number is max (maxOfTwoNumbers) test = OK");
        } else {
            System.out.println("First number is max (maxOfTwoNumbers) test = FAIL");
        }
    }

    public void secondOfTwoNumberMaxTest() {
        int firstNumber = 5;
        int secondNumber = 10;
        int expectedResult = 10;

        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);

        if (realResult == expectedResult) {
            System.out.println("Second number is max (maxOfTwoNumbers) test = OK");
        } else {
            System.out.println("Second number is max (maxOfTwoNumbers) test = FAIL");
        }
    }

    public void bothOfTwoNumbersAreEqualTest() {
        int firstNumber = 10;
        int secondNumber = 10;
        int expectedResult = 10;

        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);

        if (realResult == expectedResult) {
            System.out.println("Both numbers are equal (maxOfTwoNumbers) test = OK");
        } else {
            System.out.println("Both numbers are equal (maxOfTwoNumbers) test = FAIL");
        }
    }

    public void firstOfThreeNumbersMaxTest() {
        int firstNumber = 30;
        int secondNumber = 20;
        int thirdNumber = 10;
        int expectedResult = 30;

        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);

        if (realResult == expectedResult) {
            System.out.println("First number is max (maxOfThreeNumbers) test = OK");
        } else {
            System.out.println("First number is max (maxOfThreeNumbers) test = FAIL");
        }
    }

    public void secondOfThreeNumbersMaxTest() {
        int firstNumber = 10;
        int secondNumber = 30;
        int thirdNumber = 20;
        int expectedResult = 30;

        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);

        if (realResult == expectedResult) {
            System.out.println("Second number is max (maxOfThreeNumbers) test = OK");
        } else {
            System.out.println("Second number is max (maxOfThreeNumbers) test = FAIL");
        }
    }

    public void thirdOfThreeNumbersMaxTest() {
        int firstNumber = 10;
        int secondNumber = 20;
        int thirdNumber = 30;
        int expectedResult = 30;

        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);

        if (realResult == expectedResult) {
            System.out.println("Third number is max (maxOfThreeNumbers) test = OK");
        } else {
            System.out.println("Third number is max (maxOfThreeNumbers) test = FAIL");
        }
    }

    public void firstEqualOfThreeNumbersMaxTest() {
        int firstNumber = 30;
        int secondNumber = 30;
        int thirdNumber = 10;
        int expectedResult = 30;

        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);

        if (realResult == expectedResult) {
            System.out.println("First and second numbers are equal (maxOfThreeNumbers) test = OK");
        } else {
            System.out.println("First and second numbers are equal (maxOfThreeNumbers) test = FAIL");
        }
    }

    public void secondEqualOfThreeNumbersMaxTest() {
        int firstNumber = 10;
        int secondNumber = 30;
        int thirdNumber = 30;
        int expectedResult = 30;

        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);

        if (realResult == expectedResult) {
            System.out.println("Second and third numbers are equal (maxOfThreeNumbers) test = OK");
        } else {
            System.out.println("Second and third numbers are equal (maxOfThreeNumbers) test = FAIL");
        }
    }

    public void thirdEqualOfThreeNumbersMaxTest() {
        int firstNumber = 30;
        int secondNumber = 10;
        int thirdNumber = 30;
        int expectedResult = 30;

        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);

        if (realResult == expectedResult) {
            System.out.println("First and third numbers are equal (maxOfThreeNumbers) test = OK");
        } else {
            System.out.println("First and third numbers are equal (maxOfThreeNumbers) test = FAIL");
        }
    }

    public void allEqualOfThreeNumbersMaxTest() {
        int firstNumber = 30;
        int secondNumber = 30;
        int thirdNumber = 30;
        int expectedResult = 30;

        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);

        if (realResult == expectedResult) {
            System.out.println("Three numbers are equal (maxOfThreeNumbers) test = OK");
        } else {
            System.out.println("Three numbers are equal (maxOfThreeNumbers) test = FAIL");
        }
    }
}
