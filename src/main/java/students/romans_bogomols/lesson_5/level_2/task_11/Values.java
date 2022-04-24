package students.romans_bogomols.lesson_5.level_2.task_11;

import java.util.Scanner;

class Values {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] values = new int[3];

//        System.out.println("Enter your first value: ");
//        values[0] = scanner.nextInt();
//        System.out.println("Enter your second value: ");
//        values[1] = scanner.nextInt();
//        System.out.println("Enter your third value: ");
//        values[2] = scanner.nextInt();

        for (int i = 0; i < values.length; i++) {
            System.out.println("Enter your value #" + (i + 1) + ":" );
            values[i] = scanner.nextInt();
        }

        System.out.print("Your input is: ");
        for (int value : values) {
            System.out.print(value);
            System.out.print(" ");
        }
    }

}