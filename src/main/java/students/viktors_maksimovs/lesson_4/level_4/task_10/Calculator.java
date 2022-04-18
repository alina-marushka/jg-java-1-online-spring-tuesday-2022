package students.viktors_maksimovs.lesson_4.level_4.task_10;

class Calculator {
    int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    int sub(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    int mult(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    double div(int firstNumber, int secondNumber) {
        return (double)firstNumber / secondNumber;
    }

    boolean isEven(int number) {
        return number % 2 ==0;
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
            return  thirdNumber;
        }
    }

}
