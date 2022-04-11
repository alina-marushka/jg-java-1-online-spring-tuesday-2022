package students.georgy_bakulin.lesson_3.level_5.task_21;

import java.awt.*;

public class Dog {


    int age;
    String color;

    String  colors []= {"Tan", "Black-and-black", "Brindle", "Sable","Black","Brown"};

    public Dog(int age, String color) {
        this.age = age;
        this.color = color;
    }

    void changeColor(String newColor) {
color= colors[(int) (Math.random() * colors.length)];
        System.out.println("New Dog's color is " + color);
        System.out.println();
    }
   void voice (){
       System.out.println( "Dog's age " + age +  " years old " + "Dog's color is" + color );
    }
}
