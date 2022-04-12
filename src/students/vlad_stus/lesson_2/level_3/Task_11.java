package students.vlad_stus.lesson_2.level_3;

import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Введите три целых числа");
        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();
        int numberThree = scanner.nextInt();

        double avarage = (numberOne + numberTwo + numberThree) / 3 ;
        System.out.println(avarage);


    }
}
