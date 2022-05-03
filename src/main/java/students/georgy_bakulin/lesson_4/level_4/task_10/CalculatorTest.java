package students.georgy_bakulin.lesson_4.level_4.task_10;

class CalculatorTest {

    public static void main(String[] args) {

        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.mulTest();
        calculatorTest.divTest();
        calculatorTest.isEvenTest();
        calculatorTest.isEvenTest2();
        calculatorTest.firstNumberBiggest();
        calculatorTest.secondNumberBiggest();
        calculatorTest.numbersAreEqual();
        calculatorTest.maxOfThreeNumbersFirst();
        calculatorTest.maxOfThreeNumbersSecond();
        calculatorTest.maxOfThreeNumbersThird();
        calculatorTest.maxOfThreeNumbersFourth();
        calculatorTest.maxOfThreeNumbersFifth();
        calculatorTest.maxOfThreeNumbersSixth();
        calculatorTest.maxOfThreeNumbersSeventh();
    }

    void sumTest() {
        int firstNumber = 5;  // подготавливаем тестовые данные
        int secondNumber = 5;  // подготавливаем тестовые данные
        int expectedResult = 10;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.sum(firstNumber, secondNumber);  // вызываем продакшн код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }

    void subTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 5;
        Calculator calculator = new Calculator();
        int realResult = calculator.sub(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Sub test = OK");
        } else {
            System.out.println("Sub test = FAIL");

        }
    }

    void mulTest() {
        int firstNumber = 12;
        int secondNumber = 5;
        int expectedResult = 60;
        Calculator calculator = new Calculator();
        int realResult = calculator.mul(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Mul test = OK");
        } else {
            System.out.println("Mul test = FAIL");

        }
    }

    void divTest() {
        int firstNumber = 16;
        int secondNumber = 5;
        double expectedResult = 3.1;
        Calculator calculator = new Calculator();
        double realResult = calculator.div(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Div test = OK");
        } else {
            System.out.println("Div test = FAIL");
        }
    }

    void isEvenTest() {
        int firstNumber = 9;
        boolean expectedResult = true;
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(firstNumber);
        if (realResult == expectedResult) {
            System.out.println("Even test = OK");
        } else {
            System.out.println("Even test = FAIL");
        }
    }

    void isEvenTest2() {
        int firstNumber = 12;
        boolean expectedResult = false;
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(firstNumber);
        if (realResult == expectedResult) {
            System.out.println("Even test = OK");
        } else {
            System.out.println("Even test = FAIL");
        }
    }

    void firstNumberBiggest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("First Number Biggest  test = OK");
        } else {
            System.out.println("First Number Biggest test = FAIL");
        }
    }

    void secondNumberBiggest() {
        int firstNumber = 5;
        int secondNumber = 10;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Second Number Biggest test = OK");
        } else {
            System.out.println("Second Number Biggest test = FAIL");
        }
    }

    void numbersAreEqual() {
        int firstNumber = 2;
        int secondNumber = 2;
        int expectedResult = 2;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Numbers are equal test = OK");
        } else {
            System.out.println("Numbers are equal test = FAIL");
        }
    }

    void maxOfThreeNumbersFirst() {
        int firstNumber = 10;
        int secondNumber = 5;
        int thirdNumber = 7;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("First number is biggest test = OK");
        } else {
            System.out.println("First number is biggest test = FAIL");
        }
    }

    void maxOfThreeNumbersSecond() {
        int firstNumber = 10;
        int secondNumber = 15;
        int thirdNumber = 7;
        int expectedResult = 15;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("Second  number is biggest test = OK");
        } else {
            System.out.println("Second  number is biggest test = FAIL");
        }
    }

    void maxOfThreeNumbersThird() {
        int firstNumber = 10;
        int secondNumber = 5;
        int thirdNumber = 15;
        int expectedResult = 15;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("Third number is biggest test = OK");
        } else {
            System.out.println("Third number is biggest test = FAIL");
        }
    }

    void maxOfThreeNumbersFourth() {
        int firstNumber = 10;
        int secondNumber = 10;
        int thirdNumber = 7;
        int expectedResult = 15;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("First and second number are biggest and equal test = OK");
        } else {
            System.out.println("First and second number are biggest and equal  test = FAIL");
        }
    }

    void maxOfThreeNumbersFifth() {
        int firstNumber = 10;
        int secondNumber = 5;
        int thirdNumber = 10;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("First and third number are biggest and equal test = OK");
        } else {
            System.out.println("First and third number are biggest and equal test = FAIL");
        }
    }

    void maxOfThreeNumbersSixth() {
        int firstNumber = 5;
        int secondNumber = 10;
        int thirdNumber = 10;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("Third and second  number are biggest and equal test = OK");
        } else {
            System.out.println("Third and second  number are biggest and equal test = FAIL");
        }
    }

    void maxOfThreeNumbersSeventh() {
        int firstNumber = 10;
        int secondNumber = 10;
        int thirdNumber = 10;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("All numbers are equal test = OK");
        } else {
            System.out.println("All numbers are equal test = FAIL");
        }
    }
}
