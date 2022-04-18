package students.viktors_maksimovs.lesson_4.task_2;

import java.util.Scanner;

class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a number from 1 to 7");
        int val = scanner.nextInt();

        switch (val) {
            case 1 -> System.out.println("It's Monday");
            case 2 -> System.out.println("It's Tuesday");
            case 3 -> System.out.println("It's Wednesday");
            case 4 -> System.out.println("It's Thursday");
            case 5 -> System.out.println("It's Friday");
            case 6 -> System.out.println("It's Saturday");
            case 7 -> System.out.println("It's Sunday");
            default -> System.out.println("Wrong number");
        }
    }
}
