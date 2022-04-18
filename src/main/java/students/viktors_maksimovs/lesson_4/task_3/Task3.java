package students.viktors_maksimovs.lesson_4.task_3;

import java.util.Scanner;

class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");
        int val = scanner.nextInt();

        if (val % 2 == 0) {
            System.out.println("Number is Even");
        }
        else {
            System.out.println("Number is Odd");

        }
    }
}
