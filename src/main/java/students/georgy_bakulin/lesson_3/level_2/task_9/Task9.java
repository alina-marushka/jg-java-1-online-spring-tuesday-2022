package students.georgy_bakulin.lesson_3.level_2.task_9;

import java.util.Scanner;

class Task9 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What's your name?: ");
        String userName= scanner.nextLine();

        System.out.println("Hello!" + userName + "!");
    }
}
