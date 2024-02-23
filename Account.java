package oop01.ex;
import java.util.Scanner;
public class Account {
    Scanner scanner = new Scanner(System.in);
    int balance=0;

//    void deposit(){
//        System.out.println("입금 금액 입력 : ");
//        int money=scanner.nextInt();
//        balance+=money;
//        System.out.println(money+"원이 입금되었습니다.");
//        System.out.println("현재 잔액 : "+balance);
//    }
    void deposit(int money){
        System.out.println(money+"원이 입금되었습니다.");
        System.out.println("현재 잔액 : "+balance);
        balance+=money;
    }

    void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + "가 출력되었습니다.");
            System.out.println("잔액은 " + balance + "입니다.");
        } else {
            System.out.println("잔액이 부족합니다.");
            System.out.println("현재 잔액은"+balance+"원 입니다.");
        }
    }
}
