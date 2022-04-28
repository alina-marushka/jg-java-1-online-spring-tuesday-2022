package students.deniss_mirosnikovs.lesson_5.level_4.task_27;

import java.util.Arrays;
import java.util.Random;

class Task27 {

    public static void main(String[] args) {

        int[] numArray = new int[10];

        for (int i = 0; i < numArray.length; i++) {

            Random random = new Random();
            numArray[i] = random.nextInt(100);
        }

        System.out.println(Arrays.toString(numArray));
        for (int i = 0; i < numArray.length; i++) {
            System.out.print(numArray[i] + ", ");
        }

        int max = numArray[0];

        for (int i = 0; i < numArray.length; i++) {

            if (max < numArray[i]) {
                max = numArray[i];
            }
        }

        System.out.println("\nMax number in Array = " + max);
    }
}
