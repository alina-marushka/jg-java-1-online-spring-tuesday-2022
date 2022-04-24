package students.romans_bogomols.lesson_5.level_4.task_25;

import java.util.Arrays;
import java.util.Scanner;

class ArraysGenerator {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your arrays length:");

        int[] userArray = new int[scanner.nextInt()];

        System.out.println("Enter array values [" + (userArray.length) + "]:");
        for (int i = 0; i < userArray.length; i++) {
            userArray[i] = scanner.nextInt();
        }
        System.out.println("Your values are: " + Arrays.toString(userArray));
    }
}
