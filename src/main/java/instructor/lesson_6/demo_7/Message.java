package instructor.lesson_6.demo_7;

class Message {

    static int instancesCount = 0;
    String text;

    public Message(String text) {
        this.text = text;
        instancesCount++;
    }

    void print() {
        System.out.println("Message[text = '" + text + "', instancesCount = '" + instancesCount + "']");
    }
}
