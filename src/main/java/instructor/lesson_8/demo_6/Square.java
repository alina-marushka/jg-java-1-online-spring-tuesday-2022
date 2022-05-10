package instructor.lesson_8.demo_6;

class Square extends Shape {

    private int side;

    public Square(String color, int side) {
        super("Square", color);
        this.side = side;
    }

    public int side() {
        return side;
    }

    @Override
    int area() {
        return side * side;
    }

    @Override
    int perimeter() {
        return side * 4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}
