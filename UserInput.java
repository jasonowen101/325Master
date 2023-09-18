import java.util.ArrayList;
import java.util.Comparator;
import java.util.concurrent.Flow;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.xml.crypto.Data;

import java.awt.*;
import java.awt.event.*;

import org.w3c.dom.events.MouseEvent;

public class UserInput {
    Library lib = new Library();

    JTextField authorField;
    JTextField titleField;
    JTextField categoryField;

    SpinnerModel popularityModel;
    JSpinner popularity;
    SpinnerModel pagenumModel;
    JSpinner pageNum;

    DefaultTableModel model;

    JTable display;

    JScrollPane sp;

    UserInput() {
    }

    UserInput(ArrayList<Book> library) {
        JFrame frame = new JFrame("Book Library");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 600);
        frame.setLocationRelativeTo(null);

        // Creating JPanel and Layout
        JPanel p = new JPanel();
        p.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        // Creating popup window for "Add" button and layout
        JDialog dialog = new JDialog(frame);
        dialog.setTitle("Submission Layout");
        dialog.setLayout(new GridBagLayout());
        GridBagConstraints m = new GridBagConstraints();

        // Labels for the inputs field in the submission form
        JLabel authorLabel = new JLabel("Author");
        JLabel titleLabel = new JLabel("Title");
        JLabel categoryLabel = new JLabel("Category");
        JLabel pagenumbersLabel = new JLabel("Page Numbers");
        JLabel popularityLabel = new JLabel("Popularity");

        // Input fields for the submission form
        authorField = new JTextField();
        titleField = new JTextField();
        categoryField = new JTextField();

        // Instantiating Input fields for numbers in the submission form
        popularityModel = new SpinnerNumberModel(1, 1, 5, 1);
        pagenumModel = new SpinnerNumberModel(1, 1, 1000, 1);

        // adding input fields to the dialog
        popularity = new JSpinner(popularityModel);
        pageNum = new JSpinner(pagenumModel);

        JButton submitButton = new JButton("Submit");
        JButton submitAddButton = new JButton("Submit and Submit Another Book");

        // Initializing Layout and adding it to the Dialog
        m.gridx = 0;
        m.gridy = 0;
        m.weightx = 0;
        m.fill = GridBagConstraints.HORIZONTAL;
        m.insets = new Insets(5, 5, 5, 5);
        dialog.add(authorLabel, m);

        m.gridx = 1;
        m.gridy = 0;
        m.weightx = 1;
        m.fill = GridBagConstraints.HORIZONTAL;
        m.insets = new Insets(5, 5, 5, 5);
        dialog.add(authorField, m);

        m.gridx = 0;
        m.gridy = 1;
        m.weightx = 0;
        m.fill = GridBagConstraints.HORIZONTAL;
        m.insets = new Insets(5, 5, 5, 5);
        dialog.add(titleLabel, m);

        m.gridx = 1;
        m.gridy = 1;
        m.weightx = 1;
        m.fill = GridBagConstraints.HORIZONTAL;
        m.insets = new Insets(5, 5, 5, 5);
        dialog.add(titleField, m);

        m.gridx = 0;
        m.gridy = 2;
        m.weightx = 0;
        m.fill = GridBagConstraints.HORIZONTAL;
        m.insets = new Insets(5, 5, 5, 5);
        dialog.add(categoryLabel, m);

        m.gridx = 1;
        m.gridy = 2;
        m.weightx = 1;
        m.fill = GridBagConstraints.HORIZONTAL;
        m.insets = new Insets(5, 5, 5, 5);
        dialog.add(categoryField, m);

        m.gridx = 0;
        m.gridy = 3;
        m.weightx = 0;
        m.fill = GridBagConstraints.HORIZONTAL;
        m.insets = new Insets(5, 5, 5, 5);
        dialog.add(pagenumbersLabel, m);

        m.gridx = 1;
        m.gridy = 3;
        m.weightx = 1;
        m.fill = GridBagConstraints.HORIZONTAL;
        m.insets = new Insets(5, 5, 5, 5);
        dialog.add(pageNum, m);

        m.gridx = 0;
        m.gridy = 4;
        m.weightx = 0;
        m.fill = GridBagConstraints.HORIZONTAL;
        m.insets = new Insets(5, 5, 5, 5);
        dialog.add(popularityLabel, m);

        m.gridx = 1;
        m.gridy = 4;
        m.weightx = 1;
        m.fill = GridBagConstraints.HORIZONTAL;
        m.insets = new Insets(5, 5, 5, 5);
        dialog.add(popularity, m);

        m.gridx = 0;
        m.gridy = 5;
        m.gridwidth = 2;
        m.fill = GridBagConstraints.HORIZONTAL;
        m.insets = new Insets(5, 5, 5, 5);
        dialog.add(submitAddButton, m);

        m.gridx = 0;
        m.gridy = 6;
        m.gridwidth = 2;
        m.fill = GridBagConstraints.HORIZONTAL;
        m.insets = new Insets(5, 5, 5, 5);
        dialog.add(submitButton, m);

        // Pops up a confirmation message and resets the textfields
        submitAddButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                getBook(library);
                JOptionPane.showMessageDialog(null, "Submitted successfully");
                authorField.setText(null);
                titleField.setText(null);
                categoryField.setText(null);
                pageNum.setValue(1);
                popularity.setValue(1);
                // Repaints the JTable to display updated data
                model.getDataVector().removeAllElements();
                refreshTable(library);
            }
        });

        // Pops up a confirmation message and closes the dialog
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getBook(library);
                JOptionPane.showMessageDialog(null, "Submitted successfully");
                dialog.setVisible(false);
                authorField.setText(null);
                titleField.setText(null);
                categoryField.setText(null);
                pageNum.setValue(1);
                popularity.setValue(1);
                // Repaints the JTable to display updated data
                model.getDataVector().removeAllElements();
                refreshTable(library);
            }
        });

        // Displays the Add Button in the Main Page
        JButton addButton = new JButton("Add");
        c.weightx = 0.5;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 0;
        c.insets = new Insets(5, 5, 5, 5);
        p.add(addButton, c);

        // Button for Search
        JButton searchButton = new JButton("Search");
        c.weightx = 0.5;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 0;
        c.insets = new Insets(5, 5, 5, 5);
        p.add(searchButton, c);

        // JButton sortButton = new JButton("Sort");
        // c.weightx = 0.5;
        // c.fill = GridBagConstraints.HORIZONTAL;
        // c.gridx = 2;
        // c.gridy = 0;
        // c.insets = new Insets(5, 5, 5, 5);
        // p.add(sortButton, c);

        // Adding the ComboBox dropdown menu for sorting
        String[] SortText = { "Author", "Category", "Title", "Length", "Popularity" };
        JComboBox<String> Sort = new JComboBox<String>(SortText);
        Sort.setRenderer(new MyComboBoxRenderer("Sort By:"));
        Sort.setSelectedIndex(-1);
        c.gridx = 2;
        c.gridy = 0;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.insets = new Insets(5, 5, 5, 5);
        p.add(Sort, c);

        // Action Listener for the Sort By: menu
        ActionListener cbActionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String s = (String) Sort.getSelectedItem();// get the selected item

                switch (s) {// check for a match
                    case "Author":
                        // insert code here
                        break;
                    case "Category":
                        // insert code here
                        break;
                    case "Title":
                        // insert code here
                        break;
                    case "Length":
                        // insert code here
                        break;
                    case "Popularity":
                        // insert code here
                        break;
                }
            }
        };
        Sort.addActionListener(cbActionListener);

        // adding textarea
        JTextArea textArea = new JTextArea();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 1;
        c.gridwidth = 3;
        c.weightx = 0.0;
        // c.ipady = 500;
        c.insets = new Insets(5, 5, 5, 5);
        p.add(textArea, c);

        // String week[] = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" };
        // String[] address = new String[4];
        // ArrayList<Book> Books = new ArrayList<Book>();
        /*
         * JList DataList = new JList(Books.toArray());
         * JList DataList = new JList(week);
         * c.gridwidth = 1;
         * c.gridy = 2;
         * c.ipady = 300;
         * c.insets = new Insets(5, 5, 5, 5);
         * p.add(DataList, c);
         */

        // JTable to display all books in library
        // Column Names
        String[] columnNames = { "Genre", "Author", "Title", "Number of Pages", "Rating" };

        // Initializing the JTable
        display = new JTable(new DefaultTableModel(null, columnNames));
        model = (DefaultTableModel) display.getModel();

        display.setAutoCreateRowSorter(true);

        for (int i = 0; i < library.size(); i++) {
            Book curBook = library.get(i);
            model.addRow(new Object[] { curBook.getCategory(), curBook.getAuthor(), curBook.getTitle(),
                    curBook.getLength(), curBook.getPopularity() });
        }

        // adding it to JScrollPane
        sp = new JScrollPane(display);
        c.gridwidth = 5;
        c.gridy = 2;
        c.ipady = 300;
        c.insets = new Insets(5, 5, 5, 5);
        p.add(sp, c);

        // Adding the components to the mainframe
        frame.add(p);

        // Making the main frame visible
        frame.setVisible(true);

        // Button that pops up the form for the "Add" button
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialog.setSize(300, 400);
                dialog.setVisible(true);
                dialog.setLocationRelativeTo(frame);
            }
        });

    }

    // Refreshes the table to display updated Data
    void refreshTable(ArrayList<Book> library) {
        for (int i = 0; i < library.size(); i++) {
            Book curBook = library.get(i);
            model.addRow(new Object[] { curBook.getCategory(), curBook.getAuthor(), curBook.getTitle(),
                    curBook.getLength(), curBook.getPopularity() });
        }
    }

    // Gets user input in submission form and inputting it in the database
    void getBook(ArrayList<Book> library) {
        String author = authorField.getText();
        String category = categoryField.getText();
        String title = titleField.getText();
        int pageNumber = (Integer) pageNum.getValue();
        int Popularity = (Integer) popularity.getValue();
        Book addBook = new Book(category, author, title, pageNumber, Popularity);
        // lib.getLibrary().add(new Book(category, author, title,
        // pageNumber,Popularity));

        // change add to addBook
        library.add(addBook);
        // System.out.println(lib.getLibrary());
    }

    // Sets the text prompt for the Sort Drop Down Menu and changes background when
    // mouse hovers
    class MyComboBoxRenderer extends DefaultListCellRenderer {
        private String _title;

        public MyComboBoxRenderer(String title) {
            _title = title;
        }

        @Override
        public Component getListCellRendererComponent(JList list, Object value,
                int index, boolean isSelected, boolean cellHasFocus) {
            super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
            setToolTipText((String) value);
            if (index == -1 && value == null)
                setText(_title);
            else
                setText(value.toString());
            return this;
        }
    }
}
