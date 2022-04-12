package instructor.lesson_4.demo_8;

class BankAccountDemo {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();

        bankAccount.printStatement();
        bankAccount.deposit(100);

        bankAccount.printStatement();
        bankAccount.deposit(200);

        bankAccount.printStatement();
        bankAccount.withdraw(400);

        bankAccount.deposit(-5000);
        bankAccount.withdraw(-10);

        bankAccount.printStatement();
    }
}
