package src.main.java.students.dmitry_makarov.lesson_2.level_3.task_9;

public class Task9 {
    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Input your number: ");
        int num1 = scanner.nextInt ();

        for ( int x = 0 ; x<=10; x++) {
            if ( x > 0) {
                System.out.println(num1 + " * " + x + " = " + (x * num1));
            }
        }
    }
}
