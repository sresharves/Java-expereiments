class Book {
    int bookId;
    String title;
    String author;
    String category;
    double price;
    boolean available;

    // Parameterized Constructor
    Book(int bookId, String title, String author, String category,
         double price, boolean available) {

        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.category = category;
        this.price = price;
        this.available = available;
    }

    // Method to display book details
    void display() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Category: " + category);
        System.out.println("Price: " + price);
        System.out.println("Available: " + available);
    }
}

// Main Class
public class LibraryManagement {
    public static void main(String[] args) {

        // Creating Book objects
        Book b1 = new Book(
            101,
            "Harry Potter",
            "J.K. Rowling",
            "Fantasy",
            799,
            true
        );

        Book b2 = new Book(
            111,
            "Java",
            "James Gosling",
            "Education",
            699,
            true
        );

        System.out.println("Book Details");
        System.out.println("--------------------");

        // Displaying book details
        b1.display();

        System.out.println();

        b2.display();
    }
}