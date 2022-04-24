package students.dmitry_makarov.lesson_5.level_4.task_27;

import java.util.Arrays;
import java.util.Random;

 class MaxOfRandomArray {
    public static void main(String[] args) {

        Random random = new Random ();
        int arraysLength  = random.nextInt(10); //в этих заданиях я ограничил объем из которого выбираются
                                                      // случайные числа, потому что иначе массив порой получается таким
                                                      //большим, что программа, сначала долго думая, прекращала работу с ошибкой


        int nums [] = new int [arraysLength];

        for (int i = 0; i < nums.length ; i++) {
            nums [i] = random.nextInt();
        }

        System.out.println(Arrays.toString(nums));

       int max = nums [0];
        for (int i = 0; i < nums.length; i++) {
            if (max < nums [i]) {
            max = nums [i];
            }

        }

        System.out.println(max);
    }
}
