import java.util.ArrayList;
import java.util.Date;

public class Client extends Person {
    private int clientID;
    private ArrayList<Account> accounts = new ArrayList<>();
    private AccountManager accountManager;

    public Client(String name, String surname, Date birthday, Address address, int clientID, ArrayList<Account> accounts, AccountManager accountManager) {
        super(name, surname, birthday, address);
        this.clientID = clientID;
        this.accounts = accounts;
        this.accountManager = accountManager;
    }

    public int getClientID() {
        return clientID;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public AccountManager getAccountManager() {
        return accountManager;
    }
}
