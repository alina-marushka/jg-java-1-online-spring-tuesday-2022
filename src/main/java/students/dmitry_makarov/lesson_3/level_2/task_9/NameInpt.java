package students.dmitry_makarov.lesson_3.level_2.task_9;

import java.util.Scanner;

 class NameInpt {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.print("Please input your name: ");

        String name  = scanner.nextLine();

        System.out.println("Hi, " + name);
    }

}
