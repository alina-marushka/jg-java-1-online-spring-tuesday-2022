package students.sergejs_nichiporenko.lesson_5.level_2;

import java.sql.Driver;
import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[3];

        System.out.println("Enter first number:");
        numbers[0] = scanner.nextInt();

        System.out.println("Enter second number:");
        numbers[1] = scanner.nextInt();

        System.out.println("Enter third number:");
        numbers[2] = scanner.nextInt();

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
    }

}
