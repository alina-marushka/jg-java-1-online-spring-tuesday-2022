package students.viktors_maksimovs.lesson_2.level_3.task_10;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your circle radius: ");
        double num = scanner.nextDouble();

        System.out.println();
       // googled the formulas
        System.out.println("Your perimeter is = "+ (22*2*num)/7);
        System.out.println("Your Area is = "+ (num*num)*Math.PI);

    }
}
