package students.georgy_bakulin.lesson_4.level_4.task_10;

class Calculator {

    int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    int sub(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    int mul(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;

    }

    double div(int firstNumber, int secondNumber) {
        return firstNumber / (double) secondNumber;
    }

    boolean isEven(int number) {

        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    int maxOfTwoNumbers(int firstNumber, int secondNumber) {
        if (firstNumber >= secondNumber) {
            return firstNumber;
        } else {
            return secondNumber;
        }
    }

    int maxOfThreeNumbers(int firstNumber, int secondNumber, int thirdNumber) {
        if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
            return firstNumber;
        } else if (secondNumber >= firstNumber && secondNumber >= thirdNumber) {
            return secondNumber;
        } else {
            return thirdNumber;
        }
    }
}

