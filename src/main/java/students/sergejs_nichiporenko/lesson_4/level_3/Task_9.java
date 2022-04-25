package students.sergejs_nichiporenko.lesson_4.level_3;

import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value 'a'");
        int a = scanner.nextInt();
        System.out.println("Enter value 'b'");
        int b = scanner.nextInt();
        System.out.println("Enter value 'c'");
        int c = scanner.nextInt();
        if (a >= b && a >= c) {
            System.out.println(a);
        } else if (b >= a && b >= c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }
}
