package students.deniss_mirosnikovs.lesson_4.level_3.task_9;

import java.util.Scanner;

class Task9 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        System.out.print("Enter third number: ");
        int num3 = input.nextInt();

        if (num1 >= num2 && num1 >= num3) {
            System.out.println(num1);

        } else if (num1 <= num2 && num2 >= num3) {
            System.out.println(num2);

        } else {
            System.out.println(num3);
        }
    }
}
