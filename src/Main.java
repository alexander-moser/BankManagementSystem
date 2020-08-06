import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<AccountManager> listAccountManager = new ArrayList<>();
        ArrayList<Client> listClient = new ArrayList<>();
        AccountManager currentManager = new AccountManager();
        Scanner scanner = new Scanner(System.in);
        boolean loggedIn = false;
        boolean on = true;

        System.out.println("Bank Management System\n" +
                "(c) Alexander Moser\n\n" +
                "What would you like to do?");

        while (on) {

            if (loggedIn) {
                System.out.println("You are logged in as " + currentManager.getName() + " " + currentManager.getSurname());
            }

            System.out.println("1: Login as existing account manager\n" +
                    "2: Logout\n" +
                    "3: Add new account manager\n" +
                    "4: Add new client\n" +
                    "5: Deposit Money\n" +
                    "6: Withdraw Money\n" +
                    "7: Open another account\n" +
                    "8: Check Balance\n" +
                    "9: Close application");


            int input = Integer.parseInt(scanner.next());

            switch (input) {

                case 1 -> {
                    if (listAccountManager.isEmpty()) {
                        System.out.println("There are no account managers\n");
                        break;
                    }

                    System.out.println("Enter credentials:");
                    System.out.print("Account manager ID: ");
                    int accountManagerID = Integer.parseInt(scanner.next());

                    System.out.print("Password: ");
                    String password = scanner.next();

                    for (AccountManager manager : listAccountManager) {
                        if (manager.getPassword().equals(password) && manager.getAccountManagerID() == accountManagerID) {
                            loggedIn = true;
                            currentManager = manager;
                            break;
                        }
                    }
                }

                case 2 -> {
                    loggedIn = false;
                    currentManager = new AccountManager();
                    System.out.println("Logged out!");
                }

                case 3 -> {
                    AccountManager newManager = new AccountManager();
                    Address address = new Address();

                    System.out.print("Name: ");
                    newManager.setName(scanner.next());

                    System.out.print("Surname: ");
                    newManager.setSurname(scanner.next());

                    System.out.print("Address:\n");
                    System.out.print("Street: ");
                    address.setStreet(scanner.next());

                    System.out.print("Zip Code: ");
                    address.setZipCode(scanner.next());

                    System.out.print("City: ");
                    address.setCity(scanner.next());
                    newManager.setAddress(address);

                    System.out.print("Account ID: ");
                    newManager.setAccountManagerID(Integer.parseInt(scanner.next()));

                    System.out.print("Password: ");
                    newManager.setPassword(scanner.next());

                    System.out.print("Salary: ");
                    newManager.setSalary(Double.parseDouble(scanner.next()));

                    listAccountManager.add(newManager);
                }

                case 4 -> {
                    if (!loggedIn) {
                        System.out.println("You need to log in\n");
                        break;
                    }

                    Client newClient = new Client();
                    Address address = new Address();
                    Account account = new Account();
                    ArrayList<Account> accountArrayList = new ArrayList<>();

                    System.out.print("Name: ");
                    newClient.setName(scanner.next());

                    System.out.print("Surname: ");
                    newClient.setSurname(scanner.next());

                    System.out.println("Address: ");
                    System.out.print("Street: ");
                    address.setStreet(scanner.next());

                    System.out.print("Zip Code: ");
                    address.setZipCode(scanner.next());

                    System.out.print("City: ");
                    address.setCity(scanner.next());
                    newClient.setAddress(address);

                    newClient.setClientID(listClient.size() + 1);

                    account.setAccountNumber(newClient.getAccounts().size() + 1);
                    account.setBalance(0);
                    newClient.setAccountManager(currentManager);

                    accountArrayList.add(account);

                    System.out.println("Client has been added with ID "
                            + newClient.getClientID()
                            + " and new account has been initialized with ID "
                            + account.getAccountNumber());

                    listClient.add(newClient);
                    newClient.setAccounts(accountArrayList);
                }

                case 5 -> {
                    System.out.print("Client ID: ");
                    Client client = listClient.get(Integer.parseInt(scanner.next()) - 1);

                    System.out.print("Account ID: ");
                    Account account = client.getAccounts().get(Integer.parseInt(scanner.next()) - 1);

                    System.out.print("How much would you like to deposit: ");
                    account.depositMoney(Double.parseDouble(scanner.next()));

                }


                case 6 -> {
                    System.out.print("Client ID: ");
                    Client client = listClient.get(Integer.parseInt(scanner.next()) - 1);

                    System.out.print("Account ID: ");
                    Account account = client.getAccounts().get(Integer.parseInt(scanner.next()) - 1);

                    System.out.print("How much would you like to withdraw: ");
                    account.withdrawMoney(Double.parseDouble(scanner.next()));

                }

                case 7 -> {
                    System.out.print("Client ID: ");
                    Client client = listClient.get(Integer.parseInt(scanner.next()) - 1);

                    ArrayList<Account> accounts = client.getAccounts();

                    Account account = new Account(client.getAccounts().size() + 1, 0);

                    System.out.println("Account has been initialized with ID "
                            + account.getAccountNumber()
                            + " and Balance "
                            + account.getBalance());

                    accounts.add(account);
                    client.setAccounts(accounts);
                }

                case 8 -> {
                    System.out.print("Client ID: ");
                    Client client = listClient.get(Integer.parseInt(scanner.next()) - 1);
                    System.out.print("Account ID: ");
                    Account account = client.getAccounts().get(Integer.parseInt(scanner.next()) - 1);

                    System.out.println("Balance: " + account.getBalance());
                }

                case 9 -> on = false;

                default -> System.out.println("Enter a valid operation");
            }
        }
    }
}
