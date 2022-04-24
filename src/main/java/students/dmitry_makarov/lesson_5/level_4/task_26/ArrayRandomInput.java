package students.dmitry_makarov.lesson_5.level_4.task_26;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class ArrayRandomInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input array length: ");
        int arrayLength = scanner.nextInt();
        int nums [] = new int [arrayLength];

        Random random = new Random();

        for (int i = 0; i < nums.length; i++) {
            nums [i] = random.nextInt(10);
        }

        System.out.println(Arrays.toString(nums));

    }
}
