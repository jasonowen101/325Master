// Jonah H. and Maria D.
// CSC 325 FA23; Subtask 6

public class BookDatabaseSorting extends BookDatabase {
    // Creating an instance of Sortable interface which now has commands from BookSorter
    private Sortable sorter;

    // Class constructor which passes the given sorter to our sorter
    public BookDatabaseSorting(Sortable sorter) {
        this.sorter = sorter;
    }

    // Calling the methods from Sortable which will return the sorted ArrayList
    // a.k.a. the integration of methods
    public void passCategory() {
        sorter.sortByCategory(books);
    }

    public void passAuthor() {
        sorter.sortByAuthor(books);
    }

    public void passTitle() {
        sorter.sortByTitle(books);
    }

    public void passLength() {
        sorter.sortByLength(books);
    }

    public void passPopularity() {
        sorter.sortByPopularity(books);
    }
}   