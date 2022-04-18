package students.vlad_stus.level_2;

import java.util.Scanner;

class Task_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое целое число ");
        int numberA = scanner.nextInt();

        System.out.println("Введите второе целое число ");
        int numberB = scanner.nextInt();

        if (numberA < numberB) {
            System.out.println("Первое число Меньше");
        }else if(numberA == numberB) {
            System.out.println("Числа равны между собой");

        }else {
            System.out.println("Второе число Меньше");

        }

    }
}
