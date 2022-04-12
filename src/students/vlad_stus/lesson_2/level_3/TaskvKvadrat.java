package students.vlad_stus.lesson_2.level_3;

import java.util.Scanner;


public class TaskvKvadrat {

    public static void main(String args[]) {

        Scanner scanner = new Scanner (System.in);
        // Возведение в квадрат числа 3
        double a1 = scanner.nextDouble();
        double b1 = 2;
        System.out.printf("Число 3 в квадрате равно %.0f \n", Math.pow(a1, b1));
    }
}


/*
    Для возведения любого числа в квадрат с помощью метода Math.pow()
    необходимо в качестве второго аргумента использовать значение 2,
     а для возведения в куб — 3 и т.д.
     Заметьте, для вывода на экран целого значения используется "%.0f",
     так как метод возвращает double значение.*/
