package students.romans_bogomols.lesson_5.level_2.task_14;

import java.util.Random;

class AverageOfRandomValues {

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

        int sum = 0;

        for (int randomValue : randomValues) {
            sum += randomValue;
        }
        double avg = sum / (double) randomValues.length;

        System.out.println("Avg is = " + avg);
    }

}
