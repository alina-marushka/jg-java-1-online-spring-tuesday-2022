package students.georgy_bakulin.lesson_4.level_2.task_5;

import java.util.Scanner;

class Task5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first value ");
        int firstValue = scanner.nextInt();

        System.out.println("Please enter second value");
        int secondValue = scanner.nextInt();


        if(firstValue > secondValue){
            System.out.println("Lowest value " + secondValue);
        } else {
            System.out.println("Lowest value " + firstValue);
        }
    }
}
