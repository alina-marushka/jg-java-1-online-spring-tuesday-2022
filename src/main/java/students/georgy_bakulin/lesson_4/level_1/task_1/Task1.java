package students.georgy_bakulin.lesson_4.level_1.task_1;

import java.util.Scanner;

class Task1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your number !");

        int number = scanner.nextInt();

        if (number > 0 ){
            System.out.println("Your number is positive !");
        } else if (number <0 ) {
            System.out.println("Your number is negative !");
        } else {
            System.out.println("Your number equals zero !");
        }
    }
}
