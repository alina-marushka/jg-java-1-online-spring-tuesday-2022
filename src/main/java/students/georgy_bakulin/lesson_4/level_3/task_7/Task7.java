package students.georgy_bakulin.lesson_4.level_3.task_7;

import java.util.Scanner;

class Task7 {

  public static void main(String[] args) {

   Scanner scanner = new Scanner(System.in);

   System.out.println("Please enter first number !");
   int num1 = scanner.nextInt();


   System.out.println("Please enter second number !");
   int num2 = scanner.nextInt();


   System.out.println("Please enter third number !");
   int num3 = scanner.nextInt();

   if (num1 == num2 && num1 == num3 ){
    System.out.println("All numbers are equal");
   }else if (num1 != num2 && num1 != num3 && num2 != num3){
    System.out.println("All numbers are different" );
    }else {
    System.out.println("Neither all are equal or different");
   }
   }
  }

