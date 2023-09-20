//isaac-gunderson, michael toon, ally robinson (subtask 7)
import java.util.List;

public class getListFromInput {
    
    //method for getting the sort based on user input
    public List<Book> getSortedBooks(String category) {

    if (category == "Title") {       //get list sorted by title

        return(sortByTitle());
    }

    if (category == "Author") {      //get list sorted by author

        return(sortByAuthor());
    }

    if (category == "Length") {      //get list sorted by pagenumber

        return(sortByLength());
    }

    if (category == "Popularity") {      //get list sorted by rating

        return(sortByPopularity());
    }

    if (category == "Category") {      //get list sorted by category

        return(sortByCategory());
    }

    }


}
