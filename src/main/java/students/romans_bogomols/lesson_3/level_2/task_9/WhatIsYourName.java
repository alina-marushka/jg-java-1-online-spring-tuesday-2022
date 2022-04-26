package students.romans_bogomols.lesson_3.level_2.task_9;

import java.util.Scanner;

class WhatIsYourName {

    public static void main(String[] args) {

       Scanner scanner  = new Scanner(System.in);

        System.out.println("What is your name ?");
        String yourName = scanner.nextLine();

        System.out.println("Your name is: " + yourName);


    }
}
