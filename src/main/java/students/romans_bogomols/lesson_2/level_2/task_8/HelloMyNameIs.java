package students.romans_bogomols.lesson_2.level_2.task_8;

public class HelloMyNameIs {

    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Hello what is your name?");
        String name = scanner.nextLine();

        System.out.println("Hello, " + name + "! :D");
    }
}
