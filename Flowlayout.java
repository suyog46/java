import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;
public class Flowlayout extends JFrame {
        Flowlayout(){
        JButton btn1,btn2,btn3,btn4,btn5;
        btn1=new JButton("1");
        btn2= new JButton("2");
        btn3= new JButton("3");
        btn4=new JButton("4");
        btn5= new JButton("5");
        //set layout
        setLayout(new FlowLayout(FlowLayout.LEFT));
        setSize(400,400);
        setVisible(true);
        //Add buttons
        add(btn1);
         add(btn2);
        add(btn3);
        add(btn4);
        add(btn5);
    }
    public static void main(String[] args) {
         new Flowlayout();            
    }
}
