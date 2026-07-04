package LibraryManagementSystem;

import java.util.Arrays;
import java.util.Comparator;

public class LibraryManagement {

    private Book[] books;

    public LibraryManagement(Book[] books) {
        this.books = books;
    }

    // Linear Search
    public Book linearSearch(String title) {

        for (Book book : books) {
            if (book.title.equalsIgnoreCase(title)) {
                return book;
            }
        }

        return null;
    }

    // Sort Books by Title
    public void sortBooks() {
        Arrays.sort(books, Comparator.comparing(book -> book.title));
    }

    // Binary Search
    public Book binarySearch(String title) {

        int low = 0;
        int high = books.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int compare = books[mid].title.compareToIgnoreCase(title);

            if (compare == 0)
                return books[mid];

            if (compare < 0)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return null;
    }
}