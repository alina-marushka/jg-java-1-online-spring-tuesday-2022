package instructor.lesson_7.demo_1;

class Counter {

    private int value;

    void increment() {
        if (isBelow(100)) {
            value++;
        }
    }

    void decrement() {
        value--;
    }

    void reset() {
        value = 0;
    }

    int value() {
        return value;
    }

    private boolean isBelow(int threshold) {
        return value < threshold;
    }
}
