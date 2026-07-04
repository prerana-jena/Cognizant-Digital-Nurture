package LibraryManagementSystem;

public class Main {

    public static void main(String[] args) {

        Book[] books = {
                new Book(101, "Java", "James Gosling"),
                new Book(102, "Python", "Guido van Rossum"),
                new Book(103, "C Programming", "Dennis Ritchie"),
                new Book(104, "Data Structures", "Mark Allen")
        };

        LibraryManagement library = new LibraryManagement(books);

        System.out.println("Linear Search:");

        Book result = library.linearSearch("Python");

        if (result != null)
            result.display();
        else
            System.out.println("Book not found.");

        library.sortBooks();

        System.out.println("Binary Search:");

        result = library.binarySearch("Python");

        if (result != null)
            result.display();
        else
            System.out.println("Book not found.");
    }
}