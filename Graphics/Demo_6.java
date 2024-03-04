import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Demo_6 extends JPanel implements ActionListener {
    JButton up, down, left, right;
    int ball_x = 100, ball_y = 100, ball_diameter = 100;

    public Demo_6() {
        up = new JButton("up");
        up.setBounds(10, 10, 50, 50);
        down = new JButton("down");
        down.setBounds(10, 70, 50, 50); 
        left = new JButton("left");
        left.setBounds(10, 130, 50, 50); 
        right = new JButton("right");
        right.setBounds(10, 190, 50, 50); 
        add(up);
        add(down);
        add(left);
        add(right);

        up.addActionListener(this);
        down.addActionListener(this);
        left.addActionListener(this);
        right.addActionListener(this);
    }

    public void paint(Graphics g) {
        // clears the area where the component is to be painted before repainting. This prevents any remnants of previous drawings from being visible, ensuring a clean canvas for the component to be painted on.
        super.paint(g); 
        g.setColor(Color.red);
        g.fillOval(ball_x, ball_y, ball_diameter, ball_diameter);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == down) {
            ball_y += 10;
        }
        if (e.getSource() == up) {
            ball_y -= 10;
        }
        if (e.getSource() == left) {
            ball_x -= 10;
        }
        if (e.getSource() == right) {
            ball_x += 10;
        }
        repaint();
    }

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setVisible(true);
        f.setSize(500, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Demo_6 demo = new Demo_6();
        f.add(demo);
    }
}
