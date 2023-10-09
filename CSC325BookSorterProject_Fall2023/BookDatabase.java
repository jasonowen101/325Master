package CSC325BookSorterProject_Fall2023;
import java.util.ArrayList;

public class BookDatabase {
	
	private ArrayList<Book> database = new ArrayList<Book>();
	// database is an array list containing objects of the Book class
	public void addBook(Book book) {
		database.add(book);
	}
	// addBook takes a Book object, appends it to the list
	public void removeBook(int i) {
		database.remove(i);
	}
	// removeBook removes a book at an index
	public Book retrieveBook(int i) {
		return database.get(i);
	}
	// retrieveBook returns a book object at an index
	public ArrayList<Book> getArrayList(){
		return database;
	}
	//getter for the database
	public int size() {
		return database.size();
	}
	// size returns the size of the database
    public String toString() {
        return database.toString();
    }
	// toString returns a string of the database
}
