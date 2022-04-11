package students.georgy_bakulin.lesson_3.level_5.task_19;

 class Dog {

    int age;

    public Dog(int age) {
        this.age = age;
    }

    void happyBirthday() {
        age ++;
        System.out.println("Dog's age is " + age + "years old ");
    }
    void voice(){
        System.out.println("Гав !");
    }
}
