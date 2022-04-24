package students.romans_bogomols.lesson_5.level_4.task_29;

import java.util.Arrays;
import java.util.Random;

class EvenValues {

    public static void main(String[] args) {
        int[] values = new int[7];
        Random random = new Random();

        for (int i = 0; i < values.length; i++) {
            values[i] = random.nextInt(100000);
        }
        System.out.println("Random values elements are: " + Arrays.toString(values));

        System.out.println("Random values even elements are: ");
        for (int value : values) {

            if (value % 2 == 0) {
                System.out.print(value);
                System.out.print(" ");
            }
        }
    }
}
