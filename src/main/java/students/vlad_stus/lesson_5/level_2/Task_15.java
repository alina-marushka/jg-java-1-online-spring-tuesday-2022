package students.vlad_stus.lesson_5.level_2;

import java.util.Arrays;
import java.util.Random;

class Task_15 {

    public static void main(String[] args) {

        Random random = new Random();
        int[] numbers = new int[3];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10);

        }

        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);

        System.out.println("увеличьте значение каждой ячейки на 2,");

        for (int i = 0; i <numbers.length ; i++) {
            numbers[i] =random.nextInt(10);
            numbers[i] =numbers[i] + 2;
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers[0] + 2);
        System.out.println(numbers[1]+ 2);
        System.out.println(numbers[2]+ 2);

    }
}
