package students.romans_bogomols.lesson_4.level_1.task_3;

import java.util.Scanner;

class OddOrEven {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter value ");
        int value = scanner.nextInt();
        OddOrEven oddOrEven = new OddOrEven();
        oddOrEven.checkIfOddOrEven(value);
    }

    void checkIfOddOrEven (int value) {
        if (value % 2 == 0) {
            System.out.printf("Your value is even value");
        } else {
            System.out.printf("Your value is odd value");
        }
    }

}
