package instructor.lesson_8.demo_3;

class Engine {

    private String model;

    Engine(String model) {
        this.model = model;
    }

    String getModel() {
        return model;
    }

    void start() {
        System.out.println("Starting engine");
    }

    void stop() {
        System.out.println("Stopping engine");
    }
}
