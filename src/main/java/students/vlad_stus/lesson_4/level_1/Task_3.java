package students.vlad_stus.lesson_4.level_1;

import java.util.Scanner;

class Task_3 {
    public static void main(String[] args) {
        System.out.println("Введите целое число ");
        Scanner scanner = new Scanner(System.in);
        int numberA = scanner.nextInt();

        if ((numberA % 2) ==0) {
            System.out.println("Четное число: " + numberA);
        } else  {
            System.out.println("Не четное число " + numberA);
        }

        }
    }
