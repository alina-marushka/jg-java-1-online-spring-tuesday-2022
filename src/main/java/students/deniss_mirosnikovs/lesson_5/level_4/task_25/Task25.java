package students.deniss_mirosnikovs.lesson_5.level_4.task_25;

import java.util.Arrays;
import java.util.Scanner;

class Task25 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter array length: ");
        int arrayLength = input.nextInt();

        int[] numArray = new int[arrayLength];
        System.out.println("arrayLength = " + numArray.length + " " + Arrays.toString(numArray));

        for (int i = 0; i < arrayLength; i++) {

            System.out.print("Enter [" + i + "] number: ");
            int arrayNumber = input.nextInt();
            numArray[i] = arrayNumber;
        }

        System.out.println(Arrays.toString(numArray));
        for (int i = 0; i < arrayLength; i++) {
            System.out.print(numArray[i] + ", ");
        }
    }
}
