package students.romans_bogomols.lesson_5.level_5.task_31;

import java.util.Random;

class Arrays {

    int[] create(int length) {
        return new int[length];
    }

    void fillRandomly(int[] array) {

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000);
        }
    }

    void print(int[] array) {
        for (int value : array) {
            System.out.print(value);
            System.out.print(" ");
        }
    }

    int findMax(int[] array) {
        int maxValue = array[0];
        for (int value : array) {
            if (maxValue < value) {
                maxValue = value;
            }
        }
        return maxValue;
    }
    int findMin(int[] array) {
        int minValue = array[0];
        for (int value : array) {
            if (minValue > value) {
                minValue = value;
            }
        }
        return minValue;
    }
}