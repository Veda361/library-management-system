import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        ArrayList<String> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("Welcome to the Library Management System!");

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add a Book");
            System.out.println("2. View Books");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter the book name: ");
                    String bookName = scanner.nextLine();
                    books.add(bookName);
                    System.out.println("Book added successfully!");
                    break;
                case 2:
                    System.out.println("\nList of Books:");
                    if (books.isEmpty()) {
                        System.out.println("No books available.");
                    } else {
                        for (int i = 0; i < books.size(); i++) {
                            System.out.println((i + 1) + ". " + books.get(i));
                        }
                    }
                    break;
                case 3:
                    System.out.println("Exiting the system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);

        scanner.close();
    }
}


