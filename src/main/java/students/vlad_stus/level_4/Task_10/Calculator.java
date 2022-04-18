package students.vlad_stus.level_4.Task_10;

class Calculator {


    int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    int subtraction(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    int division(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    int multiplication(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    boolean isEven(int number) {
        return number % 2 == 0;
    }
    int maxOfTwoNumbers(int firstNumber, int secondNumber) {
        if (firstNumber <= secondNumber) {
            return secondNumber;
        } else {
            return firstNumber;
        }
    }
}
