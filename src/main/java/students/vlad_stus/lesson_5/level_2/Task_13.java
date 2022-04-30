package students.vlad_stus.lesson_5.level_2;

import java.util.Random;
import java.util.Arrays;

class Task_13 {

     public static void main(String[] args) {

         Random random = new Random();

         int[] numbers =new int[3];

         System.out.println(Arrays.toString(numbers));

         int sum = 0;
         for (int i = 0; i <numbers.length ; i++) {
             numbers[i] = random.nextInt(10);
             sum += numbers[i];
         }

         System.out.println(Arrays.toString(numbers));
         System.out.println(sum);


/*       ПРОБОВАЛ ПО ЭТОМУ ВАРИАНТУ- НЕ ПОЛУЧИЛОСЬ!
  int[] numbers =new int[3];
         int sum = 0;
         for (int i = 0; i <numbers.length ; i++) {
             numbers[i] = (int) (Math.random() *10);

             System.out.println( numbers[i] );



             sum = sum + numbers[i];
             System.out.println("Сумма всех ячеек: " + sum);*/
         }
     }

