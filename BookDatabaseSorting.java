// Jonah H. and Maria D.
// CSC 325 FA23; Subtask 6

import java.util.List;

public class BookDatabaseSorting extends BookDatabase {
    // Creating an instance of Sortable interface which now has commands from BookSorter
    private Sortable sorter;

    // Class constructor which passes the given sorter to our sorter
    public BookDatabaseSorting(Sortable sorter) {
        this.sorter = sorter;
    }

    // Calling the methods from Sortable which will return the sorted ArrayList
    // a.k.a. the integration of methods
    public void passCategory(List<Book> books) {
        sorter.sortByCategory(books);
    }

    public void passAuthor(List<Book> books) {
        sorter.sortByAuthor(books);
    }

    public void passTitle(List<Book> books) {
        sorter.sortByTitle(books);
    }

    public void passLength(List<Book> books) {
        sorter.sortByLength(books);
    }

    public void passPopularity(List<Book> books) {
        sorter.sortByPopularity(books);
    }
}   