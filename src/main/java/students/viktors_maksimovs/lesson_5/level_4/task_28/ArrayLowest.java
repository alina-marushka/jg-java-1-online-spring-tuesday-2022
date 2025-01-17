package students.viktors_maksimovs.lesson_5.level_4.task_28;

import java.util.Arrays;
import java.util.Random;

class ArrayLowest {
    public static void main(String[] args) {
        Random random = new Random();

        int[] values = new int[10];

        for (int i = 0; i < values.length; i++) {
            values[i] = random.nextInt(100);
        }

        System.out.println("Random array : " + Arrays.toString(values));

        int min = values[0];
        for (int value : values) {

            if (min > value) {
                min = value;
            }
        }

        System.out.println("Lowest value is: " + min);
    }
}
