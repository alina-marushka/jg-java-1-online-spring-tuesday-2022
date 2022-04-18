package instructor.dmitry_makarov.lesson_3.level_3.task_10_11_12;

class RobotDemo {
    public static void main(String[] args) {

        Robot robot1 = new Robot("Bender");
        robot1.sayHello();
        robot1.sayYourName();

        Robot robot2 = new Robot("R2D2" );
        robot2.sayHello();
        robot2.sayYourName();
    }
}