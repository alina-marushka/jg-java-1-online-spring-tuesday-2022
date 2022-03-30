package student.vlad_stus.lesson_2.level_3;

import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        System.out.println("Напишите Радиус Круга");
        int numberRadius = scanner.nextInt();
        double numberOfP = 3.14d;

        double areaIs = numberOfP * ((double)numberRadius*2);

        System.out.println("Area is=  " + areaIs);


    }
}
