package students.deniss_mirosnikovs.lesson_5.level_4.task_29;

import java.util.Arrays;
import java.util.Random;

class Task29 {

    public static void main(String[] args) {

        int[] numArray = new int[10];
        int[] arrayEven = new int[numArray.length];

        for (int i = 0; i < numArray.length; i++) {

            Random random = new Random();
            numArray[i] = random.nextInt(100);

            if (numArray[i] % 2 == 0) {
                arrayEven[i] = numArray[i];
            }
        }

        System.out.println("Array length = " + Arrays.toString(numArray));

        System.out.print("Even numbers in Array = ");
        for (int i = 0; i < numArray.length; i++) {

            if (arrayEven[i] != 0) {
                System.out.print(arrayEven[i] + ", ");
            }
        }
    }
}
