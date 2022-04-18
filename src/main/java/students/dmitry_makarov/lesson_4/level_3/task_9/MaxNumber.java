package students.dmitry_makarov.lesson_4.level_3.task_9;

import java.util.Scanner;

class MaxNumber {
    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);

        System.out.print("Please input first number: ");
        int num1 = number.nextInt();

        System.out.print("Please input second number: ");
        int num2 = number.nextInt();

        System.out.print("Please input third number: ");
        int num3 = number.nextInt();


        if (num1 > num2 && num1 > num3 ) {
                System.out.println(num1 + " is bigger"); }
        else if (num1 == num2 && num1 > num3 ){
                System.out.println(" A = B > c");
        }


        else if (num2 > num1 && num2 > num3){
                System.out.println(num2 + " is bigger"); }
        else if (num2 == num3 && num2 > num1){
                System.out.println( " B = C > a");
        }


       else if (num3 > num1 && num3 > num2) {
                System.out.println(num3 + " is bigger");}
         if (num3 == num1 && num3 > num2){
                System.out.println( " C = A > b");
        }

        }
    }


