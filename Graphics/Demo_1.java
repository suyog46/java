//to fill square and a oval with string
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class  Demo_1  extends JPanel { 
    @Override
    public void paintComponent(Graphics g) {
        g.setColor(Color.BLACK);
        Font ft = new Font("Serif", Font.BOLD, 20);
        g.setFont(ft);
        g.setColor(Color.red);
        g.fillRect(100, 100, 500, 500);
        g.setColor(Color.GREEN);
        g.fillOval(100, 100, 500, 400);
        // g.drawOval(100, 100, 500, 400);
        g.drawString("Pokhara University", 150, 150);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setVisible(true);
        f.setSize(900, 900); 
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        Demo_1 demoPanel = new Demo_1(); 
        f.add(demoPanel); 
    }
}
