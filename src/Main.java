import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println("Welcome To City Book Shop...!\n");

        Scanner input1 = new Scanner(System.in);

        System.out.print("Please state your role (Manager/Cashier) : ");
        String role = input1.nextLine();


        if (role.toUpperCase().equals("CASHIER")) {
            Cashier cashier = new Cashier();

            System.out.print("Enter username: ");
            String username = input1.nextLine();

            System.out.print("Enter password: ");
            String password = input1.nextLine();

            cashier.setUsername(username);
            String user = cashier.getUsername();

            cashier.setPassword(password);

            System.out.println("\nHello " + user + " ! \n");
            String repeat = "YES";
            while (repeat.equals("YES")) {
                System.out.println("...MENU...");
                System.out.println("1. View Book Details \n2. Search a Book");
                System.out.println("Please Select the option number you need : ");
                String option = input1.nextLine();
                switch (option) {
                    case "1":
                        cashier.viewBooks();
                        break;
                    case "2":
                        cashier.search();
                        break;
                    default:
                        System.out.println("Please Select a Valid Option Number");
                }
                System.out.println("Do you want to select another option ?(Yes/No): ");
                repeat = input1.nextLine().toUpperCase();
            }
            System.out.println("Program Ended. Hava A Nice Day!\n");



        } else if (role.toUpperCase().equals("MANAGER")) {
            Manager manager = new Manager();

            System.out.print("Enter username: ");
            String username = input1.nextLine();

            System.out.print("Enter password: ");
            String password = input1.nextLine();

            manager.setUsername(username);
            String user = manager.getUsername();

            manager.setPassword(password);
            System.out.println("\nHello " + user + " ! \n");
            String repeat = "YES";
            while (repeat.equals("YES")) {
                System.out.println("...MENU...");
                System.out.println("1. View Book Details \n2. Search a Book \n3. Add Book \n4. Create Account");

                System.out.println("Please Select the option number you need : ");
                if (input1.hasNextLine()) {
                    String option = input1.nextLine();
                    switch (option) {
                        case "1":
                            manager.viewBooks();
                            break;
                        case "2":
                            manager.search();
                            break;
                        case "3":
                            manager.addBook();
                            break;
                        case "4":
                            manager.createAccount();
                            break;
                        default:
                            System.out.println("Please Select a Valid Option Number");
                    }

                    System.out.println("Do you want to select another option ?(Yes/No): ");
                    repeat = input1.nextLine().toUpperCase();


                }
            }
            System.out.println("Program Ended. Hava A Nice Day!\n");


        }
        else {
            System.out.println("Invalid input !");
        }


    }
}