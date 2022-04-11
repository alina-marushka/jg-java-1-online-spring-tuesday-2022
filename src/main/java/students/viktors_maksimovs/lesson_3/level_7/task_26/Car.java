package students.viktors_maksimovs.lesson_3.level_7.task_26;
class Car {

    String brand;
    String color;
    int topSpeed;



    Car(String brand, String color, int topSpeed) {
        this.brand = brand;
        this.color = color;
        this.topSpeed = topSpeed;
    }

    void info() {
        System.out.println("This " +color+ " " +brand+ " can reach a Top speed of "+topSpeed+ "km/hour.");

    }
}

