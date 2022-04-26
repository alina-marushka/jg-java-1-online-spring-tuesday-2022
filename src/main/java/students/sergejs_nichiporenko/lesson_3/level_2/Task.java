package students.sergejs_nichiporenko.lesson_3.level_2;

import java.util.Scanner;

class Task {

    public static void main(String[] args) {
        String myName = "Sergey";
        System.out.println(myName);
        System.out.println("Hi " + myName + "!");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, what is your name?");
        String UserName = scanner.next();
        System.out.println("Hello " + UserName + "!");
    }

}
