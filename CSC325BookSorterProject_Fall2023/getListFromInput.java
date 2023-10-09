package CSC325BookSorterProject_Fall2023;
//isaac-gunderson, michael toon, ally robinson (subtask 7)
import java.util.ArrayList;

public class getListFromInput {

    private BookDatabaseSorting databaseSorter = new BookDatabaseSorting();

    //method for getting the sort based on user input
    public ArrayList<Book> getSortedBooks(String category, ArrayList<Book> books) {

    if (category == "Title") {       //get list sorted by title
        return(databaseSorter.passTitle(books));          //call bookDatabaseSorting class methods
    }

    if (category == "Author") {      //get list sorted by author

        return(databaseSorter.passAuthor(books));     //call bookDatabaseSorting class methods
    }

    if (category == "Length") {      //get list sorted by pagenumber

        return(databaseSorter.passLength(books));     //call bookDatabaseSorting class methods
    }

    if (category == "Popularity") {      //get list sorted by rating

        return(databaseSorter.passPopularity(books));     //call bookDatabaseSorting class methods
    }

    if (category == "Category") {      //get list sorted by category

        return(databaseSorter.passCategory(books));   //call bookDatabaseSorting class methods
    }

    ArrayList<Book> sortedBooks = new ArrayList<Book>();
    return(sortedBooks);

    }


}
