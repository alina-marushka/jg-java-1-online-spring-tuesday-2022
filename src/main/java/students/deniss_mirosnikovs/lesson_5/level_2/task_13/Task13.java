package students.deniss_mirosnikovs.lesson_5.level_2.task_13;

import java.util.Random;

class Task13 {

    public static void main(String[] args) {

        Random random = new Random();

        int[] numArray = new int[3];

        numArray[0] = random.nextInt(100);
        numArray[1] = random.nextInt(100);
        numArray[2] = random.nextInt(100);

        int sum = numArray[0] + numArray[1] + numArray[2];

        System.out.println(numArray[0]+ " " + numArray[1] + " " + numArray[2]);
        System.out.println("Sum = " + sum);
    }
}
