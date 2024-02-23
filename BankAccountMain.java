package access;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount bank=new BankAccount();
        bank.deposit(10000);
        bank.withdraw(3000);
        System.out.println("bank.getBalance() = " + bank.getBalance());
    }
}
