package GUI;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.*;

public class Frame1 extends JFrame {

    Frame1() {
        
        this.setTitle("Frame");       // set title of frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     // exit out of application
        this.setSize(420,420);                  // sets x and y - dimensions of frame
        this.setResizable(false);              // prevent frame from being resized
        this.setVisible(true);    // make frame visible
                
        ImageIcon image = new ImageIcon("E:\\Downloads\\hotdog.png");   // create an ImageIcon
        this.setIconImage(image.getImage());                          // change icon of frame
        this.getContentPane().setBackground(new Color(0,0,255));    // change color of background
    }
}
