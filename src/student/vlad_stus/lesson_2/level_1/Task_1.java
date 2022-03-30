package student.vlad_stus.lesson_2.level_1;


import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {
        Scanner scanner = new java.util.Scanner(System.in);
        String word1 = "Сложение: ";
        String word2 =  "Вычитание: ";
        String word3 = "Умножение: ";
        String word4 =  "Деление:  ";
        String word5 =  "Остаток от деления:  ";

        System.out.println("Введите первое число ");
        int firstNumber = scanner.nextInt();

        System.out.println("Введите второе число ");
        int secondNumber = scanner.nextInt();

        int addition = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        int division = firstNumber / secondNumber;
        int remainder = firstNumber % secondNumber;


        System.out.println( word1 + firstNumber + " + "  + secondNumber + " = " + addition );

        System.out.println( word2 + firstNumber + " - "  + secondNumber + " = " +  subtraction);

        System.out.println( word3 + firstNumber + " * "  + secondNumber + " = " + multiplication );

        System.out.println( word4 + firstNumber + " / "  + secondNumber + " = " + division );

        System.out.println( word5 + firstNumber + " % "  + secondNumber + " = " + remainder );

    }
}
