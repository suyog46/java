import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.BorderLayout;
class BorderExample extends JFrame{
    JButton btn1,btn2,btn3,btn4,btn5;
    BorderExample(){
    btn1=new JButton("East");
    btn2= new JButton("west");
    btn3= new JButton("north");
    btn4=new JButton("south");
    btn5= new JButton("Center");
    
    //set layout
    setSize(400,400);
    setVisible(true);
    setLayout(new BorderLayout());

    //add buttons
    add(btn1,BorderLayout.EAST);
        add(btn2,BorderLayout.WEST);
    add(btn3,BorderLayout.NORTH);
    add(btn4,BorderLayout.SOUTH);
    add(btn5,BorderLayout.CENTER);
    }

public static void main(String[] args) {
    new BorderExample();
}
}