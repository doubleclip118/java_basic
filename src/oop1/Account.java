package oop1;

public class Account {
    int balance;

    void deposit(int amount){
        balance+=amount;
    }
    void withdraw(int amonut){
        if(balance<amonut){
            System.out.println("잔액부족");
        }
        else{
            balance-=amonut;
        }
    }
}
