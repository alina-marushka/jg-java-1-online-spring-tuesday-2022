package students.georgy_bakulin.lesson_4.level_3.task_8;

import java.util.Scanner;

class Task8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first number  ");
        int num1= scanner.nextInt();

        System.out.println("Please enter second number  ");
        int num2= scanner.nextInt();

        System.out.println("Please enter third number  ");
        int num3= scanner.nextInt();

        if (num1 < num2 && num2 < num3){
            System.out.println("increasing" );
        }else if (num1 > num2 && num2 > num3){
            System.out.println("decreasing");
        }else {
            System.out.println("neither" );
        }
    }
}
