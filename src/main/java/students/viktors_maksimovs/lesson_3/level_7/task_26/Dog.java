package students.viktors_maksimovs.lesson_3.level_7.task_26;

class Dog {

    String name;
    String breed;
    int age;


    Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    void voice() {
        System.out.println("Name's " + name + ". And i'm a dog.");
        System.out.println("I'm a " + breed);
        System.out.println("I am " + age +" years old. Which is equal to " + age*7 + " human years");
    }
}
