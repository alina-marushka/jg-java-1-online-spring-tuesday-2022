package students.sergejs_nichiporenko.lesson_2.level_1;

public class Task2 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Enter first value");
        double firstDoubleNumber = scanner.nextDouble();

        System.out.println("Enter second value");
        double secondDoubleNumber = scanner.nextDouble();

        double sumOfDoubles = firstDoubleNumber + secondDoubleNumber;
        double subtractionOfDoubles = firstDoubleNumber - secondDoubleNumber;
        double multiplicationOfDoubles = firstDoubleNumber * secondDoubleNumber;
        double divisionOfDoubles = firstDoubleNumber / secondDoubleNumber;

        System.out.println(firstDoubleNumber + " + " + secondDoubleNumber + " = " + sumOfDoubles);
        System.out.println(firstDoubleNumber + " - " + secondDoubleNumber + " = " + subtractionOfDoubles);
        System.out.println(firstDoubleNumber + " * " + secondDoubleNumber + " = " + multiplicationOfDoubles);
        System.out.println(firstDoubleNumber + " / " + secondDoubleNumber + " = " + divisionOfDoubles);
    }
}
