package src.main.java.students.dmitry_makarov.lesson_2.level_3.task_11;

public class Task11 {
    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Input first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Input second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Input third number: ");
        int num3 = scanner.nextInt();

        double average = ( (double)num1 + (double)num2 + (double)num3) / 3;

        System.out.println("Arithmetical mean = " + average );
    }
}
