package students.dmitry_makarov.lesson_2.level_3.task_10;

public class Task10 {
    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Input circle radius: ");
        double rad = scanner.nextDouble ();

        double per = 2 * rad * 3.14;   //circle perimeter D= 2 * 3.14 * r
        double area =  3.14 * Math.pow( rad, 2);              //circle area S= 3.14 * r^2

        System.out.println ("Perimeter is: " + per );
        System.out.println ("Area is: " + area);

    }
}
