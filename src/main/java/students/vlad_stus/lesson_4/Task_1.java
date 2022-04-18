package students.vlad_stus.lesson_4;

import java.util.Scanner;
 class Task_1 {

     public static void main(String[] args) {

         System.out.println("Введите целое число ");
         Scanner scanner = new Scanner(System.in);
         int numberA = scanner.nextInt();

         if(numberA > 0 ){
             System.out.println("Число положительное");
         } else {
             System.out.println(" Число отрицательное ");
         }

     }
}
