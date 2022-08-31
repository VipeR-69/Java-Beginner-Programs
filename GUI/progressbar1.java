package GUI;

import javax.swing.*;
import java.awt.*;

public class progressbar1 {

    JFrame frame = new JFrame();
    JProgressBar bar = new JProgressBar(0, 500);
    JLabel label = new JLabel();
    JPanel panel = new JPanel();

    progressbar1() {

        bar.setValue(0);
        bar.setBounds(0, 0, 420, 50);
        bar.setStringPainted(true);
        bar.setFont(new Font("MV Boli", Font.BOLD, 25));
        bar.setForeground(Color.red);
        bar.setBackground(Color.black);

        frame.add(bar);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(440, 440);
        frame.setLayout(null);
        frame.setVisible(true);

        fill();
    }

    public void fill() {
        int counter = 500;

        while(counter>=0) {
            bar.setValue(counter);
            bar.setString("Health Points - "+bar.getValue());
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            counter -= 5;
        }
        bar.setString("YOU'RE DEAD !!");
    }

}
