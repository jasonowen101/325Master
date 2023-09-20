// MC/KL CSC 325 FA23

import java.util.List;

// Interface for sorting via different catgeories
public interface Sortable {
    // Method signitures for sorting Category, Author, Title, Length or Popularity
    List<Book> sortByCategory(List<Book> books);
    List<Book> sortByAuthor(List<Book> books);
    List<Book> sortByTitle(List<Book> books);
    List<Book> sortByLength(List<Book> books);
    List<Book> sortByPopularity(List<Book> books);
}
