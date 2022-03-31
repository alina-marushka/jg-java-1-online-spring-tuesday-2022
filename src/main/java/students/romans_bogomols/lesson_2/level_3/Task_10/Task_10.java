package students.romans_bogomols.lesson_2.level_3.Task_10;

public class Task_10 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Hello! Please enter radius of the circle");
        double radius = scanner.nextDouble();


        double perimeter = radius * 2 * Math.PI;
        double area = radius * radius  * Math.PI;

        System.out.println("Test data:");
        System.out.println("Radius = " + radius);
        System.out.println("Result:");
        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);


    }
}
