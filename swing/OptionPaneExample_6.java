import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class OptionPaneExample_6 extends JFrame {
    OptionPaneExample_6() {
        setSize(500, 500);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {//this ko satta yehi define gardeko object jun le listener interface implement garxa
            //  WindowListener add gareko to the JFrame using  anonymous inner class. The WindowAdapter class provides empty implementations for all methods of the WindowListener interface, allowing us to override only the methods we're interested in.
            public void windowClosing(WindowEvent e) {
                int a = JOptionPane.showConfirmDialog(null, "Are you sure?");
                if (a == JOptionPane.YES_OPTION) {
                    setDefaultCloseOperation(EXIT_ON_CLOSE);
                }
            }
        });
    }

    public static void main(String[] args) {
        new OptionPaneExample_6();
    }
}
