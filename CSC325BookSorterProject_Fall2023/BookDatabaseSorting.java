package CSC325BookSorterProject_Fall2023;
// Jonah H. and Maria D.
// CSC 325 FA23; Subtask 6

import java.util.ArrayList;

public class BookDatabaseSorting extends BookDatabase {
    // Creating an instance of Sortable interface which now has commands from BookSorter
    // 9.25 BookSorter is what sorts the books; Kudos to DW
    private BookSorter sorter = new BookSorter();
    private ArrayList<Book> sortedBooks;

    // Empty constructor
    public BookDatabaseSorting() {
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