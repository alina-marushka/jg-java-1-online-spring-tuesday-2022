package instructor.lesson_8.demo_6;

abstract class Shape {

    protected String name;
    protected String color;

    Shape(String name, String color) {
        this.name = name;
        this.color = color;
    }

    abstract int area();
    abstract int perimeter();
}
