package students.vlad_stus.lesson_4.level_2;

import java.util.Scanner;

class Task_6 {
 public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  System.out.println("Введите первое целое число ");
  int numberA = scanner.nextInt();

  System.out.println("Введите второе целое число ");
  int numberB = scanner.nextInt();

  if(numberA == numberB){
   System.out.println("Numbers are equals");}
   else {
   System.out.println("Numbers are different");}
 }

 }


