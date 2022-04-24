package students.dmitry_makarov.lesson_5.level_4.task_30;

import java.util.Arrays;
import java.util.Random;

class OddOfRandomArray {
    public static void main(String[] args) {

        Random random = new Random();
        int arrayLength = random.nextInt(100);

        int numbers [] = new int[arrayLength];
        for (int i = 0; i < numbers.length; i++) {
             numbers [i] = random.nextInt();
        }
        System.out.println(Arrays.toString(numbers));

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]%2 !=0){
                System.out.print(" " + numbers[i] + "  ");
            }

        }
    }
}
