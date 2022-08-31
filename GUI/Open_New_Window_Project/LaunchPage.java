package GUI.Open_New_Window_Project;

import java.awt.event.*;
import javax.swing.*;

public class LaunchPage implements ActionListener{
    
    JFrame frame = new JFrame();
    JButton button = new JButton("New Window");

    LaunchPage() {

        button.setBounds(100, 160, 200, 140);
        button.setFocusable(false);
        button.addActionListener(this);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(button);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //button.setEnabled(false);
        frame.dispose();
        if (e.getSource() == button) {
            new NewWindow();
        }
    }
}
