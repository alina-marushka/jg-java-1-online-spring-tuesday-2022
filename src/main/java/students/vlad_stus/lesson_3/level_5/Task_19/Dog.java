package students.vlad_stus.lesson_3.level_5.Task_19;

class Dog {

    String name;
    int age;


    Dog(String name,  int age){
        this.name = name;
        this.age=age;
    }

    void getVoice(){
        System.out.println("My name is: " + name);
        System.out.println("ГАВ-ГВ-ГАВ");
    }

    void happyBirthday() {
        System.out.println(age++);

    }
}
