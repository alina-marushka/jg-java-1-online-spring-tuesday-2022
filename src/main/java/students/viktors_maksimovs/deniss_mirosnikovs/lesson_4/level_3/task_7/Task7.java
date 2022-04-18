package students.viktors_maksimovs.deniss_mirosnikovs.lesson_4.level_3.task_7;

import java.util.Scanner;

class Task7 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        System.out.print("Enter third number: ");
        int num3 = input.nextInt();

        if (num1 == num2 && num2 == num3) {
            System.out.println("All numbers are equal");

        } else if (num1 != num2 && num1 != num3 && num2 != num3) {
            System.out.println("All numbers are different");

        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}
