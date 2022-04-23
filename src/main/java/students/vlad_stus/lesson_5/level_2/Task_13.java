package students.vlad_stus.lesson_5.level_2;

import java.util.Random;
import java.util.Arrays;

class Task_13 {

     public static void main(String[] args) {

         Random random = new Random();

         int[] numbers =new int[3];

         for (int i = 0; i <numbers.length ; i++) {
             numbers[i] = random.nextInt(10);
             System.out.println(numbers[i]);
         }
       /*  //заполнение массива случайными числами
         numbers[0] = random.nextInt(10);
         numbers[1] = random.nextInt(10);
         numbers[2] = random.nextInt(10);*/

     /*    System.out.println(Arrays.toString(numbers));*/




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

