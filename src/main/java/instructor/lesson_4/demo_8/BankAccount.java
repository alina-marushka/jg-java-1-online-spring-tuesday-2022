package instructor.lesson_4.demo_8;

class BankAccount {

    int balance;

    BankAccount() {
        this.balance = 0;
    }

    BankAccount(int balance) {
        this.balance = balance;
    }

    void deposit(int amount) {
        if (amount > 0) {
            balance += amount; // balance = balance + amount;
            System.out.println("Deposit OK - " + amount);
        } else {
            System.out.println("Deposit NOK: Negative amount - " + amount);
        }
    }

    void withdraw(int amount) {
        if (amount > 0) {

            if (amount < balance) {
                balance -= amount;
                System.out.println("Withdraw OK - " + amount);
            } else {
                System.out.println("Withdraw NOK: Insufficient funds - " + amount);
            }

        } else {
            System.out.println("Withdraw NOK: Negative amount - " + amount);
        }
    }

    void printStatement() {
        System.out.println("Current balance: " + balance);
    }
}
