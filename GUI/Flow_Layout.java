package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

public class Flow_Layout {
    public static void main(String[] args) {

        // Layout Manager - Defines the natural layout for components within a container

        // Flow Layout - places components in a row, sized at their preferred size.
        //               if the horizontal space in the container is too small,
        //               the FlowLayout class uses that next available row.
        
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(250, 400));
        panel.setBackground(Color.magenta);
        panel.setLayout(new FlowLayout());

/*      
        JButton button1 = new JButton();
        button1.setText("1");
        JButton button2 = new JButton();
        button1.setText("2");
        JButton button3 = new JButton();
        button1.setText("3");
        JButton button4 = new JButton();
        button1.setText("4");
        JButton button5 = new JButton();
        button1.setText("5");
        JButton button6 = new JButton();
        button1.setText("6");
        JButton button7 = new JButton();
        button1.setText("7");
        JButton button8 = new JButton();
        button1.setText("8");
        JButton button9 = new JButton();
        button1.setText("9");

        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);
        frame.add(button6);
        frame.add(button7);
        frame.add(button8);
        frame.add(button9);
*/

        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        panel.add(new JButton("9"));

        frame.add(panel);
        frame.setVisible(true);

    }
}
