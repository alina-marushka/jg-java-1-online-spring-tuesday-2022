package instructor.lesson_6.demo_10;

class SlotMachine {

    int balance;
    SlotPrompter prompter;
    SlotCarousel carousel;

    SlotMachine(int balance, SlotPrompter prompter, SlotCarousel carousel) {
        this.balance = balance;
        this.prompter = prompter;
        this.carousel = carousel;
    }

    void play() {
        while (true) {

            if (balance <= 0) {
                System.out.println("You are out of cash 😢");

                if (prompter.wantDeposit()) {
                    deposit();
                } else {
                    System.out.println("Come back when you want to deposit");
                    break;
                }
            }

            System.out.println("Current balance: " + balance + "$");

            if (!prompter.playNextRound()) {
                System.out.println("🔥 See you soon 🔥");
                break;
            }

            carousel.spin();
            carousel.display();

            if (carousel.won()) {
                System.out.println("💰 You WON! 💰");
                balance += 500;
            } else {
                System.out.println("💸 Better luck next time! 💸");
                balance -= 20;
            }

            System.out.println();
        }
    }

    void deposit() {
        this.balance += prompter.promptDepositAmount();
    }
}
