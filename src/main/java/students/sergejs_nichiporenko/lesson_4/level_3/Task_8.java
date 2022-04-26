package students.sergejs_nichiporenko.lesson_4.level_3;

import java.util.Scanner;

class Task_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value 'a'");
        int a = scanner.nextInt();
        System.out.println("Enter value 'b'");
        int b = scanner.nextInt();
        System.out.println("Enter value 'c'");
        int c = scanner.nextInt();
        if (a < b && b < c) {
            System.out.println("Increasing");
        } else if (a > b && b > c){
            System.out.println("Decreasing");
        } else {
            System.out.println("Neither");
        }
    }
}
