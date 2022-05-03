package instructor.lesson_6.demo_9;

class RangeDemo {

    public static void main(String[] args) {

//        Range range = new Range(10, 100);

        Range range = Range.of(10, 100);
        Range leftRange = Range.ofLeft(50);
        Range rightRange = Range.ofRight(500);

        System.out.println("range.asString() = " + range.asString());
        System.out.println("leftRange.asString() = " + leftRange.asString());
        System.out.println("rightRange.asString() = " + rightRange.asString());

    }
}
