package students.viktors_maksimovs.lesson_5.level_2;

import java.util.Random;

class Task14 {

    public static void main(String[] args) {
        Random random = new Random();

        int numbers[] = new int[3];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }


        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }
        double avg = sum / (double) numbers.length;

        System.out.println("Avg is = " + avg);
    }

}
