package students.romans_bogomols.lesson_4.level_3.task_8;

import java.util.Scanner;

class NumberSequence {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number");
        int secondNumber = scanner.nextInt();
        System.out.println("Enter third number");
        int thirdNumber = scanner.nextInt();

        if (firstNumber < secondNumber && secondNumber < thirdNumber) {
            System.out.println("Numbers increasing");
        } else if (firstNumber > secondNumber && secondNumber > thirdNumber) {
            System.out.println("Numbers decreasing");
        } else {
            System.out.println("Neither");
        }

    }
}


