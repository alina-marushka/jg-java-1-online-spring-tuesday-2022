package students.viktors_maksimovs.deniss_mirosnikovs.lesson_4.level_1.task_1;

import java.util.Scanner;

class Task1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your number: ");
        int num = input.nextInt();

        if (num > 0 ) {
            System.out.println("Number is positive ");

        } else if (num < 0) {
            System.out.println("Number is negative ");

        } else {
            System.out.println("Number is equal zero ");
        }
    }
}
