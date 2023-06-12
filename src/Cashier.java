import java.io.*;
import java.util.Scanner;

public class Cashier {

    private String username;
    private String password;

    public Cashier() {
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void viewBooks() throws FileNotFoundException {
                File file = new File("C:\\Users\\Induwara Jayasinghe\\Desktop\\Nesandu\\FileHandleDemo\\src\\Books.txt");
        Scanner scan = new Scanner(file);

        String fileContent = "";
        while (scan.hasNextLine()){
            fileContent = fileContent.concat(scan.nextLine() + "\n");
        }
        System.out.println(fileContent);
    }

    public void search() throws FileNotFoundException {
        String filePath = "C:\\Users\\Induwara Jayasinghe\\Desktop\\Nesandu\\FileHandleDemo\\src\\Books.txt"; // Path to the book details text file


        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            // Read user input for book ID
            Scanner inputID = new Scanner(System.in);
            System.out.print("Enter the book ID to search for: ");
            String bookIdToSearch = inputID.nextLine();

            String line;
            boolean found = false;
            boolean isFirstLine = true;

            // Search for book details based on the book ID
            while ((line = reader.readLine()) != null) {

                if (isFirstLine) {
                    isFirstLine = false;
                    continue; // Skip processing the first line
                }

                String[] bookDetails = line.trim().split("      ");
                String bookId = bookDetails[0].trim();
                String bookName = bookDetails[1].trim();
                String category = bookDetails[2].trim();
                String price = bookDetails[3].trim();
                String quantity = bookDetails[4].trim();

                if (bookId.equals(bookIdToSearch)) {
                    // Display the matching book details
                    System.out.println("Book ID: " + bookId);
                    System.out.println("Book Name: " + bookName);
                    System.out.println("Category: " + category);
                    System.out.println("Price: " + price);
                    System.out.println("Quantity: " + quantity);
                    System.out.println();
                    found = true;
                    break; // Exit the loop after finding the book ID
                }
            }

            if (!found) {
                System.out.println("No book found with the given ID.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
    }

