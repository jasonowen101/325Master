import java.util.ArrayList;
import java.util.List;

public class BookSorter implements Sortable {
 // Method to sort books by category using bubble sort algorithm
    // @Override
    public ArrayList<Book> sortByCategory(ArrayList<Book> books) {
        int n = books.size();
        // Outer loop to iterate through all elements
        for (int i = 0; i < n - 1; i++) {
            // Inner loop to perform pairwise comparisons and swaps
            for (int j = 0; j < n - i - 1; j++) {
                // Compare category of adjacent books and swap if necessary
                if (books.get(j).getCategory().compareTo(books.get(j + 1).getCategory()) > 0) {
                    // Swap books[j] and books[j+1]
                    Book temp = books.get(j);
                    books.set(j, books.get(j + 1));
                    books.set(j + 1, temp);
                }
            }
        }
        return books;
    }
  // Method to sort books by author using bubble sort algorithm
    // @Override
    public ArrayList<Book> sortByAuthor(ArrayList<Book> books) {
        int n = books.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Compare author of adjacent books and swap if necessary
                if (books.get(j).getAuthor().compareTo(books.get(j + 1).getAuthor()) > 0) {
                    Book temp = books.get(j);
                    books.set(j, books.get(j + 1));
                    books.set(j + 1, temp);
                }
            }
        }
        return books;
    }

    // Method to sort books by title using bubble sort algorithm
    // @Override
    public ArrayList<Book> sortByTitle(ArrayList<Book> books) {
        int n = books.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Compare title of adjacent books and swap if necessary
                if (books.get(j).getTitle().compareTo(books.get(j + 1).getTitle()) > 0) {
                    Book temp = books.get(j);
                    books.set(j, books.get(j + 1));
                    books.set(j + 1, temp);
                }
            }
        }
        return books;
    }

    // Method to sort books by length (number of pages) using bubble sort algorithm
    // @Override
    public ArrayList<Book> sortByLength(ArrayList<Book> books) {
        int n = books.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Compare length of adjacent books and swap if necessary
                if (books.get(j).getLength() > books.get(j + 1).getLength()) {
                    Book temp = books.get(j);
                    books.set(j, books.get(j + 1));
                    books.set(j + 1, temp);
                }
            }
        }
        return books;
    }

    // Method to sort books by popularity (rating) using bubble sort algorithm
    // @Override
    public ArrayList<Book> sortByPopularity(ArrayList<Book> books) {
        int n = books.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Compare popularity of adjacent books and swap if necessary
                if (books.get(j).getPopularity() > books.get(j + 1).getPopularity()) {
                    Book temp = books.get(j);
                    books.set(j, books.get(j + 1));
                    books.set(j + 1, temp);
                }
            }
        }
        return books;
    }
    @Override
    public List<Book> sortByCategory(List<Book> books) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sortByCategory'");
    }
    @Override
    public List<Book> sortByAuthor(List<Book> books) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sortByAuthor'");
    }
    @Override
    public List<Book> sortByTitle(List<Book> books) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sortByTitle'");
    }
    @Override
    public List<Book> sortByLength(List<Book> books) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sortByLength'");
    }
    @Override
    public List<Book> sortByPopularity(List<Book> books) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sortByPopularity'");
    }
}