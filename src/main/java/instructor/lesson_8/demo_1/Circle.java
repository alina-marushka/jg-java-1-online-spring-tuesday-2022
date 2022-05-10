package instructor.lesson_8.demo_1;

class Circle extends Shape {

    private int radius;

    Circle(String borderColor, String color, int radius) {
        this.borderColor = borderColor;
        this.color = color;
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }
}
