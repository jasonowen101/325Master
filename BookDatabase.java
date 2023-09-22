import java.util.ArrayList;

public class BookDatabase {
	
	private ArrayList<Book> database = new ArrayList<Book>();
	private ArrayList<Integer> key = new ArrayList<Integer>();
	private int keyNext;
	// database is an array list containing objects of the Book class
	// key is an array list containing integers matching each book
	// keyNext increments every time a book is added
	public void addBook(Book book) {
		database.add(book);
		keyNext++;
		key.add(keyNext);
	}
	// addBook takes a Book object, appends it to the list, and adds a matching key
	public boolean removeBook(int i) {
		int index = key.indexOf(i);
		if (index == -1) {
			return false;
		}
		database.remove(index);
		key.remove(index);
		return true;
	}
	// removeBook removes a book of a key, and removes the key
	public Book retrieveBook(int i) {
		int index = key.indexOf(i);
		if(index == -1) {
			return null;
		}
		return database.get(index);
	}
	// retrieveBook returns a book object of a key, or null if the key does not exist
    public String toString() {
        return database.toString();
    }
	// toString returns a string of the database
}
