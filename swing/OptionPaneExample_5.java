
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class OptionPaneExample_5 extends JFrame {
    OptionPaneExample_5(){
    JOptionPane.showInputDialog(this,"Enter name");//parent component ehi class ko instance pathako..becauase it extends jframe
    }
    public static void main(String[] args) {
        new OptionPaneExample_5();
    }
}