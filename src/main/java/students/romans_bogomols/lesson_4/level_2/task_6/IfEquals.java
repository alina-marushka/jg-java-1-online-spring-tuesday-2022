package students.romans_bogomols.lesson_4.level_2.task_6;

import java.util.Scanner;

class IfEquals {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        int firstValue = scanner.nextInt();
        System.out.println("Enter the second number");
        int secondValue = scanner.nextInt();

        if (firstValue == secondValue) {
            System.out.println("Numbers are equal");
        } else {
            System.out.println("Numbers are different");
        }
    }

}
