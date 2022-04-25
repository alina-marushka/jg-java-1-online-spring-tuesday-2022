package students.sergejs_nichiporenko.lesson_5.level_4;

import java.util.Random;
import java.util.Scanner;

public class Task_25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of the massive: ");
        int length = scanner.nextInt();
        int[] numbers = new int[length];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter value of number " + (numbers[i] + 1));
            numbers[i] = scanner.nextInt();
        }

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}

