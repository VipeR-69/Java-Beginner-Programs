package GUI;

import java.awt.*;
import javax.swing.*;

public class LayeredPane {
    public static void main(String[] args) {

        // JLayeredPane - swing container that provides a third dimension for positioning components
        //   Examples   -   depth, Z-index

        JLabel label1 = new JLabel();
        label1.setOpaque(true);
        label1.setBackground(Color.RED);
        label1.setBounds(50, 50, 200, 200);

        JLabel label2 = new JLabel();
        label2.setOpaque(true);
        label2.setBackground(Color.GREEN);
        label2.setBounds(100, 100, 200, 200);

        JLabel label3 = new JLabel();
        label3.setOpaque(true);
        label3.setBackground(Color.BLUE);
        label3.setBounds(150, 150, 200, 200);

        JLabel label4 = new JLabel();
        label4.setOpaque(true);
        label4.setBackground(Color.ORANGE);
        label4.setBounds(200, 200, 250, 250);

        JLayeredPane pane = new JLayeredPane();
        pane.setBounds(0, 0, 500, 500);
        pane.add(label1, Integer.valueOf(0));
        pane.add(label2, Integer.valueOf(2));
        pane.add(label3, Integer.valueOf(1));
        pane.add(label4, JLayeredPane.DRAG_LAYER);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(500, 500));
        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(pane);

    }
}
