package students.viktors_maksimovs.lesson_5.level_2;

import java.util.Random;

class Task15 {

    public static void main(String[] args) {
        Random random = new Random();

        int numbers[] = new int[3];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }


        for (int number : numbers) {
            System.out.println(number);
        }
        System.out.println("Array values multiplied by 2");

        for (int number : numbers) {
            System.out.println(number * 2);

        }
    }
}