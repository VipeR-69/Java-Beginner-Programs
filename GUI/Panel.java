package GUI;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;

public class Panel {
    public static void main(String[] args){

        // JPanel - a GUI component that functions as a container to hold other components

        ImageIcon image = new ImageIcon("D:\\VSC Programs\\Java Programs\\pizza.png");

        JLabel label = new JLabel();
        label.setText("Hi");
        label.setIcon(image);
        //label.setVerticalAlignment(JLabel.BOTTOM);
        //label.setHorizontalAlignment(JLabel.RIGHT);
        label.setBounds(0,0,50,37);

        JPanel redpanel = new JPanel();
        redpanel.setBackground(Color.red);
        redpanel.setBounds(0,0,250,250);

        JPanel bluepanel = new JPanel();
        bluepanel.setBackground(Color.blue);
        bluepanel.setBounds(250,0,250,250);

        JPanel greenpanel = new JPanel();
        greenpanel.setBackground(Color.green);
        greenpanel.setBounds(0,250,500,250);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750,750);
        frame.setVisible(true);
        redpanel.add(label);
        frame.add(redpanel);
        frame.add(bluepanel);
        frame.add(greenpanel);

    }
}
