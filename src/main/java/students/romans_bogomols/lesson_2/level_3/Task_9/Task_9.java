package students.romans_bogomols.lesson_2.level_3.Task_9;

public class Task_9 {

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Please enter your value");
        int value = scanner.nextInt();

        int valueXTwo = value * 2;
        int valueXThree = value * 3;
        int valueXFour = value * 4;
        int valueXFive = value * 5;
        int valueXSix = value * 6;
        int valueXSeven = value * 7;
        int valueXeight = value * 8;
        int valueXNine = value * 9;
        int valueXTen = value * 10;

        System.out.println("Test data: ");
        System.out.println("Input a number: " + value);
        System.out.println(value + " * " + 1 + " = " + value);
        System.out.println(value + " * " + 2 + " = " + valueXTwo);
        System.out.println(value + " * " + 3 + " = " + valueXThree);
        System.out.println(value + " * " + 4 + " = " + valueXFour);
        System.out.println(value + " * " + 5 + " = " + valueXFive);
        System.out.println(value + " * " + 6 + " = " + valueXSix);
        System.out.println(value + " * " + 7 + " = " + valueXSeven);
        System.out.println(value + " * " + 8 + " = " + valueXeight);
        System.out.println(value + " * " + 9 + " = " + valueXNine);
        System.out.println(value + " * " + 10 + " = " + valueXTen);


    }
}
