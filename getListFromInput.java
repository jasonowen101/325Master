//isaac-gunderson, michael toon, ally robinson (subtask 7)
import java.util.List;

public class getListFromInput {
    
    //method for getting the sort based on user input
    public List<Book> getSortedBooks(String category) {

    if (category == "Title") {       //get list sorted by title

        return(passTitle());      //call bookDatabaseSorting class methods
    }

    if (category == "Author") {      //get list sorted by author

        return(passAuthor());     //call bookDatabaseSorting class methods
    }

    if (category == "Length") {      //get list sorted by pagenumber

        return(passLength());     //call bookDatabaseSorting class methods
    }

    if (category == "Popularity") {      //get list sorted by rating

        return(passPopularity());     //call bookDatabaseSorting class methods
    }

    if (category == "Category") {      //get list sorted by category

        return(passCategory());   //call bookDatabaseSorting class methods
    }

    }


}
