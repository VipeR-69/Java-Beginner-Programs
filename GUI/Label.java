package GUI;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Label {
    public static void main(String[] args) {

        // JLabel - a GUI display area for a string of text, an image, or both

        JFrame frame = new JFrame();
        frame.setTitle("Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(480,480);
        frame.setLayout(null);
        frame.setVisible(true);
        //frame.pack();
        //frame.getContentPane().setBackground(Color.black);

        ImageIcon image = new ImageIcon("E:\\Downloads\\pizza.png");
        Border border = BorderFactory.createLineBorder(Color.green);

        JLabel label = new JLabel();           // create a label
        label.setText("Chaos is a Ladder");     // set text of label
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);    // set text LEFT, CENTER, RIGHT of imageicon
        label.setVerticalTextPosition(JLabel.TOP);        // set text TOP, CENTER, BOTTOM of imageicon
        label.setForeground(Color.green);
        label.setFont(new Font("Fira Code", Font.PLAIN, 25));    // set font of text
        label.setIconTextGap(-25);    // set gap of text to image
        label.setBackground(Color.black);      // set background color
        label.setOpaque(true);
        label.setBorder(border);         // set border
        label.setVerticalAlignment(JLabel.CENTER);      // set vertical position of icon+text within label
        label.setHorizontalAlignment(JLabel.CENTER);    // set horizontal position of icon+text within label
        label.setBounds(100, 100, 350, 350);      // set x,y position within frame as well as dimensions


        frame.add(label);

    }
}