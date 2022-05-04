package students.viktors_maksimovs.lesson_6.level_4.task_21;

import java.util.Random;

public class TwoDimensionalArray {
    int sumOfArray(int[][] array, int column, int row) {
        Random random = new Random();

        array = new int[column][row];

        for (int i = 0; i < array.length; i++) {
            for (int x = 0; x < array[i].length; x++) {
                array[i][x] = random.nextInt(100);
            }
        }
        int sum = 0;
        for (int[] arr : array)
            for(int i: arr)
                sum+=i;

    }



}

    /*
    int[][] arrayMaker(int column, int row) {
        Random random = new Random();

        int[][] array = new int[column][row];

        for (int i = 0; i < array.length; i++) {
            for (int x = 0; x < array[i].length; x++) {
                array[i][x] = random.nextInt(100);
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
        return array;
    }
    int sum(int[][] arr) {

    }
}





