import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class MousePointer_3 extends JFrame implements MouseListener {
    JTextField tf1,tf2;
    MousePointer_3(){
        setLayout(null);
        setSize(500, 500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        
        tf1=new JTextField();
        tf2=new JTextField();
        
        tf1.setBounds(50, 50, 150, 20);
        tf2.setBounds(50, 100, 150, 20);

        add(tf1);
        add(tf2);

        addMouseListener(this);
    }
    public void mouseClicked(MouseEvent e){}
    public void mousePressed(MouseEvent e){}
    public void mouseReleased(MouseEvent e){}
    public void mouseEntered(MouseEvent e){
        tf1.setText("Mouse Entered");
        int n1=e.getX();
        int n2=e.getY();
        tf2.setText("x="+n1+"y="+n2);

    }
    public void mouseExited(MouseEvent e){
    tf1.setText("Mouse Exited");
    tf2.setText("");
    }
    public static void main(String[] args) {
        new MousePointer_3();
    }
}
