//isaac-gunderson, michael toon, ally robinson (subtask 7)

public class getListFromInput {
    
    //method for getting the sort based on user input
    public ArrayList getSortedBooks(String category) {

    if (category = "Title") {       //get list sorted by title

        return(listSortedByTitle());
    }

    if (category = "Author") {      //get list sorted by author

        return(listSortedByAuthor());
    }

    if (category = "Length") {      //get list sorted by pagenumber

        return(listSortedByLength());
    }

    if (category = "Popularity") {      //get list sorted by rating

        return(listSortedByPopularity());
    }

    }


}
