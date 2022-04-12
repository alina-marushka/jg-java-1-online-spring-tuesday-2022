package instructor.lesson_4.demo_2;

class Demo2 {

    public static void main(String[] args) {

        boolean f1 = true;
        boolean f2 = false;

        boolean and = f1 && f2; // false
        boolean or = f1 || f2; // true
        boolean not = !f1; // false

        System.out.println("and = " + and);
        System.out.println("or = " + or);
        System.out.println("not = " + not);

        // min <= x <= max

        int x = 5;

        boolean withinBounds = 0 <= x && x <= 10;

        System.out.println("!true = " + !true);

    }
}
