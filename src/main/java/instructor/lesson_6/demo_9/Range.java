package instructor.lesson_6.demo_9;

public class Range {

    private int leftBound;
    private int rightBound;

    private Range(int leftBound, int rightBound) {
        this.leftBound = leftBound;
        this.rightBound = rightBound;
    }

    public static Range of(int leftBound, int rightBound) {
        return new Range(leftBound, rightBound);
    }

    public static Range ofLeft(int leftBound) {
        return new Range(leftBound, Integer.MAX_VALUE);
    }

    public static Range ofRight(int rightBound) {
        return new Range(Integer.MIN_VALUE, rightBound);
    }

    public int left() {
        return leftBound;
    }

    public int right() {
        return rightBound;
    }

    public String asString() {
        return "Range(leftBound = '" + leftBound + "', rightBound = '" + rightBound + "')";
    }

//    Range(int leftBound) {
//        this.leftBound = leftBound;
//        this.rightBound = Integer.MAX_VALUE;
//    }
//
//    Range(int rightBound) {
//        this.leftBound = Integer.MIN_VALUE;
//        this.rightBound = rightBound;
//    }
}
