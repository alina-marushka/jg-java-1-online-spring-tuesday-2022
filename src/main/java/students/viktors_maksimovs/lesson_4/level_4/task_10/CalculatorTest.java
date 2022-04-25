package students.viktors_maksimovs.lesson_4.level_4.task_10;

class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.multTest();
        calculatorTest.divTest();
        calculatorTest.isEven();
        calculatorTest.isEvenTrue();
        calculatorTest.maxOfTwoNumbersTest();
        calculatorTest.maxOfThreeNumbersOne();
        calculatorTest.maxOfThreeNumbersTwo();
        calculatorTest.maxOfThreeNumbersThree();
        calculatorTest.maxOfThreeNumbersFour();
        calculatorTest.maxOfThreeNumbersFive();
        calculatorTest.maxOfThreeNumbersSix();
        calculatorTest.maxOfThreeNumbersSeven();
    }

    void sumTest() {
        int firstNumber = 10;  // подготавливаем тестовые данные
        int secondNumber = 5;  // подготавливаем тестовые данные
        int expectedResult = 15;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.sum(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }

    void subTest(){
        int firstNumber = 25;
        int secondNumber = 30;
        int exceptedResult = -5;
        Calculator calculator = new Calculator();
        int realResult = calculator.sub(firstNumber, secondNumber);
        if (realResult == exceptedResult) {
            System.out.println("Subtraction test = PASS");
        } else {
            System.out.println("Subtraction test = FAIL");
        }
    }

    void multTest() {
        int firstNumber = 3;
        int secondNumber = 6;
        int expectedResult = 18;
        Calculator calculator = new Calculator();
        int realResult = calculator.mult(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println(" Multiplication test = PASS");
        } else {
            System.out.println(" Multiplication test = FAIL");
        }

    }

    void divTest() {
        int firstNumber = 5;
        int secondNumber = 10;
        double expectedResult = 0.5;
        Calculator calculator = new Calculator();
        double realResult = calculator.div(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println(" Division test = PASS");
        } else {
            System.out.println(" Division test = FAIL");
        }

    }

    void isEven() {
        int firstNumber = 5;
        boolean expectedResult = false;
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(firstNumber);
        if (realResult == expectedResult) {
            System.out.println("Odd/Even False test = PASS");
        } else {
            System.out.println("Odd/Even False test = FAIL");
        }

    }

    void isEvenTrue() {
        int firstNumber = 4;
        boolean expectedResult = true;
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(firstNumber);
        if (realResult == expectedResult) {
            System.out.println("Odd/Even True test = PASS");
        } else {
            System.out.println("Odd/Even True test = FAIL");
        }
    }

    void maxOfTwoNumbersTest() {
        int firstNumber = 3;
        int secondNumber = 11;
        int expectedResult = 11;
        Calculator calculator = new Calculator();
        int realresult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realresult == expectedResult) {
            System.out.println("Max of 2 numbers test = PASS");
        } else {
            System.out.println("Max of 2 numbers test = FAIL");
        }
    }

    void maxOfThreeNumbersOne() {
        int firstNumber = 7;
        int secondNumber = 5;
        int thirdNumber = 6;
        int exceptedResult = 7;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == exceptedResult) {
            System.out.println("First number is biggest test = PASS");
        } else {
            System.out.println("First number is biggest test = FAIL");
        }
    }
    void maxOfThreeNumbersTwo() {
        int firstNumber = 7;
        int secondNumber = 9;
        int thirdNumber = 6;
        int exceptedResult = 9;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == exceptedResult) {
            System.out.println("Second number is biggest test = PASS");
        } else {
            System.out.println("Second number is biggest test = FAIL");
        }
    }
    void maxOfThreeNumbersThree() {
        int firstNumber = 7;
        int secondNumber = 5;
        int thirdNumber = 12;
        int exceptedResult = 12;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == exceptedResult) {
            System.out.println("Third number is biggest test = PASS");
        } else {
            System.out.println("Third number is biggest test = FAIL");
        }
    }

    void maxOfThreeNumbersFour() {
        int firstNumber = 7;
        int secondNumber = 7;
        int thirdNumber = 2;
        int exceptedResult = 7;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == exceptedResult) {
            System.out.println("First and second number are equal and > than third number test = PASS");
        } else {
            System.out.println("First and second number are equal and > than third number test = FAIL");
        }
    }
    void maxOfThreeNumbersFive() {
        int firstNumber = 2;
        int secondNumber = 1;
        int thirdNumber = 2;
        int exceptedResult = 2;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == exceptedResult) {
            System.out.println("First and third number are equal and > than second number test = PASS");
        } else {
            System.out.println("First and third number are equal and > than second number test = FAIL");
        }
    }
    void maxOfThreeNumbersSix() {
        int firstNumber = 2;
        int secondNumber = 7;
        int thirdNumber = 7;
        int exceptedResult = 7;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == exceptedResult) {
            System.out.println("Third and second number are equal and > than first number test = PASS");
        } else {
            System.out.println("Third and second number are equal and > than first number test = FAIL");
        }
    }
    void maxOfThreeNumbersSeven() {
        int firstNumber = 2;
        int secondNumber = 2;
        int thirdNumber = 2;
        int exceptedResult = 2;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == exceptedResult) {
            System.out.println("All numbers equal test = PASS");
        } else {
            System.out.println("All numbers equal test = FAIL");
        }
    }
}


