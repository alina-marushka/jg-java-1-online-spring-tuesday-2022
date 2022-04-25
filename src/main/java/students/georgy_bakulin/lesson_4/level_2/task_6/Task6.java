package students.georgy_bakulin.lesson_4.level_2.task_6;

import java.util.Scanner;

class Task6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number ");
        int firstNumber = scanner.nextInt();

        System.out.println("Please enter second number ");
        int secondNumber = scanner.nextInt();

        if(firstNumber==secondNumber){
            System.out.println("Numbers are equal ");
        }else {
            System.out.println("Numbers are not equal ");
        }
    }
}
