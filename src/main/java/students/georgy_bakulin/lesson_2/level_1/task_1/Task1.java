package students.georgy_bakulin.lesson_2.level_1.task_1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter second number: ");
        int num2 = scanner.nextInt();



        int sum = num1+num2;
        int sub = num1-num2;
        int mult = num1*num2;
        double div = (double)num1/num2;



        System.out.println("Addiction  result is: " + sum);
        System.out.println("Subtraction result is: " + sub);
        System.out.println(" Multiplication result is: " + mult);
        System.out.println("Division result is: " + div);
    }
}
