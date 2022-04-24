package students.dmitry_makarov.lesson_5.level_4.task_28;

import java.util.Arrays;
import java.util.Random;

class MinOfRandomArray {
    public static void main(String[] args) {

        Random random = new Random ();
        int arraysLength  = random.nextInt(10);

        int nums [] = new int [arraysLength];

        for (int i = 0; i < nums.length ; i++) {
            nums [i] = random.nextInt();
        }

        System.out.println(Arrays.toString(nums));

        int min = nums [0];
        for (int i = 0; i < nums.length; i++) {
            if (min > nums [i]){
                min = nums [i];
            }

        }

        System.out.println(min);
    }
}