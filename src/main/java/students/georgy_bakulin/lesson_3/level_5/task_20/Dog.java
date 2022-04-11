package students.georgy_bakulin.lesson_3.level_5.task_20;

import java.awt.*;

 class Dog {

    String name;
    int age;
    String color;

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;


    }
    public void voice(){
        System.out.println("Dog's name is " + name );
        System.out.println("Dog's age is " + age + "years old ");
        System.out.println("Dog's color is " + color);
    }
}
