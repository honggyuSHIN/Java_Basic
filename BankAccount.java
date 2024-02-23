package access;

public class BankAccount {
    private int balance;

    public BankAccount() {
        balance=0;
    }

    public void deposit(int amount) {
        if (isAmountValid(amount)) {
            balance += amount;
        } else {
            System.out.println("유효하지 않은 금액입니다.");
        }
    }

    private boolean isAmountValid(int amount) {
        return amount>0;
    }

    public void withdraw(int amount) {
        if (isAmountValid(amount) && balance >= amount) {
            balance -= amount;
            System.out.println("출금하였습니다.");
        } else {
            System.out.println("유효하지 않은 금액이거나 잔액이 부족합니다.");
        }
    }

    public int getBalance() {
        return balance;
    }
}
