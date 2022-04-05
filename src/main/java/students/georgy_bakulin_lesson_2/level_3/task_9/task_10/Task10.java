package students.georgy_bakulin_lesson_2.level_3.task_9.task_10;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Please enter circle radius: ");
        double rad = scanner.nextDouble ();

        double per = 2 * rad * 3.14;
        double area =  3.14 * Math.pow( rad, 2);

        System.out.println ("Square Perimeter is: " + per );
        System.out.println ("Square Area is: " + area);

    }
}
