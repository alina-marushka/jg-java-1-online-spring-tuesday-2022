package students.vlad_stus.lesson_3.level_5.Task_20;



class Dog {

    String name;
    String color;
    int age;

    Dog(String name, String color, int age){
        this.name= name;
        this.color = color;
        this.age=age;
    }

    void voice(){
        System.out.println("My name is: "+ name +". My color is: "+color + ". My age is: "+age);
    }

    void changeColor(String newColor) {
        this.color= newColor;
    }
}
