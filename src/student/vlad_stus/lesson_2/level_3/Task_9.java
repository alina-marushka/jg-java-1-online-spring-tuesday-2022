package student.vlad_stus.lesson_2.level_3;

import java.util.Scanner;

public class Task_9 {

    public static void main(String[] args) {
        System.out.println("Введите целое число");

        Scanner scanner = new Scanner (System.in);

        int userNumer = scanner.nextInt();

        int userSum1 = userNumer * 2;
        int userSum2 = userNumer * 3;

        System.out.println( userNumer + " x " + 1 + " = " + userNumer  );
        System.out.println( userNumer + " x " + 2 + " = " + userSum1  );
        System.out.println( userNumer + " x " + 3 + " = " + userSum2  );
    }
}
