package CSC325BookSorterProject_Fall2023;
// * J.E.
// * Display.java
// * 9/13/2023
// * This class displays the sorted list of books

import java.util.*;

public class Display {
    //method that displays an Array of sorted books
    //input: Array of Book Objects

    public static void display(Book[] a) {
        System.out.println("Sorted List:");
        for(int i = 0; i < a.length; i++)
        {
            System.out.println(a[i]);
        }
    }

    //method that displays an ArrayList of sorted books
    //input: ArrayList of Book Objects
    public void displayArrayList(ArrayList<Book> a) {
        System.out.println("Sorted List:");
        for(int i = 0; i < a.size(); i++)
        {
            System.out.println(a.get(i));
        }
    }
}
