package students.dmitry_makarov.lesson_4.level_1.task_1;

import java.util.Scanner;

class PositiveNegative {
    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);

        System.out.print("Please input number: ");
        int num = number.nextInt();

        if (num > 0){
            System.out.println("Number is positive");
        }
        else if (num == 0){
            System.out.println("Number equals zero");
        }
        else {
            System.out.println("Number is negative");
        }
    }
}
