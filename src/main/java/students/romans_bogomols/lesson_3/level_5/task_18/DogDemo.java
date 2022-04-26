package students.romans_bogomols.lesson_3.level_5.task_18;

class DogDemo {

    public static void main(String[] args) {
        Dog dog = new Dog("Smoky", 12, "rainbow");
        dog.voice();
        dog.happyBirthday();
        dog.voice();
        dog.changeColor("black");
        dog.voice();
    }
}
