package students.viktors_maksimovs.lesson_4.task_1;

import java.util.Scanner;

class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your number");
        int val = scanner.nextInt();

        if (val > 0) {
            System.out.println("Your number is Positive");
        }
        else if ( val < 0) {
            System.out.println("Your number is Negative");
        }
        else {
           System.out.println("Your number is equal to Zero");
        }


    }
}
