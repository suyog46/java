import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Demo_4 extends JPanel {
    int[] data_values;
    Color[] data_clr;
    int total;
    public Demo_4() {
        init();
        start();
    }
    public void init(){
        data_values= new int[]{40,30,20,10};
        data_clr= new Color[]{Color.red,Color.blue,Color.green,Color.yellow};

    }
    public void start(){
        int n= data_values.length;
        int i;
        total=0;
        for(i=0;i<n;i++){
            total+=data_values[i];
        }
    }
    public void paint(Graphics g){
        int i;
        int start_angle=0;
        for(i=0;i<data_values.length;i++){
            int arc_angle=(int)(data_values[i]*360/total);
            g.setColor(data_clr[i]);
            g.fillArc(100, 100, 300,300, start_angle, arc_angle);
            start_angle+=arc_angle;
        }
    }
    
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setVisible(true);
        f.setSize(900, 900); 
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        Demo_4 demo = new Demo_4(); 
        f.add(demo); 
    }
}
