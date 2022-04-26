package students.sergejs_nichiporenko.lesson_4.level_1;

import java.util.Scanner;

class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value.");
        int value = scanner.nextInt();
        if(value < 0){
            System.out.println("Value is negative");
        }else if(value == 0){
            System.out.println("Value is 0");
        }else{
            System.out.println("Value is positive");
        }
    }
}
