package students.viktors_maksimovs.lesson_2.level_1.task_1;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("This console app performc simple calculations with 2 numbers.");
        System.out.println("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number: ");
        int num2 = scanner.nextInt();

        // calculations

        int sum = num1+num2;
        int sub = num1-num2;
        int mult = num1*num2;
        double div = (double)num1/num2;

        // results

        System.out.println("Your number Sum result is: " + sum);
        System.out.println("Your number Subtraction result is: " + sub);
        System.out.println("Your number Multiplication result is: " + mult);
        System.out.println("Your number Division result is: " + div);


    }
}
