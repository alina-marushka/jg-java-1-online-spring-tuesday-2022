package students.romans_bogomols.lesson_4.level_2.task_5;

import java.util.Scanner;

class LowestValue {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first value");
        int firstValue = scanner.nextInt();
        System.out.println("Enter second value");
        int secondValue = scanner.nextInt();

        if (firstValue < secondValue) {
            System.out.println("Lowest value is: " + firstValue);
        } else {
            System.out.println("Lowest value is: " + secondValue);
        }
    }

}
