
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Boxlayout extends JFrame {   
     JButton btn1,btn2,btn3,btn4,btn5;
    Boxlayout(){
    btn1=new JButton("1");
    btn2= new JButton("2");
    btn3= new JButton("3");
    btn4=new JButton("long4");
    btn5= new JButton("5");
    
    //set layout
    setSize(400,400);
    setVisible(true);
    setLayout(new BoxLayout(this.getContentPane(),BoxLayout.Y_AXIS));

    //add buttons
    add(btn1);
         add(btn2);
        add(btn3);
        add(btn4);
        add(btn5);
    }

public static void main(String[] args) {
    new Boxlayout();
}
}