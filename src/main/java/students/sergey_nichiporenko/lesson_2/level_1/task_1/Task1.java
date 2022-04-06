package students.sergey_nichiporenko.lesson_2.level_1.task_1;

public class Task1 {

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Enter first value");
        int firstValue = scanner.nextInt();

        System.out.println("Enter second value");
        int secondValue = scanner.nextInt();

        int sumOfValues = firstValue + secondValue;
        int multipleValues = firstValue * secondValue;
        int divideValues = firstValue / secondValue;

        System.out.println(firstValue + " + " + secondValue + " = " + sumOfValues);
        System.out.println(firstValue + " * " + secondValue + " = " + multipleValues);
        System.out.println(firstValue + " / " + secondValue + " = " + divideValues);

    }
}
