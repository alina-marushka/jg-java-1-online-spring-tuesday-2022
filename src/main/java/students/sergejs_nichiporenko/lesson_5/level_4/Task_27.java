package students.sergejs_nichiporenko.lesson_5.level_4;

import java.util.Random;

class Task_27 {
    public static void main(String[] args) {
        Random random = new Random();

        System.out.println("Enter the length of the massive: ");
        int length = random.nextInt(10);
        int[] numbers = new int[length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }

        for (int number : numbers) {
            System.out.println(number);
        }

        int max = numbers[0];
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }

        System.out.println("Maximal number = " + max);
    }
}
