package students.romans_bogomols.lesson_3.level_5.task_18;

class Dog {

    String name;
    int age;
    String color;

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    void voice() {
        System.out.println("Woof " + name + ", " + age + ", " + color + ".");
    }

    void happyBirthday() {
        age++;
    }
    void changeColor(String newColor) {
       color = newColor;
    }
}
