import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<AccountManager> listAccountManager = new ArrayList<>();
        ArrayList<Client> listClient = new ArrayList<>();
        AccountManager currentManager = new AccountManager();
        Scanner scanner = new Scanner(System.in);
        boolean loggedIn = false;

        System.out.println("Bank Management System\n" +
                "(c) Alexander Moser\n\n" +
                "What would you like to do?");

        while (true) {

            if (loggedIn) {
                System.out.println("You are logged in as " + currentManager.getName() + " " + currentManager.getSurname());
            }



            System.out.println("1: Login as existing account manager\n" +
                    "2: Add new AccountManager\n" +
                    "3: Close application");


            int input = Integer.parseInt(scanner.next());

            switch (input) {
                case 1 -> {
                    if (listAccountManager.isEmpty()) {
                        System.out.println("There are no Account Managers\n");
                        break;
                    }


                    int accountManagerID;
                    String password;

                    System.out.println("Enter Credentials:");
                    System.out.print("Account Manager ID: ");
                    accountManagerID = Integer.parseInt(scanner.next());

                    System.out.print("Password: ");
                    password = scanner.next();

                    for (AccountManager manager : listAccountManager) {
                        if (manager.getPassword().equals(password) && manager.getAccountManagerID() == accountManagerID) {
                            loggedIn = true;
                            currentManager = manager;
                            break;
                        }
                    }
                }

                case 2 -> {
                    AccountManager newManager = new AccountManager();
                    Address address = new Address();

                    System.out.println("Name: ");
                    newManager.setName(scanner.nextLine());

                    System.out.println("Surname: ");
                    newManager.setSurname(scanner.nextLine());

                    System.out.println("Address: ");
                    System.out.println("Street: ");
                    address.setStreet(scanner.nextLine());

                    System.out.println("Zip Code");
                    address.setZipCode(scanner.next());

                    System.out.println("City");
                    address.setCity(scanner.nextLine());
                    newManager.setAddress(address);

                    System.out.println("Account ID: ");
                    newManager.setAccountManagerID(Integer.parseInt(scanner.next()));

                    System.out.println("Password: ");
                    newManager.setPassword(scanner.nextLine());

                    System.out.println("Salary: ");
                    newManager.setSalary(Double.parseDouble(scanner.next()));

                    listAccountManager.add(newManager);
                }
            }
        }


    }
}
