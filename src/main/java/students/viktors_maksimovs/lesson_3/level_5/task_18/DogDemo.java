package students.viktors_maksimovs.lesson_3.level_5.task_18;

class DogDemo {

    public static void main(String[] args) {
        Dog dog = new Dog("Bill", 7, "Gray");
        dog.voice();
        dog.happyBirthday();
        dog.voice();
        dog.changeColor("Black");
        dog.voice();

    }
}
