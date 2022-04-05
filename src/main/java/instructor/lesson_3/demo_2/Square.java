package instructor.lesson_3.demo_2;

class Square {

    int sideLength;

    Square(int sideLength) {
        this.sideLength = sideLength;
    }

    int perimeter() {
        return sideLength * 4;
    }

    int area() {
        return sideLength * sideLength;
    }

    void expandBy(int length) {
        sideLength += length; // short form of => sideLength = sideLength + length;
    }

    void shrinkBy(int length) {
        sideLength -= length; // short form of => sideLength = sideLength - length;
    }

    void printInformation() {
        System.out.println("-= Square =-");
        System.out.println("Side Length = " + sideLength);
        System.out.println("Perimeter   = " + perimeter());
        System.out.println("Area        = " + area());
        System.out.println();
    }
}
