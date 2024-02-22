import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonChange extends JFrame implements ActionListener {
    JButton btn1, btn2;

    ButtonChange() {
        btn1 = new JButton("Black");
        btn2 = new JButton("Blue");
        setLayout(null);
        setSize(500, 500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        btn1.setBounds(50, 50, 150, 20);
        btn2.setBounds(50, 100, 150, 20);
        add(btn1);
        add(btn2);

        btn1.addActionListener(this);
        btn2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn1) {
            getContentPane().setBackground(Color.black); // Set background color to black of the container that we are adding the components to 
        } else if (e.getSource() == btn2) {
            getContentPane().setBackground(Color.blue); // Set background color to blue
        }
    }

    public static void main(String[] args) {
        new ButtonChange();
    }
}
