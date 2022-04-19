package students.deniss_mirosnikovs.lesson_2.level_1.task_2;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first number: ");
        double firstDoubleNumber = scanner.nextDouble();
        System.out.print("Enter your second number: ");
        double secondDoubleNumber = scanner.nextDouble();

        double sum = firstDoubleNumber + secondDoubleNumber;
        double sub = firstDoubleNumber - secondDoubleNumber;
        double mul = firstDoubleNumber * secondDoubleNumber;
        double div = firstDoubleNumber / secondDoubleNumber;

        System.out.println(firstDoubleNumber + " + " + secondDoubleNumber + " = " + sum);
        System.out.println(firstDoubleNumber + " - " + secondDoubleNumber + " = " + sub);
        System.out.println(firstDoubleNumber + " * " + secondDoubleNumber + " = " + mul);
        System.out.println(firstDoubleNumber + " / " + secondDoubleNumber + " = " + div);
    }
}
