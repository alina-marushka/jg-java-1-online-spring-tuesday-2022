package students.vlad_stus.lesson_2.level_3;


import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        System.out.println("Задайте Радиус Круга");
        double  numberRadius = scanner.nextDouble();
        double b1 = 2;
        double numberOfP = 3.14d;

        /*  Формула Периметра круга: P = 2πr*/
        double perimetrIs = b1  * numberOfP * numberRadius;

/*        Формула Площади круга  S = π × r2,*/
        double areaIs = numberOfP * Math.pow( numberRadius, b1);

        System.out.println("Perimeter is= " +  perimetrIs);
        System.out.println("Area is=  " + areaIs);




    }
}
