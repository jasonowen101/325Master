package CSC325BookSorterProject_Fall2023;
import javax.swing.SwingUtilities;

public class Library {

  public static void main(String[] args) {
    BookDatabase database = new BookDatabase();

    Book book1 = new Book("Society", "George Orwell", "Animal Farm", 120, 3);
    Book book2 = new Book("Sci-fy", "Denis Wern", "A Real Book", 2, 1);
    Book book3 = new Book("History", "Mike Gary", "The Past", 150, 2);

    database.addBook(book1);
    database.addBook(book2);
    database.addBook(book3);

    SwingUtilities.invokeLater(new Runnable() {
      @Override
      public void run() {
        new UserInput(database);
      }
    });
  }

}
