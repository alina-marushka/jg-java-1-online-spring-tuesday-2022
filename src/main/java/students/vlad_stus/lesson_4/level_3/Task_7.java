package students.vlad_stus.lesson_4.level_3;

import java.util.Scanner;

class Task_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое целое число ");
        int numberA = scanner.nextInt();

        System.out.println("Введите второе целое число ");
        int numberB = scanner.nextInt();

        System.out.println("Введите третье целое число ");
        int numberC = scanner.nextInt();

        if (numberA == numberB && numberB == numberC) {
            System.out.println("All numbers are equal");

        } else if (numberA != numberB && numberA != numberC && numberB != numberC) {
            System.out.println("All numbers are different");

        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}