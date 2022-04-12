package instructor.lesson_4.demo_9;

class RectangleDemo {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(10, 13);
        rectangle.print();

        if (rectangle.isSquare()) {
            System.out.println("This rectangle is square shaped");
        } else {
            System.out.println("This rectangle is regular rectangle");
        }

    }
}
