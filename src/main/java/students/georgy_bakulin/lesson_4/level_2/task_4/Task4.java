package students.georgy_bakulin.lesson_4.level_2.task_4;

import java.util.Scanner;

class Task4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first value ");
        int firstValue = scanner.nextInt();

        System.out.println("Please enter second value ");
        int secondValue = scanner.nextInt();

        if(firstValue > secondValue){
            System.out.println("Biggest value " + firstValue);
        } else {
            System.out.println("Biggest value " + secondValue);
        }
    }
}
