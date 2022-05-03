package instructor.lesson_7.demo_1;

class CounterApplication {

    public static void main(String[] args) {

        Counter counter = new Counter();

        System.out.println("counter.value() = " + counter.value());


        counter.increment();
        counter.increment();
        counter.increment();
        counter.increment();

        System.out.println("counter.value() = " + counter.value());

        counter.decrement();
        counter.decrement();

        System.out.println("counter.value() = " + counter.value());

        counter.reset();

        System.out.println("counter.value() = " + counter.value());

    }
}
