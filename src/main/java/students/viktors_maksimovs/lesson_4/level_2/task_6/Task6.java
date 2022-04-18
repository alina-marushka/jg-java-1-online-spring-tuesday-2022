package students.viktors_maksimovs.lesson_4.level_2.task_6;

import java.util.Scanner;

class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your First number");
        int val1 = scanner.nextInt();

        System.out.println("Enter your Second number");
        int val2 = scanner.nextInt();

        if (val1 == val2) {
            System.out.println("Numbers are equal");
        }
        else  {
            System.out.println("Numbers are different");
        }

    }

}

