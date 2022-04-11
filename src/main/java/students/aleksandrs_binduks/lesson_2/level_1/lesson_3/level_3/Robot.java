package students.aleksandrs_binduks.lesson_2.level_1.lesson_3.level_3;

class Robot {

    String name;

    public Robot(String robotName){
        this.name = robotName;
    }

    public void sayHello () {
        System.out.println("Hello!");
    }

    void sayYourName (){
        System.out.println("My name is " + this.name);
    }
}
