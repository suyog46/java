import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Demo_0 extends JPanel { // Custom JPanel class to override paintComponent
    @Override
    public void paintComponent(Graphics g) {
        g.setColor(Color.BLACK);
        Font ft = new Font("Serif", Font.BOLD, 20);
        g.setFont(ft);
        g.drawOval(100, 100, 500, 400);
        g.drawString("Pokhara University", 150, 150);
        g.drawRoundRect(10, 100, 80, 50, 10,10);
        g.fillRoundRect(20, 20, 80, 50, 10,10);//if nothing set it will fill black color
g.drawLine(100, 100, 200, 200);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setVisible(true);
        f.setSize(700, 600); 
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        Demo_0 demoPanel = new Demo_0(); 
        f.add(demoPanel); 
    }
}
