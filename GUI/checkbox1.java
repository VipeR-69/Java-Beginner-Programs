package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class checkbox1 extends JFrame implements ActionListener {
    
    JButton button;
    JCheckBox checkbox;
    ImageIcon xicon;
    ImageIcon yicon;
    
    checkbox1() {
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        xicon = new ImageIcon("D:\\VSC Programs\\Java Programs\\GUI\\pizza.png");
        yicon = new ImageIcon("E:\\Downloads\\like.png");

        checkbox = new JCheckBox();
        checkbox.setText("I'm Not A Robot");
        checkbox.setFocusable(false);
        checkbox.setFont(new Font("Fira Code", Font.ITALIC, 40));
//        checkbox.setIcon(xicon);
//        checkbox.setSelectedIcon(yicon);

        button = new JButton();
        button.setText("Submit");
        button.addActionListener(this);

        this.add(checkbox);
        this.add(button);
        this.pack();
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button) {
            System.out.println(checkbox.isSelected());
        }
    }
}
