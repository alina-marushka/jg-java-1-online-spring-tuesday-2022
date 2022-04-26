package students.sergejs_nichiporenko.lesson_4.level_2;

import java.util.Scanner;

class Task_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value 'a'");
        int a = scanner.nextInt();
        System.out.println("Enter value 'b'");
        int b = scanner.nextInt();
        if (a < b) {
            System.out.println("Lowest value is " + a);
        } else {
            System.out.println("Lowest value is " + b);
        }
    }
}
