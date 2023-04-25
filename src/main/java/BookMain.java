import java.util.Scanner;

public class BookMain {

    private static final Book[] books = new Book[5];


    public static void main(String[] args) {


        books[0] = new Book(001, "0000000000001", "Animal Farm");
        books[1] = new Book(002, "0000000000002", "Beloved");
        books[2] = new Book(003, "0000000000003", "Invisible Man");
        books[3] = new Book(003, "0000000000003", "The Great Gatsby");
        books[4] = new Book(004, "0000000000004", "To Kill a Mocking Bird");

        Scanner s = new Scanner(System.in);

        //Menu


        while (!exit) {

            System.out.println("1- Show available books ");
            System.out.println("2- Show checked out books");
            System.out.println("3- Exit");
            System.out.print("Enter your choice: ");
            int choice = s.nextInt();
            String name = s.nextLine();

            switch (choice) {
                case 1:
                    System.out.println(books.length);
                    System.out.println("Please choose a book:");
                    int bookPicked = s.nextInt();
                    break;
                case 2:

                    break;
                case 3:
                    System.out.println("Goodbye!");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice, try again");
                    break;

            }
        }
    }
}