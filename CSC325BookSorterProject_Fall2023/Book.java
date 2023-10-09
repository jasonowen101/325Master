package CSC325BookSorterProject_Fall2023;
// Travis Tan
// Book Class
public class Book {
  private String category = "";
  private String author = "";
  private String title = "";
  private int length;
  private int popularity;

  // constructor with parameter
  public Book(String category, String author, String title, int length, int popularity) {
    this.category = category;
    this.author = author;
    this.title = title;
    this.length = length;
    this.popularity = popularity;
  }

  // Getters
  public String getCategory() {
    return category;
  }

  public String getAuthor() {
    return author;
  }

  public String getTitle() {
    return title;
  }

  public int getLength() {
    return length;
  }

  public int getPopularity() {
    return popularity;
  }

  // Setters
  public void setCategory(String category) {
    this.category = category;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setLength(int length) {
    this.length = length;
  }

  public void setPopularity(int popularity) {
    this.popularity = popularity;
  }

  public String toString() {
    return "Category: " + category + " Author: " + author + " Title: " + title + " Length:  " + length + " Popularity: "
        + popularity;
  }
}
