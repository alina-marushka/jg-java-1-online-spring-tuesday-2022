package instructor.lesson_8.demo_1;

class Rectangle extends Shape {

    private int width;
    private int height;

    Rectangle(String borderColor, String color, int width, int height) {
        this.borderColor = borderColor;
        this.color = color;
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
