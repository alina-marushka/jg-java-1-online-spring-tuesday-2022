package instructor.lesson_6.demo_9;

class Range {

    int leftBound;
    int rightBound;

    Range(int leftBound, int rightBound) {
        this.leftBound = leftBound;
        this.rightBound = rightBound;
    }

    static Range ofLeft(int leftBound) {
        return new Range(leftBound, Integer.MAX_VALUE);
    }

    static Range ofRight(int rightBound) {
        return new Range(Integer.MIN_VALUE, rightBound);
    }

    String asString() {
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
