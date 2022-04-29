package students.viktors_maksimovs.lesson_5.level_4.task_25;

import java.util.Arrays;
import java.util.Scanner;

class ArrayDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your arrays length:");

        int[] array = new int[scanner.nextInt()];

        System.out.println("Enter your array numeric values");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Your values are: " + Arrays.toString(array));
    }
}
