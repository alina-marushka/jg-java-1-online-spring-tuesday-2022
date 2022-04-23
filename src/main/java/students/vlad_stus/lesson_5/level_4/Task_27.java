package students.vlad_stus.lesson_5.level_4;

import java.util.Arrays;
import java.util.Random;

 class Task_27 {

     public static void main(String[] args) {

         Random random = new Random();
         int[] numbers = new int[10];
         int max = numbers[0];
         for (int i = 0; i <numbers.length ; i++) {
             numbers[i] =random.nextInt(10);
             System.out.println("Числo: = " + i);

             if(max>numbers[i]){
                 System.out.println(max);

             }

         }


         System.out.println(Arrays.toString(numbers));
     }
}
