package CSC325BookSorterProject_Fall2023;
//JTO 08152023: GUI Java Member Registration Example
//Importing Java.swing and dependencies
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Create a class
public class UserInformationForm {
    //create private instances of JFame tools needed
    private JFrame frame;
    private JTextField usernameField;
    private JTextField emailField;
    private JTextArea addressArea;

    public UserInformationForm() {
        // Create the main frame
        frame = new JFrame("User Information Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Create a 4x2 grid layout for the main frame with 10-pixel padding
        frame.setLayout(new GridLayout(4, 2, 10, 10));

        // Labels for the input fields
        JLabel usernameLabel = new JLabel("Username:");
        JLabel emailLabel = new JLabel("Email:");
        JLabel addressLabel = new JLabel("Address:");

        // Input fields for username, email, and address
        usernameField = new JTextField();
        emailField = new JTextField();
        addressArea = new JTextArea();

        // Button to submit the form
        JButton submitButton = new JButton("Submit");

        // Add components to the main frame
        frame.add(usernameLabel);
        frame.add(usernameField);
        frame.add(emailLabel);
        frame.add(emailField);
        frame.add(addressLabel);
        frame.add(new JScrollPane(addressArea));
        frame.add(new JPanel()); // Placeholder for layout
        frame.add(submitButton);

        // Action listener for the submit button
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // When the submit button is clicked, show the verification dialog
                showVerificationDialog();
            }
        });

        // Make the main frame visible
        frame.setVisible(true);
    }

    private void showVerificationDialog() {
        // Get the entered data from the input fields
        String username = usernameField.getText();
        String email = emailField.getText();
        String address = addressArea.getText();

        // Create a verification message displaying the entered data
        String verificationMessage = "Verify the entered information:\n\n" +
                "Username: " + username + "\n" +
                "Email: " + email + "\n" +
                "Address: " + address;

        // Show a confirmation dialog with Yes and No options
        int choice = JOptionPane.showConfirmDialog(frame, verificationMessage,
                "Verify Information", JOptionPane.YES_NO_OPTION);

        // If the user clicks Yes, process the submitted data and show a confirmation message
        if (choice == JOptionPane.YES_OPTION) {
            // Process the submitted data (replace with your logic)
            // For now, show a confirmation message
            JOptionPane.showMessageDialog(frame, "Data submitted successfully!");
        }
    }

    public static void main(String[] args) {
        // Create and run the GUI on the Event Dispatch Thread
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new UserInformationForm();
            }
        });
    }
}
