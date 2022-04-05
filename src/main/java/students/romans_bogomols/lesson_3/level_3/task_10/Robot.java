package students.romans_bogomols.lesson_3.level_3.task_10;

class Robot {

    String name;

    public Robot(String robotName) {
        this.name = robotName;                      // нужно ли оставлять public?
    }
    public void sayHello() {
        System.out.println("Hello!");               // нужно ли оставлять public?
    }

    public void sayYourName() {                         // нужно ли оставлять public?
        System.out.println("My name is " + this.name);

    }
}
