package instructor.lesson_6.demo_10;

import java.util.Scanner;

class SlotPrompter {

//    Scanner scanner;
//
//    SlotPrompter(Scanner scanner) {
//        this.scanner = scanner;
//    }

    boolean playNextRound() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("🤑 You play [Y/N]: ");
        return "Y".equals(scanner.nextLine());
    }

    boolean wantDeposit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("🤑 You deposit [Y/N]: ");
        return "Y".equals(scanner.nextLine());
    }

    int promptDepositAmount() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Deposit amount: ");
        return scanner.nextInt();
    }
}
