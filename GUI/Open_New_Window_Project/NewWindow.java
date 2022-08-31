package GUI.Open_New_Window_Project;

import java.awt.Font;

import javax.swing.*;

public class NewWindow {
    
    JFrame frame = new JFrame();
    JLabel label = new JLabel("Chiyari !!!");

    NewWindow() {

        label.setBounds(0, 0, 200, 150);
        label.setFont(new Font(null, Font.BOLD, 25));
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);

        frame.add(label);

    }
}
