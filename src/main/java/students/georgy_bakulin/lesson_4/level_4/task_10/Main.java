package students.georgy_bakulin.lesson_4.level_4.task_10;

class Main {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        System.out.println("Sum of 2 numbers is " + calculator.sum(10,5));
        System.out.println("Sub of 2 numbers is " + calculator.sub(8, 4));
        System.out.println("Mul of 2 numbers is " + calculator.mul(6, 8));
        System.out.println("Div of 2 numbers is " + calculator.div(90, 9));
        System.out.println("Is this even  number ? " + calculator.isEven(6));
        System.out.println("Which of these two numbers  biggest ?" + calculator.maxOfTwoNumbers(11, 74));
        System.out.println("Which of these three numbers  biggest ?" + calculator.maxOfThreeNumbers(61,32,717));
    }
}
