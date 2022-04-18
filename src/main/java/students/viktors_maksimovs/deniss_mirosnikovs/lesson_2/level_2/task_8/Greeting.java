package students.viktors_maksimovs.deniss_mirosnikovs.lesson_2.level_2.task_8;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String userName = scanner.nextLine();

        System.out.println("Hello " + userName + "!");
    }
}
