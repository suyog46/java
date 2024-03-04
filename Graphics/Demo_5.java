//to draw barchart

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Demo_5 extends JPanel {
    public void paint(Graphics g){
        String label[]={"java","C++","c"};
        int data[]={50,30,40};
       Color[] data_clr= new Color[]{Color.red,Color.blue,Color.green,Color.yellow};
    
        for(int i=0;i<3;i++){
            
            g.setColor(Color.BLACK);
            g.drawString(label[i],10,10+i*50);
            g.setColor(data_clr[i]);
            g.fillRect(30, 10+i*50, data[i], 10);
        }
    }
    
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setVisible(true);
        f.setSize(900, 900); 
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        Demo_5 demo = new Demo_5(); 
        f.add(demo); 
    }
}
