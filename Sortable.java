// MC/KL CSC 325 FA23

// Interface for sorting via different catgeories
public interface Sortable {
    // Method signitures for sorting Category, Author and Title by string
    public String sortCategory();
    public String sortAuthor();
    public String sortTitle();
    
    // Method signatures for sorting Length and Popularity by integer
    public int sortLength();
    public int sortPopularity();
}
