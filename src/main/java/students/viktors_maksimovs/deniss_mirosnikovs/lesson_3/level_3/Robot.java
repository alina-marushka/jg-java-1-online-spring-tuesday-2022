package students.viktors_maksimovs.deniss_mirosnikovs.lesson_3.level_3;

class Robot {

    String name;

    public Robot(String robotName) {
        this.name = robotName;
    }

    void sayHello() {
        System.out.print("Hello! ");
    }

    void sayYourName() {
        System.out.println("My name is " + this.name + "!");
    }
}
