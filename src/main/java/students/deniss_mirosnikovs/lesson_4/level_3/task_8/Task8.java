package students.deniss_mirosnikovs.lesson_4.level_3.task_8;

import java.util.Scanner;

class Task8 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        System.out.print("Enter third number: ");
        int num3 = input.nextInt();

        if (num1 < num2 && num2 < num3) {
            System.out.println("increasing");

        } else if (num1 > num2 && num2 > num3) {
            System.out.println("decreasing");

        } else {
            System.out.println("neither");
        }
    }
}
