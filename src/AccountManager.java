/**
 * Account manager.
 *
 * @author Alexander Moser
 * */
public class AccountManager extends Person {
    /** ID for a given account manager*/
    private int accountManagerID;
    /** An account managers password*/
    private String password;
    /** The salary for an account manager */
    private double salary;

    /**
     * Constructor of an account Manager
     *
     * @param name the name of the manager
     * @param surname the surname of the manager
     * @param address the address of the manager
     * @param accountManagerID intern number to identify an account manager
     * @param password the account managers password
     * @param salary the salary of the account manager
     * */
    public AccountManager(String name, String surname, Address address, int accountManagerID, String password, double salary) {
        super(name, surname, address);
        setAccountManagerID(accountManagerID);
        setPassword(password);
        setSalary(salary);
    }

    /** Default constructor for an account Manage */
    public AccountManager() {
    }

    /** Setter for the account manager ID*/
    public void setAccountManagerID(int accountManagerID) {
        this.accountManagerID = accountManagerID;
    }

    /** Setter for the account manager password*/
    public void setPassword(String password) {
        this.password = password;
    }

    /** Setter for the account manager salary*/
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /** Getter for the account manager ID*/
    public int getAccountManagerID() {
        return accountManagerID;
    }

    /** Getter for the password*/
    public String getPassword() {
        return password;
    }

    /** Getter for the salary*/
    public double getSalary() {
        return salary;
    }
}
