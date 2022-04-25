package students.romans_bogomols.lesson_5.level_4.task_28;

import java.util.Arrays;
import java.util.Random;

class LowestArrayValue {

    public static void main(String[] args) {

        int[] values = new int[5];
        Random random = new Random();

        for (int i = 0; i < values.length; i++) {
            values[i] = random.nextInt(10000);
        }

        System.out.println("Array values are: " + Arrays.toString(values));

        int arrayMin = values[0];

        for (int value : values) {

            if (arrayMin > value) {
                arrayMin = value;
            }
        }
        System.out.println("Lowest values value is: " + arrayMin);
    }
}

