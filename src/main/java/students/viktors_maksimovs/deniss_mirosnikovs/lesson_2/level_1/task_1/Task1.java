package students.viktors_maksimovs.deniss_mirosnikovs.lesson_2.level_1.task_1;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter your second number: ");
        int secondNumber = scanner.nextInt();

        int sum = firstNumber + secondNumber;
        int sub = firstNumber - secondNumber;
        int mul = firstNumber * secondNumber;
        int div = firstNumber / secondNumber;

        System.out.println(firstNumber + " + " + secondNumber + " = " + sum);
        System.out.println(firstNumber + " - " + secondNumber + " = " + sub);
        System.out.println(firstNumber + " * " + secondNumber + " = " + mul);
        System.out.println(firstNumber + " / " + secondNumber + " = " + div);
    }
}
