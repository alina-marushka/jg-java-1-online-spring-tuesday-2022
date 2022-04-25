package students.vlad_stus.lesson_3.level_4.task_16;

class BankAccount {

    String ownerFirstName;
    String ownerLastName;
    long moneyAmount;

    BankAccount(String ownerFirstName, String ownerLastName, long moneyAmount) {
        this.ownerFirstName = ownerFirstName;
        this.ownerLastName = ownerLastName;
        this.moneyAmount = moneyAmount;
    }

    String getOwnerFirstName() {
        return this.ownerFirstName;
    }

    String getOwnerLastName() {
        return this.ownerFirstName;
    }

    long getMoneyAmount() {
        return this.moneyAmount;
    }

}
