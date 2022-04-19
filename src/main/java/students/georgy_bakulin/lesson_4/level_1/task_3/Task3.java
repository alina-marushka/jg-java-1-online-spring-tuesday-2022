package students.georgy_bakulin.lesson_4.level_1.task_3;

import java.util.Scanner;

class Task3 {

     public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);
         System.out.println("Enter your number  ");
         int number = scanner.nextInt();

         if (number %2==0 ){
             System.out.println("This  is an even number ");
         } else {
             System.out.println("This  is an odd number");
         }
     }
}
