package students.dmitry_makarov.lesson_4.level_3.task_8;

import java.util.Scanner;

 class Subsequence {
    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);

        System.out.print("Please input first number: ");
        int num1 = number.nextInt();

        System.out.print("Please input second number: ");
        int num2 = number.nextInt();

        System.out.print("Please input third number: ");
        int num3 = number.nextInt();

    SubsequenceCalc calc = new SubsequenceCalc (num1, num2, num3);
    calc.compare();

    }
}
