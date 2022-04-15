package students.vlad_stus.lesson_3.level_3.Task_10;

class RobotDemo {

    public static void main(String[] args) {

        Robot robotZero = new Robot();
        robotZero.sayHello();
        robotZero.sayYourName();

        System.out.println();

        Robot robotOne = new Robot("John");
        robotOne.sayHello();
        robotOne.sayYourName();

        System.out.println();

        Robot robotTwo = new Robot("Vlad");
        robotTwo.sayHello();
        robotTwo.sayYourName();
}

}
