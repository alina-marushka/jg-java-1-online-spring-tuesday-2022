package students.romans_bogomols.lesson_4.level_4.task_10;

class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.differenceTest();
        calculatorTest.multiplicationTest();
        calculatorTest.divisionTest();
        calculatorTest.differenceTestTwo();
        calculatorTest.isEvenTest();
        calculatorTest.isEvenTest1();
        calculatorTest.firstNumberGreatest();
        calculatorTest.secondNumberGreatest();
        calculatorTest.numberAreEquals();
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

    void differenceTest() {
        int firstNumber = 15;
        int secondNumber = 5;
        int exceptedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.difference(firstNumber, secondNumber);
        if (realResult == exceptedResult) {
            System.out.println("Difference test = OK");
        } else {
            System.out.println("Difference test = FAIL");
        }
    }

    void differenceTestTwo() {
        int firstNumber = 15;
        int secondNumber = 20;
        int exceptedResult = -5;
        Calculator calculator = new Calculator();
        int realResult = calculator.difference(firstNumber, secondNumber);
        if (realResult == exceptedResult) {
            System.out.println("Difference test = OK");
        } else {
            System.out.println("Difference test = FAIL");
        }
    }

    void multiplicationTest() {
        int firstNumber = 5;
        int secondNumber = 5;
        int exceptedResult = 25;
        Calculator calculator = new Calculator();
        int realResult = calculator.multiplication(firstNumber, secondNumber);
        if (realResult == exceptedResult) {
            System.out.println("Multiplication test = OK");
        } else {
            System.out.println("Multiplication test = FAIL");
        }
    }

    void divisionTest() {
        int firstNumber = 8;
        int secondNumber = 10;
        double exceptedResult = 0.8;
        Calculator calculator = new Calculator();
        double realResult = calculator.division(firstNumber, secondNumber);
        if (realResult == exceptedResult) {
            System.out.println("Division test = OK");
        } else {
            System.out.println("Division test = FAIL");
        }
    }

    void isEvenTest() {
        int firstNumber = 8;
        boolean exceptedResult = true;
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(firstNumber);
        if (realResult == exceptedResult) {
            System.out.println("Even test = OK");
        } else {
            System.out.println("Even test = FAIL");
        }
    }

    void isEvenTest1() {
        int firstNumber = 7;
        boolean exceptedResult = false;
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(firstNumber);
        if (realResult == exceptedResult) {
            System.out.println("Even test = OK");
        } else {
            System.out.println("Even test = FAIL");
        }
    }
    void firstNumberGreatest() {
        int firstNumber = 7;
        int secondNumber = 6;
        int exceptedResult = 7;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == exceptedResult) {
            System.out.println("First number greatest test = OK");
        } else {
            System.out.println("First number greatest test = FAIL");
        }

    }
    void secondNumberGreatest() {
        int firstNumber = 7;
        int secondNumber = 8;
        int exceptedResult = 8;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == exceptedResult) {
            System.out.println("Second number greatest test = OK");
        } else {
            System.out.println("Second number greatest test = FAIL");
        }

    }
    void numberAreEquals() {
        int firstNumber = 7;
        int secondNumber = 7;
        int exceptedResult = 7;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == exceptedResult) {
            System.out.println("Numbers are equal test = OK");
        } else {
            System.out.println("Number are equal test = FAIL");
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
            System.out.println("First number is biggest test = OK");
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
            System.out.println("Second number is biggest test = OK");
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
            System.out.println("Third number is biggest test = OK");
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
            System.out.println("First and second number is equal and biggest test = OK");
        } else {
            System.out.println("First and second number is equal and biggest test = FAIL");
        }
    }
    void maxOfThreeNumbersFive() {
        int firstNumber = 2;
        int secondNumber = 7;
        int thirdNumber = 7;
        int exceptedResult = 7;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == exceptedResult) {
            System.out.println("Third and second number is equal and biggest test = OK");
        } else {
            System.out.println("Third and second number is equal and biggest test = FAIL");
        }
    }
    void maxOfThreeNumbersSix() {
        int firstNumber = 2;
        int secondNumber = 1;
        int thirdNumber = 2;
        int exceptedResult = 2;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == exceptedResult) {
            System.out.println("First and third number is equal and biggest test = OK");
        } else {
            System.out.println("First and third number is equal and biggest test = OK = FAIL");
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
            System.out.println("All numbers equal test = OK");
        } else {
            System.out.println("All numbers equal test = OK = FAIL");
        }
    }
}
