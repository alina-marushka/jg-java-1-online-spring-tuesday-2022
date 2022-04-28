package students.deniss_mirosnikovs.lesson_5.level_2.task_11;

import java.util.Scanner;

class Task11 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numArray = new int[3];

        System.out.println("Enter three numbers: ");
        numArray[0] = input.nextInt();
        numArray[1] = input.nextInt();
        numArray[2] = input.nextInt();

        System.out.println(numArray[0] + " " + numArray[1] + " " + numArray[2]);

    }
}
