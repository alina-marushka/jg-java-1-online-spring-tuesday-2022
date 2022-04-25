package students.sergejs_nichiporenko.lesson_4.level_1;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value:");
        int value = scanner.nextInt();
        int remainder = value % 2;
        if (remainder == 0) {
            System.out.println("Value is even");
        } else {
            System.out.println("Value is odd");
        }
    }
}
