import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Manager extends Cashier {
    public Manager() {
        super();
    }


    public void createAccount(){
        Scanner input1 = new Scanner(System.in);
        System.out.print("Enter user name: ");
        String user_name = input1.nextLine();

        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter e mail address: ");
        String e_address = input2.nextLine();

        Scanner input3 = new Scanner(System.in);
        System.out.print("Enter password: ");
        String password = input3.nextLine();

        System.out.println("\n...Account created successfully!... \n");
    }

    public void addBook() throws IOException {
        File filePath = new File("C:\\Users\\Induwara Jayasinghe\\Desktop\\Nesandu\\FileHandleDemo\\src\\Books.txt");
             Scanner scanner = new Scanner(System.in);
             BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true));

            // Read user input for new book details
            System.out.print("Enter the book ID: ");
            String bookId = scanner.nextLine();

            System.out.print("Enter the book name: ");
            String bookName = scanner.nextLine();

            System.out.print("Enter the category: ");
            String category = scanner.nextLine();

            System.out.print("Enter the price: ");
            String price = scanner.nextLine();

            System.out.print("Enter quantity: ");
            String quantity = scanner.nextLine();


            // Write the new record to the file
        int idWidth = 7;
        int nameWidth = 12;
        int categoryWidth = 13;
        int priceWidth = 11;
        int quantityWidth = 4;


        String formattedLine = String.format("%-" + idWidth + "s", bookId) +
                String.format("%-" + nameWidth + "s", bookName) +
                String.format("%-" + categoryWidth + "s", category) +
                String.format("%-" + priceWidth + "s", price) +
                String.format("%-" + quantityWidth + "s", quantity);
        writer.write(formattedLine);
            writer.newLine();

            writer.close();
            System.out.println("\n...New record added successfully!...\n");


        }
    }


