package instructor.lesson_5.demo_8;

import java.util.Scanner;

class Prompter {

    Scanner scanner;

    Prompter() {
        this.scanner = new Scanner(System.in);
    }

    int promptLength() {
        System.out.print("Please enter desired password length: ");
        return scanner.nextInt();
    }

    boolean promptAlpha() {
        System.out.print("Should I include alpha characters [a-z]: ");
        return scanner.nextBoolean();
    }

    boolean promptNumeric() {
        System.out.print("Should I include alpha characters [0-9]: ");
        return scanner.nextBoolean();
    }

    boolean promptSpecial() {
        System.out.print("Should I include alpha characters [!-%]: ");
        return scanner.nextBoolean();
    }
}
