package instructor.lesson_8.demo_7;

class Motherboard {

    private Processor processor;

    Motherboard(Processor processor) {
        this.processor = processor;
    }

    void power() {
        System.out.println("Power up!");
        System.out.println("Performing computations...");
        processor.process();
    }
}
