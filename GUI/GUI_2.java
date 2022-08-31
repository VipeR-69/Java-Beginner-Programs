package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GUI_2 extends JFrame implements ActionListener {
    
    JButton button;
    JLabel label;

    GUI_2() {

        ImageIcon image = new ImageIcon("D:\\VSC Programs\\Java Programs\\pizza.png");
        ImageIcon icon = new ImageIcon("D:\\VSC Programs\\Java Programs\\pizza.png");

        label = new JLabel();
        label.setIcon(icon);
        label.setBounds(150, 250, 150, 150);
        label.setVisible(false);

        button = new JButton();
        button.setBounds(200, 100, 250, 150);
        button.addActionListener(this);
        button.setText("Puneet Superstar");
        button.setFocusable(false);
        button.setIcon(image);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
        button.setIconTextGap(-12);
        button.setForeground(Color.yellow);
        button.setBackground(Color.black);
        button.setBorder(BorderFactory.createEtchedBorder());
        // button.setEnabled(false);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button) {
            System.out.println("Yeahhhhhh");
            label.setVisible(true);

            // button.setEnabled(false);         // Button will be disable after one click
        }
    }
}
