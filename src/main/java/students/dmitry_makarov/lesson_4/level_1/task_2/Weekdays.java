package students.dmitry_makarov.lesson_4.level_1.task_2;

import java.util.Scanner;

 class Weekdays {
    public static void main(String[] args) {

        Scanner dayInput = new Scanner(System.in);

        System.out.print("Please input a number (1-7): ");
        int day= dayInput.nextInt();

        if (day >= 8) {
            System.out.println("number is too big");
        }

        else {
            switch (day) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
            }
        }
    }
}
