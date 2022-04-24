package students.romans_bogomols.lesson_5.level_4.task_27;

import java.util.Arrays;
import java.util.Random;

class BiggestArrayValue{
    public static void main(String[] args) {

        int[] values = new int[12];
        Random random = new Random();

        for (int i = 0; i < values.length; i++) {
            values[i] = random.nextInt(1000);
        }

        System.out.println("Array values are: " + Arrays.toString(values));

        int maxValue = values[0];
        for (int value : values) {

            if (maxValue < value) {
                maxValue = value;
            }
        }

        System.out.println("Biggest value is: " + maxValue);
    }
}
