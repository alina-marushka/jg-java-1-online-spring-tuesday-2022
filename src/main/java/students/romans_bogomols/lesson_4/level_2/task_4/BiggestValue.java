package students.romans_bogomols.lesson_4.level_2.task_4;

import java.util.Scanner;

class BiggestValue {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first value");
        int firstValue = scanner.nextInt();
        System.out.println("Enter second value");
        int secondValue = scanner.nextInt();

        if (firstValue > secondValue) {
            System.out.println("Biggest value is: " + firstValue);
        } else {
            System.out.println("Biggest value is: " + secondValue);
        }
   }
}
