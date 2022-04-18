package students.viktors_maksimovs.deniss_mirosnikovs.lesson_4.level_1.task_3;

import java.util.Scanner;

class Task3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your number: ");
        int num = input.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " is Even number");

        } else {
            System.out.println(num + " is Odd number");
        }
    }
}
