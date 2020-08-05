import java.util.Date;

public class AccountManager extends Person {
    private int accountManagerID;
    private String password;
    private double salary;

    public AccountManager(String name, String surname, Address address, int accountManagerID, String password, double salary) {
        super(name, surname, address);
        setAccountManagerID(accountManagerID);
        setPassword(password);
        setSalary(salary);
    }

    public AccountManager() {
    }

    public void setAccountManagerID(int accountManagerID) {
        this.accountManagerID = accountManagerID;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAccountManagerID() {
        return accountManagerID;
    }

    public String getPassword() {
        return password;
    }

    public double getSalary() {
        return salary;
    }
}
