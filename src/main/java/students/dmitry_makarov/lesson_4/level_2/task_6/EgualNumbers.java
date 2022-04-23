package students.dmitry_makarov.lesson_4.level_2.task_6;

import java.util.Scanner;

class EgualNumbers {
    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);

        System.out.print("Please input first number: ");
        int num1 = number.nextInt();

        System.out.print("Please input second number: ");
        int num2 = number.nextInt();

        if (num1 == num2) {
            System.out.println("Numbers are equals");
        }
        else {
            System.out.println("Numbers are different");
        }
    }
}
