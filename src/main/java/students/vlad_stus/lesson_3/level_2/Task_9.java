package students.vlad_stus.lesson_3.level_2;

import java.util.Scanner;

public class Task_9 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
       String name = scanner.next();

        System.out.println();

        System.out.println("What is your surname?");
        String surName = scanner.next();

        System.out.println("Your Name is: " + name);
        System.out.println("Your Surname is: " + surName);
    }
}
