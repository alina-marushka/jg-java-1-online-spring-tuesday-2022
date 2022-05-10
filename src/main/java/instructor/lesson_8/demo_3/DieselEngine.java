package instructor.lesson_8.demo_3;

class DieselEngine extends Engine {

    DieselEngine() {
        super("default-value");
    }

    DieselEngine(String model) {
        super(model);
    }

    @Override
    void start() {
        System.out.println("Starting diesel engine");
    }

    @Override
    void stop() {
        System.out.println("(Before super.stop()) Diesel");
        super.stop();
        System.out.println("(After super.stop()) Diesel");
    }
}
