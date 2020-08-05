import java.util.Date;

public class AccountManager extends Person {
    private int internalNumber;
    private double salary;

    public AccountManager(String name, String surname, Date birthday, Address address, int internalNumber, double salary) {
        super(name, surname, birthday, address);
        this.internalNumber = internalNumber;
        this.salary = salary;
    }

    public int getInternalNumber() {
        return internalNumber;
    }

    public double getSalary() {
        return salary;
    }
}
