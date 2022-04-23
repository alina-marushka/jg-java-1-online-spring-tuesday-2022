package students.vlad_stus.lesson_5.level_4;

import java.util.Arrays;
import java.util.Scanner;

 class Task_25 {

  public static void main(String[] args) {



   Scanner scanner = new Scanner(System.in);
   System.out.println("Введите длинну массива: ");
   int arrayLength  =scanner.nextInt();


   int[] numbers = new int[arrayLength];
   for (int i = 0; i < numbers.length; i++) {
    System.out.println("Заполнить массив случайными числами[" + i + "]");
    numbers[i] =scanner.nextInt(10);


   }
   System.out.println(Arrays.toString(numbers));

   }
  }



