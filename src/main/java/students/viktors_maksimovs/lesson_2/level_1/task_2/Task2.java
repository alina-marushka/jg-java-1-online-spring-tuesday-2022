package students.viktors_maksimovs.lesson_2.level_1.task_2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("This console app performs simple fraction calculations with 2 numbers.");
        System.out.println("Enter first fraction number: ");
        double doubleNum1 = scanner.nextDouble();
        System.out.println("Enter second fraction number: ");
        double doubleNum2 = scanner.nextDouble();

        // calculations

        double sum = doubleNum1 + doubleNum2;
        double sub = doubleNum1 - doubleNum2;
        double mult = doubleNum1 * doubleNum2;
        double div = doubleNum1 / doubleNum2;

        // results

        System.out.println("Your number Sum result is: " + sum);
        System.out.println("Your number Subtraction result is: " + sub);
        System.out.println("Your number Multiplication result is: " + mult);
        System.out.println("Your number Division result is: " + div);
    }
}
