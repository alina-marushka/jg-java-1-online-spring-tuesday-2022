package students.dmitry_makarov.lesson_4.level_2.task_5;

import java.util.Scanner;

class LesserNumber {

    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);

        System.out.print("Please input first number: ");
        int num1 = number.nextInt();

        System.out.print("Please input second number: ");
        int num2 = number.nextInt();

        if (num1 < num2) {
            System.out.println("First number (" +num1 + ") is lesser");
        }
        else {
            System.out.println("Second number (" + num2 + ") is lesser");
        }
    }
}
