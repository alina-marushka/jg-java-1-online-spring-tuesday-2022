package instructor.lesson_6.demo_10;

import java.util.Random;
import java.util.Scanner;

class SlotApplication {

    public static void main(String[] args) {

        SlotPrompter slotPrompter = new SlotPrompter();
        SlotCarousel slotCarousel = new SlotCarousel(new Random(), 3);

        SlotMachine slotMachine = new SlotMachine(0, slotPrompter, slotCarousel);

        slotMachine.play();

    }
}
