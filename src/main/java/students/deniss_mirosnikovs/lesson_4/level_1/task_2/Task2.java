package students.deniss_mirosnikovs.lesson_4.level_1.task_2;

import java.util.Scanner;

class Task2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num = 0;

        while (num <= 0 || num > 7) {

            System.out.print("Enter number from 1 to 7: ");
            num = input.nextInt();
        }

        switch (num) {

            case 1: System.out.println("Output: Monday");
                    break;
            case 2: System.out.println("Output: Tuesday");
                    break;
            case 3: System.out.println("Output: Wednesday");
                    break;
            case 4: System.out.println("Output: Thursday");
                    break;
            case 5: System.out.println("Output: Friday");
                    break;
            case 6: System.out.println("Output: Saturday");
                    break;
            case 7: System.out.println("Output: Sunday");
                    break;

            default: System.out.println("Invalid weekday");
                    break;
        }
    }
}
