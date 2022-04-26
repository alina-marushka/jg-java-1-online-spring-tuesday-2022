package students.sergejs_nichiporenko.lesson_4.level_2;

import java.util.Scanner;

class Task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value 'a'");
        int a = scanner.nextInt();
        System.out.println("Enter value 'b'");
        int b = scanner.nextInt();
        if (a > b) {
            System.out.println("Highest value is " + a);
        } else {
            System.out.println("Highest value is " + b);
        }

    }
}
