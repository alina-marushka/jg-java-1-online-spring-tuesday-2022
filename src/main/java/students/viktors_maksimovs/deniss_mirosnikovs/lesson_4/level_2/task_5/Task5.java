package students.viktors_maksimovs.deniss_mirosnikovs.lesson_4.level_2.task_5;

import java.util.Scanner;

class Task5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        if (num1 < num2) {
            System.out.println(num1);

        } else {
            System.out.println(num2);
        }
    }
}
