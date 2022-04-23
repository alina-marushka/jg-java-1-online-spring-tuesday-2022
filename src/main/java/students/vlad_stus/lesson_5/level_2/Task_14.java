package students.vlad_stus.lesson_5.level_2;

import java.util.Random;
import java.util.Arrays;

 class Task_14 {

     public static void main(String[] args) {

         Random random = new Random ();



         int[] numbers = new int[3];
         int sum = 0;
         for (int i = 0; i <numbers.length; i++) {
             numbers[i] =random.nextInt(10);
             sum += numbers[i];

         }
         double avg = (sum /(double)numbers.length);

         System.out.println(Arrays.toString(numbers));
         System.out.println("Summa " + sum);
         System.out.println(avg);



     }
}
