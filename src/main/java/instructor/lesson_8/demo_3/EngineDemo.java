package instructor.lesson_8.demo_3;

class EngineDemo {

    public static void main(String[] args) {

        Engine engine = new Engine("foo");

        DieselEngine dieselEngine = new DieselEngine("bar");
        DieselEngine defaultDieselEngine = new DieselEngine();

        System.out.println("engine.getModel() = " + engine.getModel());
        System.out.println("dieselEngine.getModel() = " + dieselEngine.getModel());
        System.out.println("defaultDieselEngine.getModel() = " + defaultDieselEngine.getModel());

        engine.start();
        engine.stop();

        dieselEngine.start();
        dieselEngine.stop();
    }
}
