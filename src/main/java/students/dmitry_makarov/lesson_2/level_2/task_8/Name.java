package src.main.java.students.dmitry_makarov.lesson_2.level_2.task_8;

/*
 Написать консольную программу, которая запрашивает
имя пользователя и выводит на консоль текст:
Hello имя пользователя!
  */

public class Name {

    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Input you name: ");
        String name = scanner.nextLine();

        System.out.println("Hello, " + name );
    }
}
