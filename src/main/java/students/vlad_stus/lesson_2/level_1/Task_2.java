package students.vlad_stus.lesson_2.level_1;

import java.util.Scanner;

public class Task_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Введите первое число с запятой ");
        double firstDoubleNumber = scanner.nextDouble();

        System.out.println("Введите второе число с запятой  ");
        double secondDoubleNumber = scanner.nextDouble();

        double addition = firstDoubleNumber + secondDoubleNumber;
        double subtraction = firstDoubleNumber - secondDoubleNumber;
        double multiplication = firstDoubleNumber * secondDoubleNumber;
        double division = firstDoubleNumber / secondDoubleNumber;
        double remainder = firstDoubleNumber % secondDoubleNumber;

        System.out.println("addition " + addition);
        System.out.println("subtraction " + subtraction );
        System.out.println("multiplication "  + multiplication);
        System.out.println("division " + division);
        System.out.println("remainder " + remainder);


    }
}
