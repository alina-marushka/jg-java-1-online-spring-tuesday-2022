package students.vlad_stus.level_3;

import java.util.Scanner;

class Task_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое целое число ");
        int numberA = scanner.nextInt();

        System.out.println("Введите второе целое число ");
        int numberB = scanner.nextInt();

        System.out.println("Введите третье целое число ");
        int numberC = scanner.nextInt();

        if (numberA > numberB && numberA > numberC) {
            System.out.println("Число А наибольшее");
        } else if (numberB > numberA && numberB > numberC) {
            System.out.println("Число B наибольшее");
        } else if (numberC > numberA && numberC > numberB) {
            System.out.println("Число C наибольшее");
        } else if (numberA == numberB || numberA == numberC ){
            System.out.println(" + Какое то из двух чисел между собой равны");
            }else if (numberB == numberC){
        }System.out.println("Какое то из чисел между собой равны");
        }
    }

