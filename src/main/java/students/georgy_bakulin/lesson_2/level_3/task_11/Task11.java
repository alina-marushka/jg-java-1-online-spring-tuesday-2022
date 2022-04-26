package students.georgy_bakulin.lesson_2.level_3.task_11;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter 3 numbers to calculate average");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();



        System.out.println("Your numbers average is = " +(num1+num2+num3)/3 );
    }
}
