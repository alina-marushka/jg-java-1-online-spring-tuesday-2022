/* Task description:
Напишите программу, которая запрашивает у пользователя
радиус круга (вещественное число) и печатает на консоль
периметр и площадь круга.

Test Data:
Radius = 7.5

Expected Output
Perimeter is = 47.12388980384689
Area is = 176.71458676442586
 */

package students.deniss_mirosnikovs.lesson_2.level_3.task_10;
import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        double pi = 3.141592653589793;
        double perimeter = 2 * pi * radius;
        double area = pi * (radius * radius);

        System.out.println("Output: ");
        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);
    }
}
