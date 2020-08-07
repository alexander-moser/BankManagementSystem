/**
 * A simple bank Account. It has two components:
 * an account number and a balance
 *
 * @author Alexander Moser
 */
public class Account {
    /** Account number to identify a given account*/
    private int accountNumber;
    /** The balance of a given account*/
    private double balance;

    /**
     * Constructor for an account
     *
     * @param accountNumber the number of the account
     * @param balance the current balance of the account
     * */
    public Account(int accountNumber, double balance) {
        setAccountNumber(accountNumber);
        setBalance(balance);
    }

    /**
     * Constructor for the account
     * */
    public Account() {

    }

    /**
     * Setter for the account number
     * */
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * Setter for the balance
     * */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Getter for the account number
     * */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * Getter for the balance
     * */
    public double getBalance() {
        return balance;
    }

    /**
     * method for withdrawing money from a account
     *
     * @param amount the amount to withdraw
     * */
    public void withdrawMoney(double amount) {
        if (amount > this.balance) {
            System.out.println("Amount is larger than balance");
        }
        else {
            this.balance -= amount;
        }
    }

    /**
     * Method for depositing money
     *
     * @param amount the amount to deposit
     * */
    public void depositMoney(double amount) {
        this.balance += amount;
    }

}
