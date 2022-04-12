package instructor.lesson_4.demo_5;

class IfElseIfDemo {

    public static void main(String[] args) {

        System.out.println("Start"); // 1

        boolean condition1 = false;
        boolean condition2 = false;
        boolean condition3 = true;

        if (condition1) {
            System.out.println("Inside if branch"); // 2
        } else if (condition2) {
            System.out.println("Inside 1st else if branch"); // 3
        } else if (condition3) {
            System.out.println("Inside 2nd else if branch"); // 4
        }

        System.out.println("Finish"); // 5

    }
}
