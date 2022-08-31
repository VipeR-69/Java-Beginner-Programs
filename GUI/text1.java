package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class text1 extends JFrame implements ActionListener {

    JTextField textfield;
    JButton button;
    
    text1() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        textfield = new JTextField();
        textfield.setPreferredSize(new Dimension(250, 40));
        textfield.setFont(new Font("Fira Code", Font.ITALIC, 35));
        textfield.setForeground(new Color(0x00FF00));
        textfield.setBackground(Color.black);
        textfield.setCaretColor(Color.white);
        textfield.setText("Username");

        button = new JButton("Submit");
        button.setForeground(Color.yellow);
        button.setBackground(Color.black);
        button.addActionListener(this);

        this.add(textfield);
        this.add(button);
        this.pack();
        this.setVisible(true);        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button) {
            System.out.println("Hello");
            System.out.println("Hello "+ textfield.getText());
            textfield.setEditable(false);
            button.setEnabled(false);
        }
    }
}
