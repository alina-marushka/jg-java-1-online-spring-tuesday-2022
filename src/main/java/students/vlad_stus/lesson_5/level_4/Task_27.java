package students.vlad_stus.lesson_5.level_4;

import java.util.Arrays;
import java.util.Random;

 class Task_27 {

     public static void main(String[] args) {

         Random random = new Random();
         int[] numbers = new int[5];



         for (int i = 0; i <numbers.length ; i++) {
             numbers[i] =random.nextInt(10);
             System.out.println("[" + i + "] = " +  numbers[i]);
             }


             Arrays.sort(numbers);//метод сортировки, который
         // организует массив в порядке возрастания
             int maxNum = numbers[numbers.length - 1];

         System.out.println(Arrays.toString(numbers));
         System.out.println("Max number from massive: = " +maxNum);
         }
     }
