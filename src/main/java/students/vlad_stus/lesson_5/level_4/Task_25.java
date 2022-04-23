package students.vlad_stus.lesson_5.level_4;

import java.util.Arrays;
import java.util.Scanner;

 class Task_25 {

  public static void main(String[] args) {

   System.out.println("Введите длинну массива: ");

   Scanner scanner = new Scanner(System.in);
   int userOne =scanner.nextInt();


   int[] numbers = new int[userOne];
   for (int i = 0; i < numbers.length; i++) {
    numbers[i] =scanner.nextInt(10);
    System.out.println(numbers);

   }
   System.out.println(Arrays.toString(numbers));

   }
  }



