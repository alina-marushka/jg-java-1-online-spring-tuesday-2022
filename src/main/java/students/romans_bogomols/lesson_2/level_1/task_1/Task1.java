package students.romans_bogomols.lesson_2.level_1.task_1;


public class Task1 {

    public static void main(String[] args) {



    java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Enter yout first number");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter your second number");
        int secondNumber = scanner.nextInt();
        int sumOfNumbers = firstNumber + secondNumber;
        int multipleOfNumbers = firstNumber * secondNumber;
        double divideOfNumbers = firstNumber / (double)secondNumber;
        int subtractionOfNumbers = firstNumber - secondNumber;

        System.out.println(firstNumber + " + " + secondNumber + " = " + sumOfNumbers);
        System.out.println(firstNumber + " * " + secondNumber + " = " + multipleOfNumbers);
        System.out.println(firstNumber + " / " + secondNumber + " = " + divideOfNumbers);
        System.out.println(firstNumber + " - " + secondNumber + " = " + subtractionOfNumbers);

    }
}