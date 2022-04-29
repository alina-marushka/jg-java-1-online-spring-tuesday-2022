package students.viktors_maksimovs.lesson_5.level_4.task_27;

import java.util.Arrays;
import java.util.Random;

class ArrayHighest {
    public static void main(String[] args) {
        Random random = new Random();

        int[] values = new int[10];

        for (int i = 0; i < values.length; i++) {
            values[i] = random.nextInt(100);
        }

        System.out.println("Random array : " + Arrays.toString(values));

        int max = values[0];
        for (int value : values) {

            if (max < value) {
                max = value;
            }
        }

        System.out.println("Biggest value is: " + max);
    }
}
