package students.dmitry_makarov.lesson_5.level_4.task_29;

import java.util.Arrays;
import java.util.Random;

class EvenOfRandomArray {
    public static void main(String[] args) {

    Random random = new Random();
    int arrayLength = random.nextInt(100);

    int numbers [] = new int[arrayLength];

        System.out.println(Arrays.toString(numbers));

        for (int i = 0; i < numbers.length; i++) {
            numbers [i] = random.nextInt();
        }

        System.out.println(Arrays.toString(numbers));

        System.out.println("Even numbers are: ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers [i] %2 == 0) {
                System.out.print("[ " + numbers [i] + "]  ");
            }

        }
    }
}
