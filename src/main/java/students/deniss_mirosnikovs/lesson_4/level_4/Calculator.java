package students.deniss_mirosnikovs.lesson_4.level_4;

class Calculator {

    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int sub(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int mul(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public double div(double firstNumber, double secondNumber) {
        return firstNumber / secondNumber;
    }

    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public int maxOfTwoNumbers(int firstNumber, int secondNumber) {

        if (firstNumber > secondNumber) {
            return firstNumber;

        } else {
            return secondNumber;
        }
    }

    public int maxOfThreeNumbers(int firstNumber, int secondNumber, int thirdNumber) {

        if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
            return firstNumber;

        } else if (firstNumber <= secondNumber && secondNumber >= thirdNumber) {
            return secondNumber;

        } else {
            return thirdNumber;
        }
    }
}
