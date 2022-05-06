package students.viktors_maksimovs.lesson_6.level_4.task_21;

import java.util.Random;

class TwoDimensionalArray {
    int[][] arrayMaker(int column, int row) {
        Random random = new Random();

        int[][] array = new int[column][row];

        for (int i = 0; i < array.length; i++) {
            for (int x = 0; x < array[i].length; x++) {
                array[i][x] = random.nextInt(100);
            }
        }

        return array;
    }

    int arraySummer( int[][] twoDimArray) {
        int result = 0;
        for(int i = 0; i < twoDimArray.length; i++) {
            for (int x = 0; x < twoDimArray[i].length; x++) {
                result = result + twoDimArray[i][x];
            }
        }

        return result;

    }


}





