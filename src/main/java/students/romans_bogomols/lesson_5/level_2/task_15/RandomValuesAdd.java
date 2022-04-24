package students.romans_bogomols.lesson_5.level_2.task_15;

import java.util.Random;

class RandomValuesAdd {

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

        for (int i = 0; i < randomValues.length; i++) {
        randomValues[i] = randomValues[i] + 2;
        }

        for (int i = 0; i < randomValues.length; i++) {
            System.out.print("Random value #" + (i + 1) + " is: " + (randomValues[i] - 2) + " + 2 = ");
            System.out.println(randomValues[i]);
        }
    }
}
