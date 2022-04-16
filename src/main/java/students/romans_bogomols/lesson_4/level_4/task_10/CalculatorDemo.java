package students.romans_bogomols.lesson_4.level_4.task_10;

import javax.sound.midi.Soundbank;

class CalculatorDemo {

 public static void main(String[] args) {
 Calculator calculator = new Calculator ();
  System.out.println("Sum of our numbers is: " + calculator.sum(1,2));
  System.out.println("Difference of our numbers is: " + calculator.difference(5,12));
  System.out.println("Multiplication of our numbers is: " + calculator.multiplication(3,4));
  System.out.println("Division of our numbers is: " + calculator.division(8,10));
  System.out.println("Is this number even? -> " + calculator.isEven(8));
  System.out.println("Which number is biggest? -> " + calculator.maxOfTwoNumbers(7,7));
  System.out.println("Which number is biggest? -> " + calculator.maxOfThreeNumbers(88, 66, 33333));
 }
}

