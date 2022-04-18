package students.vlad_stus.level_1;

import java.util.Scanner;

class Task_2 {
     public static void main(String[] args) {
         System.out.println("Введите целое число от 1 до 7 ");
         Scanner scanner = new Scanner(System.in);
         int numberA = scanner.nextInt();

         switch(numberA){
             case 3:
                 System.out.println("Wednesday");
                 break;
             case 5:
                 System.out.println("Вывод: Friday");

             default:
                 System.out.println("Вы ввели не верное число");
         }

     }
}
