import java.util.ArrayList;

/**
 * Simulates a client.
 *
 * @author Alexander Moser*/
public class Client extends Person {
    /** Client ID*/
    private int clientID;
    /** List of accounts a client can have*/
    private ArrayList<Account> accounts = new ArrayList<>();
    /** The account manager for a client */
    private AccountManager accountManager;

    /**
     * Constructor for a Client
     *
     * @param name the name of a client
     * @param surname the surname of a client
     * @param address the adress of a client
     * @param clientID the client ID of a client
     * @param accounts list of accounts of a client
     * @param accountManager the given account manager of a client
     * */
    public Client(String name, String surname, Address address, int clientID, ArrayList<Account> accounts, AccountManager accountManager) {
        super(name, surname, address);
        setClientID(clientID);
        setAccounts(accounts);
        setAccountManager(accountManager);
    }

    /** Default constructor*/
    public Client() {

    }

    /** Setter for the client ID*/
    public void setClientID(int clientID) {
        this.clientID = clientID;
    }

    /** Setter for the accounts*/
    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }

    /** Setter for the account manager*/
    public void setAccountManager(AccountManager accountManager) {
        this.accountManager = accountManager;
    }

    /** Getter for the client ID*/
    public int getClientID() {
        return clientID;
    }

    /** Getter for the accounts*/
    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    /** Getter for the account manager*/
    public AccountManager getAccountManager() {
        return accountManager;
    }
}
