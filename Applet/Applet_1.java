import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Applet_1 extends Applet implements ActionListener {
    TextField number, factorial;
    Button calculate;

    public void init() {
        Label numberP = new Label("Input number");
        Label factorialP = new Label("Factorial");
        number = new TextField(30);
        factorial = new TextField(30);
        calculate = new Button("Calculate");
        add(numberP);
        add(number);
        add(factorialP);
        add(factorial);
        add(calculate);

        calculate.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        String snumber = number.getText();
        int num = Integer.parseInt(snumber);
        factorial.setText(String.valueOf(getFactorial(num)));
    }
    double getFactorial(int k) {
        double fact = 1;
        for (int i = 1; i <= k; i++) {
            fact = fact * i;
        }
        return fact;
    }
    public void paint(Graphics g) {
        g.drawString("Hello world", 10, 100);
    }
}
