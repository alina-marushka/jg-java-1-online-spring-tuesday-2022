package students.viktors_maksimovs.lesson_4.level_3.task_8;

import java.util.Scanner;

class Task8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int val1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int val2 = scanner.nextInt();

        System.out.print("Enter third number: ");
        int val3 = scanner.nextInt();

        if (val1 < val2 && val2 < val3) {
            System.out.println("Increasing");

        } else if (val1 > val2 && val2 > val3) {
            System.out.println("Decreasing");

        } else {
            System.out.println("Neither");
        }
    }
}
