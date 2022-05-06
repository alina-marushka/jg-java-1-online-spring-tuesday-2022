package students.viktors_maksimovs.lesson_6.level_3;

import java.util.Arrays;

class ArrayServiceDemo {
    public static void main(String[] args) {
        ArrayService arrayService = new ArrayService();
        int[] array = new int[]{1, 2, 3, 4, 5, 5, 6, 7, -1, -2, 50, 5};
        System.out.println(Arrays.toString(array));
        arrayService.reverse(array);
        System.out.println(Arrays.toString(array));
    }
}
