package students.romans_bogomols.lesson_3.level_7.task_26;

class Cat {

    String name;
    String breed;
    double age;
    int ageAfterHalfYear;
    boolean catLovesToEat;

    public Cat(String name, String breed, double age, int ageAfterHalfYear, boolean catLovesToEat) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.ageAfterHalfYear = ageAfterHalfYear;
        this.catLovesToEat = catLovesToEat;
    }

    void voice() {
        System.out.println("Hello, my name is " + name);
        System.out.println("I'm " + breed);
        System.out.println("My age is " + age);
        System.out.println("After half year my age will be " + ageAfterHalfYear);
        System.out.println("Best thing i like is eat " + catLovesToEat);
    }
}
