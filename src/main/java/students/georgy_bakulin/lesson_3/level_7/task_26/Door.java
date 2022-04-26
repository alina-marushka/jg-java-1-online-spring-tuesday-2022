package students.georgy_bakulin.lesson_3.level_7.task_26;

class Door {
String material;
String color;
int protectionClass;

    public Door(String material, String color, int protectionClass) {
        this.material = material;
        this.color = color;
        this.protectionClass = protectionClass;
    }
    void myDoor(){
        System.out.println("Door made of " + material);
        System.out.println("Door color is " + color);
        System.out.println("Door has " + protectionClass + " protection class ");
    }

}


