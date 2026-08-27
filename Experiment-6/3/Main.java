package main;
import bank.account;
public class Main{
    public static void main(String[] args){
        account acc1 = new account("Lavkesh", 10000);
        account acc2 = new account("Rahul", 5000);
        acc1.deposit(2000);
        acc1.withdraw(3000);
        acc1.checkBalance();
        System.out.println();
        acc2.deposit(1000);
        acc2.withdraw(2000);
        acc2.checkBalance();
    }
}