package students.dmitry_makarov.lesson_4.level_7.task_17;

class FizzBuzzDemo {
    public static void main(String[] args) {

        FizzBuzz fizzBuzz = new FizzBuzz(15);
        fizzBuzz.detect();
        String fizzBuzzPrint = fizzBuzz.detect();
        System.out.println(fizzBuzzPrint);
    }
}

