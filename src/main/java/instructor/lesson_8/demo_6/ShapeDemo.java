package instructor.lesson_8.demo_6;

class ShapeDemo {

    public static void main(String[] args) {

        Square square = new Square("red", 4);
        Rectangle rectangle = new Rectangle("blue", 6, 3);

        Shape shape1 = new Square("green", 10);
        Shape shape2 = new Rectangle("white", 5, 4);

        System.out.println(square);
        System.out.println(rectangle);

        printShapeArea(square);
        printShapeArea(rectangle);

        printSquareArea(square);
        printRectangleArea(rectangle);
    }

    static void printShapeArea(Shape shape) {
        System.out.println(shape.name + " = " + shape.area());
    }

    static void printSquareArea(Square square) {
        System.out.println(square.name + " = " + square.area());
    }

    static void printRectangleArea(Rectangle rectangle) {
        System.out.println(rectangle.name + " = " + rectangle.area());
    }
}
