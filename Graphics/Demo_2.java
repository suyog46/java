//Drawing arcs and Plolygons

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class  Demo_2  extends JPanel { 
    @Override
    public void paintComponent(Graphics g) {

        setForeground(Color.red);
       g.drawArc(10, 10, 50, 50, 10, 45);
        g.fillArc(20, 20, 100, 100,0,90);
        g.setColor(Color.black);
        g.fillArc(20, 20, 100, 100,30,90);

        //for polygon
        int Xpoints[]={10,170,80,10}; //yo chai x cordinate haru
        int Ypoints[]={20,40,140,20};//yo chai y codinate haru ..ani first la lat x,y cordinate same hunuparxa 

        int npoints=Xpoints.length;
        g.drawPolygon(Xpoints,Ypoints,npoints);
    
    }

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setVisible(true);
        f.setSize(900, 900); 
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        Demo_2 demo = new Demo_2(); 
        f.add(demo); 
    }
}

