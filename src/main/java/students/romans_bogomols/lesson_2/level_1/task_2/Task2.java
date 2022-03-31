package students.romans_bogomols.lesson_2.level_1.task_2;

public class Task2 {

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("What is your first double number?");
        double firstDoubleNumber = scanner.nextDouble();

        System.out.println("what is your second double number?");
        double secondDoubleNumber = scanner.nextDouble();

        double sumOfNumbers = firstDoubleNumber + secondDoubleNumber;
        double multipleOfNumbers = firstDoubleNumber * secondDoubleNumber;
        double divideOfNumbers = firstDoubleNumber / secondDoubleNumber;
        double subtractionOfNumbers = firstDoubleNumber - secondDoubleNumber;

        System.out.println(firstDoubleNumber + " + " + secondDoubleNumber + " = " + sumOfNumbers);
        System.out.println(firstDoubleNumber + " * " + secondDoubleNumber + " = " + multipleOfNumbers);
        System.out.println(firstDoubleNumber + " / " + secondDoubleNumber + " = " + divideOfNumbers);
        System.out.println(firstDoubleNumber + " - " + secondDoubleNumber + " = " + subtractionOfNumbers);


    }
}
