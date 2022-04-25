package students.viktors_maksimovs.lesson_5.level_2;

import java.util.Scanner;

class Task11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbers[] = new int[3];


        System.out.println("Enter your first number: ");
        numbers[0] = scanner.nextInt();
        System.out.println("Enter your second number: ");
        numbers[1] = scanner.nextInt();
        System.out.println("Enter your third number: ");
        numbers[2] = scanner.nextInt();

        for (int number : numbers ) {
            System.out.println(number);
        }

    }

}
