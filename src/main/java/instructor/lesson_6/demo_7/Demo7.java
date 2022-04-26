package instructor.lesson_6.demo_7;

class Demo7 {

    public static void main(String[] args) {

        Message.instancesCount = 100500;

        Message message1 = new Message("hello");
        message1.print();

        Message message2 = new Message("world");
        message2.print();

        Message message3 = new Message("today");
        message3.print();

        System.out.println(Math.PI);

    }
}
