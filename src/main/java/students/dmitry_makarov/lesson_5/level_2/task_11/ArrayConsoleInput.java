package students.dmitry_makarov.lesson_5.level_2.task_11;

import java.util.Scanner;

class ArrayConsoleInput {
  public static void main(String[] args) {
   int numbers [] = new int[3];

   Scanner scanner = new Scanner(System.in);
   numbers [0] = scanner.nextInt();
   numbers [1] = scanner.nextInt();
   numbers [2] = scanner.nextInt();

   System.out.println(numbers[0]+ " , " + numbers[1]+ " , " + numbers[2]);
  }
}
