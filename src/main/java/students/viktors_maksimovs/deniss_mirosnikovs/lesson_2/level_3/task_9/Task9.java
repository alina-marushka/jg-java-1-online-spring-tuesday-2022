/* Task description:
Напишите программу, которая запрашивает у пользователя целое число
и печатает на консоль таблицу умножения для этого числа до 10.

Test Data:
Input a number: 8

Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80
 */

package students.viktors_maksimovs.deniss_mirosnikovs.lesson_2.level_3.task_9;
import java.util.Scanner;

public class Task9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a number: ");
        int num = scanner.nextInt();

        System.out.println("Output: ");
        System.out.println(num + " x 1 = " + num);
        System.out.println(num + " x 2 = " + num * 2);
        System.out.println(num + " x 3 = " + num * 3);
        System.out.println(num + " x 4 = " + num * 4);
        System.out.println(num + " x 5 = " + num * 5);
        System.out.println(num + " x 6 = " + num * 6);
        System.out.println(num + " x 7 = " + num * 7);
        System.out.println(num + " x 8 = " + num * 8);
        System.out.println(num + " x 9 = " + num * 9);
        System.out.println(num + " x 10 = " + num * 10);
    }
}
