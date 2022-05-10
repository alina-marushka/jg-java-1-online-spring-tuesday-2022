package instructor.lesson_8.demo_6;

class Rectangle extends Shape {

    private int width;
    private int height;

    Rectangle(String color, int width, int height) {
        super("Rectangle", color);
        this.width = width;
        this.height = height;
    }

    @Override
    int area() {
        return width * height;
    }

    @Override
    int perimeter() {
        return (width + height) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}
