//isaac-gunderson, michael toon, ally robinson (subtask 7)
import java.util.ArrayList;

public class getListFromInput {
    Sortable mySorter;

    public getListFromInput(Sortable sorter) {
        this.mySorter = sorter;
    }

    private BookDatabaseSorting databaseSorter = new BookDatabaseSorting(mySorter);

    //method for getting the sort based on user input
    public ArrayList<Book> getSortedBooks(String category) {

    if (category == "Title") {       //get list sorted by title

        return(databaseSorter.passTitle());      //call bookDatabaseSorting class methods
    }

    if (category == "Author") {      //get list sorted by author

        return(databaseSorter..passAuthor());     //call bookDatabaseSorting class methods
    }

    if (category == "Length") {      //get list sorted by pagenumber

        return(databaseSorter.passLength());     //call bookDatabaseSorting class methods
    }

    if (category == "Popularity") {      //get list sorted by rating

        return(databaseSorter.passPopularity());     //call bookDatabaseSorting class methods
    }

    if (category == "Category") {      //get list sorted by category

        return(databaseSorter.passCategory());   //call bookDatabaseSorting class methods
    }

    }


}
