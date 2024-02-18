import java.awt.event.*;
import javax.swing.*;

public class Test extends JFrame implements ActionListener {
    JTextField tf1, tf2;
    JButton btn;

    Test() {
        // Create text fields and button
        tf1 = new JTextField();
        tf2 = new JTextField();
        btn = new JButton("Check"); 

        // Set layout to null (absolute positioning)
        setLayout(null);
        // Set size of the frame
        setSize(500, 500);
        // Make the frame visible
        setVisible(true);
        // Set default close operation
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Set bounds (position and size) for text fields and button
        tf1.setBounds(50, 50, 150, 20); // Set position (x, y) and size (width, height) for tf1
        tf2.setBounds(50, 100, 150, 20); // Set position (x, y) and size (width, height) for tf2
        btn.setBounds(50, 150, 80, 30); // Set position (x, y) and size (width, height) for btn

        // Make tf2 non-editable
        tf2.setEditable(false);

        // Add components to the frame
        add(tf1);
        add(tf2);
        add(btn);

        // Register action listener for the button
        btn.addActionListener(this);
    }

    // ActionListener implementation
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn) {
            try {
                // Get input from tf1 and parse it to integer
                int num = Integer.parseInt(tf1.getText());
                // Check if the number is even or odd
                if (num % 2 == 0) {
                    tf2.setText("Even number");
                } else {
                    tf2.setText("Odd number"); // Add semicolon here
                }
            } catch (NumberFormatException ex) {
                // Handle non-integer input
                tf2.setText("Invalid input");
            }
        }
    }

    // Main method to create an instance of Test
    public static void main(String[] args) {
        new Test(); // Create an instance of Test
    }
}
