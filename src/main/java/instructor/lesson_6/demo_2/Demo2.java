package instructor.lesson_6.demo_2;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

class Demo2 {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Start");

        LocalDateTime deadline = LocalDateTime.now().plusSeconds(30);
        LocalDateTime current = LocalDateTime.now();

        while (current.isBefore(deadline)) {
            System.out.println(current);

//            Thread.sleep(1_000); // Same as below
            TimeUnit.SECONDS.sleep(1);
            current = LocalDateTime.now();
        }

        System.out.println("Finish");

    }
}
