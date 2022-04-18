package students.dmitry_makarov.lesson_4.level_3.task_7;

import java.util.Scanner;

class ThreeNumbersBoolean {

    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);

        System.out.print("Please input first number: ");
        int num1 = number.nextInt();

        System.out.print("Please input second number: ");
        int num2 = number.nextInt();

        System.out.print("Please input third number: ");
        int num3 = number.nextInt();

        boolean ab = (num1 == num2);
        boolean bc = (num2 == num3);
        boolean abm = (num1 != num2);
        boolean bcm = (num2 != num3);
        boolean acm = (num1 != num3);

        if (ab && bc){
            System.out.println("All numbers are equal");
        }
        else if (abm && bcm && acm){
            System.out.println("All numbers are different");
        }
        else {
            System.out.println("Neither all are equal or different ");
        }
    }
}
