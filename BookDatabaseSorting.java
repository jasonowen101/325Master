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
        sorter.sortCategory(books);
    }

    public void passAuthor() {
        sorter.sortAuthor(books);
    }

    public void passTitle() {
        sorter.sortTitle(books);
    }

    public void passLength() {
        sorter.sortLength(books);
    }

    public void passPopularity() {
        sorter.sortPopularity(books);
    }
}   