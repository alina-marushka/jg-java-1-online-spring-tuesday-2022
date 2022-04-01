package students.jelena_albova.lesson_2.level_1.task_1.level_2;

public class Task10 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Radius:  " );

        double Radius = scanner.nextDouble();

        double S = 3.14 * Math.pow( Radius, 2);
        System.out.println("Area = " + S);

        double P = 3.14 * 2 * Radius;
        System.out.println("Perimeter = " + P);









    }
}


    /* Напишите программу, которая запрашивает у пользователя
        радиус круга (вещественное число) и печатает на консоль
        периметр и площадь круга.

        Test Data:
        Radius = 7.5

        Expected Output
        Perimeter is = 47.12388980384689
        Area is = 176.71458676442586  */