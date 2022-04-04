package students.sergejs_nichiporenko.lesson_2.level_3;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Enter number please!");
        int number = scanner.nextInt();

        for (int i = 1; i < 11; i++){
            System.out.println(number + " * " + i + " = " + (number * i));
        }

    }
}
