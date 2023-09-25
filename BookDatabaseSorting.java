// Jonah H. and Maria D.
// CSC 325 FA23; Subtask 6

import java.util.ArrayList;

public class BookDatabaseSorting extends BookDatabase {
    // Creating an instance of Sortable interface which now has commands from BookSorter
    private BookSorter sorter;
    private ArrayList<Book> sortedBooks;

    // Class constructor which passes the given sorter to our sorter
    // 9.25 BookSorter is what sorts the books; so we changed it
    public BookDatabaseSorting(BookSorter sorter) {
        this.sorter = sorter;
    }

    // Calling the methods from Sortable which will return the sorted ArrayList
    // a.k.a. the integration of methods
    public ArrayList<Book> passCategory(ArrayList<Book> books) {
        sortedBooks = new ArrayList<Book>(sorter.sortByCategory(books));
        return sortedBooks;
    }

    public ArrayList<Book> passAuthor(ArrayList<Book> books) {
        sortedBooks = new ArrayList<Book>(sorter.sortByAuthor(books));
        return sortedBooks;
    }

    public ArrayList<Book> passTitle(ArrayList<Book> books) {
        sortedBooks = new ArrayList<Book>(sorter.sortByTitle(books));
        return sortedBooks;
    }

    public ArrayList<Book> passLength(ArrayList<Book> books) {
        sortedBooks = new ArrayList<Book>(sorter.sortByLength(books));
        return sortedBooks;
    }

    public ArrayList<Book> passPopularity(ArrayList<Book> books) {
        sortedBooks = new ArrayList<Book>(sorter.sortByPopularity(books));
        return sortedBooks;
    }
}   