package students.viktors_maksimovs.lesson_4.level_3.task_9;

import java.util.Scanner;

class Task9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int val1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int val2 = scanner.nextInt();

        System.out.print("Enter third number: ");
        int val3 = scanner.nextInt();

        if (val1 >= val2 && val1 >= val3) {
            System.out.println("Highest value is: " +val1);

        } else if (val2 >= val1 && val2 >= val3) {
            System.out.println("Highest value is: " +val2);

        } else {
            System.out.println("Highest value is: " +val3);
        }
    }
}

