package bank;
public class account{
    private String name;
    private double balance;
    public account(String name, double balance){
        this.name = name;
        this.balance = balance;
    }
    public void deposit(double amount){
        balance = balance + amount;
        System.out.println(name + " deposited: ₹" + amount);
    }
    public void withdraw(double amount){
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println(name + " withdrew: ₹" + amount);
        }else{
            System.out.println("Insufficient balance for " + name);
        }
    }
    public void checkBalance() {
        System.out.println(name + "'s Balance: ₹" + balance);
    }
}