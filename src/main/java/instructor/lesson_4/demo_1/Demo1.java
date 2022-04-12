package instructor.lesson_4.demo_1;

class Demo1 {

    public static void main(String[] args) {

        int a = 10;
        int b = 100;

        boolean equal = a == a; // true
        boolean notEqual = a != b; // true
        boolean greaterThan = a > b; // false
        boolean greaterThanOrEqual = b >= a; // true
        boolean lesserThan = a < b; // true
        boolean lesserThanOrEqual = a <= b; // true

        boolean compareWithLiteral = a > 10; // false

        System.out.println("equal = " + equal);
        System.out.println("notEqual = " + notEqual);
        System.out.println("greaterThan = " + greaterThan);
        System.out.println("greaterThanOrEqual = " + greaterThanOrEqual);
        System.out.println("lesserThan = " + lesserThan);
        System.out.println("lesserThanOrEqual = " + lesserThanOrEqual);

        System.out.println("compareWithLiteral = " + compareWithLiteral);

    }
}
