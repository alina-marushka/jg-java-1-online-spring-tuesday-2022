package instructor.lesson_8.demo_1;

class Square extends Shape {

    private int sideLength;

    Square(String borderColor, String color, int sideLength) {
        this.borderColor = borderColor;
        this.color = color;
        this.sideLength = sideLength;
    }

    public int getSideLength() {
        return sideLength;
    }
}
