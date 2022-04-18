/* Task description:
Напишите программу, которая запрашивает у пользователя
три целых числа и выводит их среднее арифметическое
(складывает все числа и делит на их количество).

Примечение: обратите внимание, что результат может быть дробным числом.
 */

package students.viktors_maksimovs.deniss_mirosnikovs.lesson_2.level_3.task_11;
import java.util.Scanner;

public class Task11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;

        System.out.print("Enter first number: ");
        int firstNumber = scanner.nextInt();
        counter++;
        System.out.print("Enter second number: ");
        int secondNum = scanner.nextInt();
        counter++;
        System.out.print("Enter third number: ");
        int thirdNum = scanner.nextInt();
        counter++;

        double sum = firstNumber + secondNum + thirdNum;
        double arithmeticMean = sum / counter;

        System.out.println("Output: ");
        System.out.println("Arithmetic Mean = " + sum + " / " + counter + " = " + arithmeticMean);
    }
}
