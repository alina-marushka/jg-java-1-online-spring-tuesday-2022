package students.romans_bogomols.lesson_2.level_3.Task_11;

public class Task_11 {
    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Hello! Please enter first number");
        int firstNumber = scanner.nextInt();
        System.out.println("Hello! Please enter second number");
        int secondNumber = scanner.nextInt();
        System.out.println("Hello! Please enter third number");
        int thirdNumber = scanner.nextInt();

        double averageNumber = (firstNumber + secondNumber + thirdNumber) / (double)3;

        System.out.println("Result: our average number is " + averageNumber);






    }
}
