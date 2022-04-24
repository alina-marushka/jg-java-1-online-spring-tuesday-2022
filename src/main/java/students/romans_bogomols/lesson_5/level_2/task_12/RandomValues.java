package students.romans_bogomols.lesson_5.level_2.task_12;

import java.util.Random;

class RandomValues {

    public static void main(String[] args) {

        Random random = new Random();

        int[] randomValues = new int[3];

        for (int i = 0; i < randomValues.length; i++) {
            randomValues[i] = random.nextInt(1000);
        }

        for (int i = 0; i < randomValues.length; i++) {
            System.out.print("Random value #" + (i + 1) + " is: ");
            System.out.println(randomValues[i]);
        }
    }

}

