package students.vlad_stus.lesson_5.level_4;

import java.util.Arrays;
import java.util.Random;

class Task_28 {

    public static void main(String[] args) {

        Random random = new Random();
        int[] numberOne = new int [5];
        int min = numberOne[0];
        int max = numberOne[0];
        for (int i = 0; i < numberOne.length; i++) {
            numberOne[i] = random.nextInt(15);
            System.out.println(numberOne[i]);

            if (min > numberOne[i]) {
                min = numberOne[i];
            }

            if (max < numberOne[i]) {
                max = numberOne[i];
            }
        }
        System.out.println("Arrays: " + Arrays.toString(numberOne));
        System.out.println(" New minimum element: = " + min);
        System.out.println(" New maximum element: = " + max);
    }
}
