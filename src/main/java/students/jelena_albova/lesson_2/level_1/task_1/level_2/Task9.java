package students.jelena_albova.lesson_2.level_1.task_1.level_2;

public class Task9 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Input a number: "  );
        int num1 = scanner.nextInt();
        int res1 = num1 * 1;
        int res2 = num1 * 2;
        int res3 = num1 * 3;
        int res4 = num1 * 4;
        int res5 = num1 * 5;
        int res6 = num1 * 6;
        int res7 = num1 * 7;
        int res8 = num1 * 8;
        int res9 = num1 * 9;
        int res10 = num1 * 10;
        System.out.println("Expected Output :" );
        System.out.println(num1+"*" + 1 + "=" + res1);
        System.out.println(num1+"*" + 2 + "=" + res2);
        System.out.println(num1+"*" + 3 + "=" + res3);
        System.out.println(num1+"*" + 4 + "=" + res4);
        System.out.println(num1+"*" + 5 + "=" + res5);
        System.out.println(num1+"*" + 6 + "=" + res6);
        System.out.println(num1+"*" + 7 + "=" + res7);
        System.out.println(num1+"*" + 8 + "=" + res8);
        System.out.println(num1+"*" + 9 + "=" + res9);
        System.out.println(num1+"*" + 10 + "=" + res10);




    }
}/*Напишите программу, которая запрашивает у пользователя целое число
        и печатает на консоль таблицу умножения для этого числа до 10.

        Test Data:
        Input a number: 8

        Expected Output :
        8 x 1 = 8
        8 x 2 = 16
        8 x 3 = 24
        ...
        8 x 10 = 80 */