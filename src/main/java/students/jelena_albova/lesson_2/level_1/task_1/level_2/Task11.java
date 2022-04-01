package students.jelena_albova.lesson_2.level_1.task_1.level_2;

public class Task11 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("ведите 1 число : " );
        int num1 = scanner.nextInt();

        System.out.println("ведите 2 число : ");
        int num2 = scanner.nextInt();

        System.out.println("ведите 3 число : ");
        int num3 = scanner.nextInt();

        System.out.println("Результат : ");

        double res = (num1 + num2 + num3)/3;

        System.out.println(res);



    }
}


   /* Напишите программу, которая запрашивает у пользователя
        три целых числа и выводит их среднее арифметическое
        (складывает все числа и делит на их количество).

        Примечение: обратите внимание, что результат может быть дробным числом.*/