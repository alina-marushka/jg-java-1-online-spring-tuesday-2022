package students.vlad_stus.lesson_5.level_2;

import java.util.Scanner;

 class Task_11 {

     public static void main(String[] args) {

         int[] numbers = new int[3];

         Scanner scanner = new Scanner(System.in);
         System.out.println("Введите три числа: ");
         numbers[0] = scanner.nextInt();
         numbers[1] = scanner.nextInt();
         numbers[2] = scanner.nextInt();


         System.out.println(numbers[0]);
         System.out.println(numbers[1]);
         System.out.println(numbers[2]);
     }
}
