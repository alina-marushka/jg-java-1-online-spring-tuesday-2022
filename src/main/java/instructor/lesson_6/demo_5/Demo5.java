package instructor.lesson_6.demo_5;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

class Demo5 {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Start");

        LocalDateTime deadline = LocalDateTime.now().plusSeconds(10);

        while (true) {
            LocalDateTime current = LocalDateTime.now();

            if (current.isAfter(deadline)) {
                System.out.println("Current is after deadline, breaking");
                break;
            }

            System.out.println(current);
            TimeUnit.SECONDS.sleep(1);
        }

        System.out.println("Finish");

    }
}
