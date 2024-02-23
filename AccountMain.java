package oop01.ex;

public class AccountMain {
    public static void main(String[] args) {
        Account account=new Account();
        account.deposit(1000);
        account.withdraw(2000);
        account.withdraw(500);
    }
}
