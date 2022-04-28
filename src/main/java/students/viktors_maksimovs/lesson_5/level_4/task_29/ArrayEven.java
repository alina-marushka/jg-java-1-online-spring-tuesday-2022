package students.viktors_maksimovs.lesson_5.level_4.task_29;

import java.util.Arrays;
import java.util.Random;

public class ArrayEven {

    public static void main(String[] args) {
        Random random = new Random();

        int[] values = new int[10];

        for (int i = 0; i < values.length; i++) {
            values[i] = random.nextInt(100);
        }

        System.out.println("Random array : " + Arrays.toString(values));

        for (int value : values)  {

            if (value % 2 == 0) {
                System.out.print(value + " " );
            }

        }
    }
}
