package instructor.lesson_5.demo_6;

import java.util.Arrays;
import java.util.Random;

class Demo6 {

    public static void main(String[] args) {

        Random random = new Random();

        int[] values = new int[1234];

//        System.out.println("Arrays.toString(values) = " + Arrays.toString(values));

        for (int i = 0; i < values.length; i++) {
            values[i] = random.nextInt(1000);
        }

        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] + " ");
        }

        int sum = 0;
        int min = values[0];
        int max = values[0];

        for (int i = 0; i < values.length; i++) {
            sum += values[i];

            if (min > values[i]) {
                min = values[i];
            }

            if (max < values[i]) {
                max = values[i];
            }
        }

        double avg = sum / (double) values.length;

        System.out.println();
        System.out.println("Statistics: ");
        System.out.println("sum = " + sum);
        System.out.println("avg = " + avg);
        System.out.println("min = " + min);
        System.out.println("max = " + max);

    }
}
