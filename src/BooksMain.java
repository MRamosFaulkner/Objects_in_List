import java.util.Scanner;
import java.util.ArrayList;

public class BooksMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Books> books = new ArrayList<>();

        System.out.print("Books\n");
        System.out.print("Entering nothing will stop the loop\n");

        while (true) {
            System.out.print("Enter the name of the book: ");
            String bookTitle = scanner.nextLine();

            if (bookTitle.equals("")) {
                break;
            }

            System.out.print("Enter the number of pages: ");
            int numOfPages = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter the publication year: ");
            int pubYear = scanner.nextInt();
            scanner.nextLine();

            Books book = new Books(bookTitle, numOfPages,pubYear);
            books.add(book);
        }

        System.out.print("What information will be printed? \nEnter 'name' for book titles or 'everything' to print all details: ");
        String option = scanner.nextLine();

        if (option.equals("name")) {
            for (Books book : books) {
                System.out.println(book.getBookTitle());
            }
        } else if (option.equals("everything")) {
            for (Books book : books) {
                System.out.println(book.getBookTitle() + ", " + book.getNumOfPages() +" pages " + book.getPubYear());
            }
//                System.out.println(books.toString());
            }
        }
    }
