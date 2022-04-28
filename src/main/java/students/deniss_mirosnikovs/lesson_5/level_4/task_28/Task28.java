package students.deniss_mirosnikovs.lesson_5.level_4.task_28;

import java.util.Arrays;
import java.util.Random;

class Task28 {

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

        int min = numArray[0];

        for (int i = 0; i < numArray.length; i++) {

            if (min > numArray[i]) {
                min = numArray[i];
            }
        }

        System.out.println("\nMin number in Array = " + min);
    }
}
