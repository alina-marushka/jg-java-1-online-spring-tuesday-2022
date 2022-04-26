package instructor.lesson_6.demo_4;

import java.util.Random;

class Demo4 {

    public static void main(String[] args) {

        System.out.println("Let's play some basketball ⛹️");

        Random random = new Random();

        int chance = 1;
        int throwSuccess;

        do {

            System.out.println("Throwin' a ball 🏀");
            throwSuccess = random.nextInt(100);

        } while (throwSuccess < (100 - chance));

        System.out.println("🔥 Score 🔥");

    }
}
