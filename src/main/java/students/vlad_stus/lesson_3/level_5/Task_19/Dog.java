package students.vlad_stus.lesson_3.level_5.Task_19;

class Dog {

    String name;
    int age;
    String color;


    Dog(String name,  int age, String color){
        this.name = name;
        this.age=age;
        this.color = color;
    }

    void getVoice(){
        System.out.println("My name is: " + name);
        System.out.println("My color is: " + color );
        System.out.println("ГАВ-ГВ-ГАВ");
    }

    void happyBirthday() {
        System.out.println("I am "+ age++ +" years old! ");

    }
}
