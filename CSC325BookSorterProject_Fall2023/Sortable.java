package CSC325BookSorterProject_Fall2023;
// MC/KL CSC 325 FA23

import java.util.ArrayList;

// Interface for sorting via different catgeories
public interface Sortable {
    // Method signitures for sorting Category, Author, Title, Length or Popularity
    ArrayList<Book> sortByCategory(ArrayList<Book> books);
    ArrayList<Book> sortByAuthor(ArrayList<Book> books);
    ArrayList<Book> sortByTitle(ArrayList<Book> books);
    ArrayList<Book> sortByLength(ArrayList<Book> books);
    ArrayList<Book> sortByPopularity(ArrayList<Book> books);
}
