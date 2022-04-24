package students.romans_bogomols.lesson_5.level_4.task_26;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class ArraysGeneratorWithRandom {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your array length:");
        int[] arrayRandom = new int[scanner.nextInt()];

        Random random = new Random();

        for (int i = 0; i < arrayRandom.length; i++) {
            arrayRandom[i] = random.nextInt(1000);
        }

        System.out.println("Random values are: " + Arrays.toString(arrayRandom));
    }
}