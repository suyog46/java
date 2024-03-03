//Nepal Flag

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class  Demo_3  extends JPanel { 
    @Override
    public void paintComponent(Graphics g) {

        g.setColor(Color.GREEN);
        g.fillRect(10, 20, 300, 300);


        Font ft = new Font("Serif", Font.BOLD, 20);
        g.setFont(ft);
        g.setColor(Color.black);
        g.drawString("My Nepal",150,350 );

        //aba chai nepal ko bahira ko blue ma vako
        int[] x={20,200,100,240,20,20};
        int[] y={20,150,150,300,300,20};
        int n=6;
        g.setColor(Color.BLUE);
        g.fillPolygon(x,y,n);
 //then vitra ko red ma vako
        int[] xx={30,170,75,215,30,30};
        int[] yy={40,140,140,290,290,35};
        g.setColor(Color.red);
        g.fillPolygon(xx,yy,n);

        //moon ra sun ko lagi
        g.setColor(Color.white);
        g.fillArc(50, 80, 40, 40, 0, -180);
        g.fillOval(50, 200, 50, 50);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setVisible(true);
        f.setSize(900, 900); 
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        Demo_3 demo = new Demo_3(); 
        f.add(demo); 
    }
}

