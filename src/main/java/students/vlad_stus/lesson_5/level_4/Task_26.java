package students.vlad_stus.lesson_5.level_4;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

class Task_26 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
         Random randon = new Random();
        System.out.println("Введите длинну массива: ");
        int arrayLenght = scanner.nextInt();

        int[] numbers = new int[arrayLenght];
        for (int i = 0; i <numbers.length; i++) {
            System.out.println("Заполнить массив случайными числами: "+ i);
            numbers[i] = randon.nextInt(10);

        }
        System.out.println(Arrays.toString(numbers));
    }
}
