package students.georgy_bakulin.lesson_2.level_1.task_2;

public class Task2 {
    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Input first number (A): ");
        double num1 = scanner.nextDouble ();

        System.out.print( "Input second number (B): ");
        double num2 = scanner.nextDouble ();

        double sum = num1 + num2 ;
        double sub = num1 - num2 ;
        double mult = num1 * num2 ;
        double  div = num1 / num2 ;

        System.out.println("A + B = " + sum );
        System.out.println("A - B = " + sub );
        System.out.println("A * B = " + mult );
        System.out.println("A / B = " + div );
    }
}
