package students.dmitry_makarov.lesson_4.level_1.task_3;
import java.util.Scanner;

class OddOrEven {
   public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);
       int number = scanner.nextInt();
       int check = number%2;

       if (number == 0) {
           System.out.println("Number is zero");
       }
       else if (check ==0) {
           System.out.println("Number is even");
       }
       else {
           System.out.println("Number is odd");
       }



   }
}
