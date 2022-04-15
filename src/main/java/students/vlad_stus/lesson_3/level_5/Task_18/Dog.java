package students.vlad_stus.lesson_3.level_5.Task_18;

class Dog {

    String name;
    int age;


    Dog(String name, int age){
        this.name = name;
        this.age = age;
    }

    void getvoice(){
        System.out.println(name);
        System.out.println(age);
        System.out.println("ГАВ-ГАВ-ГАВ");
    }
}
