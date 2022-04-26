package students.sergejs_nichiporenko.lesson_2.level_1;

public class Task1 {

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Enter first value");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter second value");
        int secondNumber = scanner.nextInt();

        int sumOfNumbers = firstNumber + secondNumber;
        int subtractionOfNumbers = firstNumber - secondNumber;
        int multiplicationOfNumbers = firstNumber * secondNumber;
        double divisionOfNumbers = (double) firstNumber / (double) secondNumber;

        System.out.println(firstNumber + " + " + secondNumber + " = " + sumOfNumbers);
        System.out.println(firstNumber + " - " + secondNumber + " = " + subtractionOfNumbers);
        System.out.println(firstNumber + " * " + secondNumber + " = " + multiplicationOfNumbers);
        System.out.println(firstNumber + " / " + secondNumber + " = " + divisionOfNumbers);
    }
}
