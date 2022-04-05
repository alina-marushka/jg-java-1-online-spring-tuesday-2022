package instructor.lesson_3.demo_2;

class SquareDemo {

    public static void main(String[] args) {

        Square squareOne = new Square(5);

        squareOne.printInformation();

        squareOne.expandBy(3);

        squareOne.printInformation();

        squareOne.shrinkBy(5);

        squareOne.printInformation();

//
//        squareOne.sideLength = 10;
//
//        squareOne.printInformation();


    }
}
