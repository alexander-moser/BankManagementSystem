import java.util.ArrayList;

public class Account {
    private int accountNumber;
    private double balance;

    public Account(int accountNumber, double balance) {
        setAccountNumber(accountNumber);
        setBalance(balance);
    }

    public Account() {

    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }


    public void withdrawMoney(double amount) {
        if (amount > this.balance) {
            System.out.println("Amount is larger than balance");
        }
        else {
            this.balance -= amount;
        }
    }

    public void depositMoney(double amount) {
        this.balance += amount;
    }

}
