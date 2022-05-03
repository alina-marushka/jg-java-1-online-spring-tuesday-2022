package instructor.lesson_6.demo_10;

import java.util.Random;

class SlotCarousel {

    private static String[] images = {"🍓", "🍋", "🍉", "🥝", "🍑", "🫐", "🍇", "🍒", "🧉"};

    private String[] bars;
    private Random random;

    SlotCarousel(Random random, int length) {
        this.random = random;
        this.bars = new String[length];
    }

    void spin() {
        for (int i = 0; i < bars.length; i++) {
            bars[i] = randomImage();
        }
    }

    void display() {
        System.out.print(">> ");
        for (String bar : bars) {
            System.out.print(bar);
        }
        System.out.println(" <<");
    }

    boolean won() {
        for (int i = 1; i < bars.length; i++) {
            if (!bars[0].equals(bars[i])) {
                return false;
            }
        }
        return true;
    }

    private String randomImage() {
        return images[random.nextInt(images.length)];
    }
}
