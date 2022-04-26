package students.viktors_maksimovs.lesson_3.level_2.task_7;

import java.util.Scanner;

class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String userInput = scanner.nextLine();

        System.out.println("Hello "+ userInput + "!");
    }
}
