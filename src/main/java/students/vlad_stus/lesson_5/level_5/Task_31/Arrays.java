package students.vlad_stus.lesson_5.level_5.Task_31;

import java.util.Scanner;
import java.util.Random;


 class Arrays {

     Scanner scanner;
     Random random;

     Arrays() {
         this.scanner = new Scanner(System.in);
     }

     /*  метод для создания
       массива целых чисел указанной длины.*/
     int[] create(int length) {
         int[] massive = new int[length];
         return massive;
     }
/*Создайте в классе Arrays метод для
заполнения массива случайными целыми числами.*/

     void fillRandomly(int[] array) {
         this.random = new Random();
         for (int i = 0; i < array.length; i++) {
             array[i] = random.nextInt(10);
         }
     }

     /*   метод для
        распечатки массива целых чисел на консоль.*/
     void printArrays(int[] array) {
         System.out.println(java.util.Arrays.toString(array));
     }


     /*     метод для
          нахождения максимального числа в массиве целых чисел.*/
     int findMax(int[] array) {
         int maxNumber = array[0];
         for (int i = 0; i < array.length; i++) {
             int number = array[i];
             if (number > maxNumber) {
                 maxNumber = number;
             }
         }
     }
 }




