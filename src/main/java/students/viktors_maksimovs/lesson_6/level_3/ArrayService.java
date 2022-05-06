package students.viktors_maksimovs.lesson_6.level_3;

import java.util.Arrays;

class ArrayService {

    boolean contains(int[] arr, int numberToSearch) {

        for (int value : arr) {
            if (value == numberToSearch) {
                return true;
            }
        }
        return false;
    }

    int countOccurrences(int[] arr, int numberToSearch) {

        int x= 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToSearch) {
                x++;
            }
        }
        return  x;

    }

    boolean replaceFirst(int[] arr, int numberToReplace, int newNumber) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToReplace) {
                arr[i] = newNumber;
                return true;
            }
        }
        return false;
    }

    int replaceAll(int[] arr, int numberToReplace, int newNumber) {
        int x= 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToReplace) {
                arr[i] = newNumber;
                x++;
            }
        }
        return  x;

    }

    void reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int j = arr.length - 1 - i;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    void sort(int[] arr) {
        Arrays.sort(arr);
        System.out.print(Arrays.toString(arr));
        }


}
