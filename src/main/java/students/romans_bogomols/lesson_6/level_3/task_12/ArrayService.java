package students.romans_bogomols.lesson_6.level_3.task_12;

class ArrayService {
    boolean contains(int[] arr, int numberToSearch) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToSearch) {
                return true;
            }
        }
        return false;
    }

    int countOccurrences(int[] arr, int numberToSearch) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToSearch) {
                counter++;
            }
        }
        return counter;
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
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToReplace) {
                arr[i] = newNumber;
                counter++;
            }
        }
        return counter;
    }
    void reverse(int[] arr) {

    }
}
