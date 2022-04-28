package students.viktors_maksimovs.lesson_5.level_4.task_26;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class ArrayRandom {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Enter your arrays length:");

        int[] array = new int[scanner.nextInt()];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        System.out.println("Your random array values are: " + Arrays.toString(array));
    }
}
