package students.romans_bogomols.lesson_5.level_4.task_30;

import java.util.Arrays;
import java.util.Random;

class OddNumbers {

    public static void main(String[] args) {

        int[] values = new int[10];

        Random random = new Random();

        for (int i = 0; i < values.length; i++) {
            values[i] = random.nextInt(15823);
        }
        System.out.println("Array random elements are: " + Arrays.toString(values));

        for (int value : values) {

            if (value % 2 != 0) {
                System.out.print(value);
                System.out.print(" ");
            }
        }
    }
}
