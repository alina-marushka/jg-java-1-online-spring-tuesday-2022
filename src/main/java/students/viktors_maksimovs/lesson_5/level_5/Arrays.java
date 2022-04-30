package students.viktors_maksimovs.lesson_5.level_5;

import java.util.Random;

class Arrays {

    public int[] create(int length) {
        return new int[length];
    }

    void fillRandomly(int[] array) {

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000);
        }
    }

    public void print(int[] array) {

        for (int value : array) {
            System.out.print(value + " ");
        }
    }

    public int findMax(int[] array) {
        int max = array[0];
        for (int value : array) {
            if (max < value) {
                max = value;
            }
        }
        return max;
    }

    public int findMin(int[] array) {
        int min = array[0];
        for (int value : array) {
            if (min > value) {
                min = value;
            }
        }
        return min;    }


}
