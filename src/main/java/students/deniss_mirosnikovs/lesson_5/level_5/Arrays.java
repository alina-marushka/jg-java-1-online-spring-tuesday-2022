package students.deniss_mirosnikovs.lesson_5.level_5;

import java.util.Random;

class Arrays {

    public int[] create(int length) {
        return new int[length];
    }

    public void fillRandomly(int[] array) {
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
    }

    public void print(int[] array) {

        System.out.print("[ ");
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.print("]\n");
    }

    public int findMax(int[] array) {
        int maxNumber = array[0];

        for (int i : array) {
            if (i > maxNumber) {
                maxNumber = i;
            }
        }
        return maxNumber;
    }

    public int findMin(int[] array) {
        int minNumber = array[0];

        for (int i : array) {
            if (i < minNumber) {
                minNumber = i;
            }
        }
        return minNumber;
    }
}
