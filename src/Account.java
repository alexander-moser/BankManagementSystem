import java.util.ArrayList;

public class Account {
    private int accountNumber;
    private double balance;

    public Account(int accountNumber, double balance, ArrayList<Account> accounts) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}
