package students.romans_bogomols.lesson_4.level_3.task_9;

import java.util.Scanner;

class BiggestNumber {

 public static void main(String[] args) {

  Scanner scanner = new Scanner(System.in);
  System.out.println("Enter first number");
  int firstNumber = scanner.nextInt();
  System.out.println("Enter second number");
  int secondNumber = scanner.nextInt();
  System.out.println("Enter third number");
  int thirdNumber = scanner.nextInt();

  if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
   System.out.println("The biggest number is " + firstNumber);
  } else if (secondNumber >= firstNumber && secondNumber >= thirdNumber) {
   System.out.println("The biggest number is " + secondNumber);
  } else {
   System.out.println("The biggest number is " + thirdNumber);
  }
 }
}
