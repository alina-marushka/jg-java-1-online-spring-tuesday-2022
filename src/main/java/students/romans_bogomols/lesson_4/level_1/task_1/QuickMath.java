package students.romans_bogomols.lesson_4.level_1.task_1;


import java.util.Scanner;

class QuickMath {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your value ");
        int value = scanner.nextInt();
        QuickMath quickMath = new QuickMath();
        quickMath.checkIfPositive(value);
    }
    void checkIfPositive(int value) {
        if (value > 0) {
            System.out.println("Value is a positive");
        } else if (value < 0) {
            System.out.println("Value is a negative");
        } else {
            System.out.println("Value equals zero");
        }

    }

}

