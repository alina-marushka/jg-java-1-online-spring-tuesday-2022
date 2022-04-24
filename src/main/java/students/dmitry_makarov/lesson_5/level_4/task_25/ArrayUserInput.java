package students.dmitry_makarov.lesson_5.level_4.task_25;

import java.util.Arrays;
import java.util.Scanner;

class ArrayUserInput {
     public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);
         System.out.print("Please input array length: ");
         int arrayLength = scanner.nextInt();

         int nums [] = new int[arrayLength];

         for (int i = 0; i < nums.length ; i++) {
             System.out.print("Input number # " + (i+1) + " of " + nums.length + ": "  );
             nums [i] = scanner.nextInt ();
         }
         System.out.println(Arrays.toString(nums));

     }
}
