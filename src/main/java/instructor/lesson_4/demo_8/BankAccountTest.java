package instructor.lesson_4.demo_8;

class BankAccountTest {

    public static void main(String[] args) {
        BankAccountTest testRunner = new BankAccountTest();

        testRunner.shouldDeposit();
        testRunner.insufficientFunds();
    }

    void shouldDeposit() {
        BankAccount subject = new BankAccount(0);

        subject.deposit(100);

        int expected = 100;
        int actual = subject.balance;

        assertThatEqual(expected, actual, "Deposit positive amount");
    }

    void insufficientFunds() {
        BankAccount subject = new BankAccount(50);

        subject.withdraw(150);

        int expected = 50;
        int actual = subject.balance;

        assertThatEqual(expected, actual, "Reject withdrawal due to insufficient funds");
    }

    void assertThatEqual(int expected, int actual, String scenario) {
        if (expected == actual) {
            System.out.println("[ OK ]: " + scenario + " passed!");
        } else {
            System.out.println("[FAIL]: " + scenario + " failed!");
        }
    }
}
