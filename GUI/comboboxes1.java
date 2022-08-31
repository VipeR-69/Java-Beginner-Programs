package GUI;

import javax.swing.*;
import java.awt.*;
import java. awt.event.*;

public class comboboxes1 extends JFrame implements ActionListener {

    JComboBox combo;

    comboboxes1() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        // Use Wrapper Class to store primitive datatypes within an array
        String[] animals = {"dog", "cat", "bird"};

        combo = new JComboBox(animals);
        combo.addActionListener(this);
        // combo.setEditable(true);
        combo.addItem("horse");
        combo.insertItemAt("pig", 1);
        // combo.setSelectedIndex(2);
        // combo.removeItem("cat");
        // combo.removeItemAt(0);
        // combo.removeAllItems();
        System.out.println("Current Items - "+combo.getItemCount());

        this.add(combo);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == combo) {
            System.out.println(combo.getSelectedItem());
            System.out.println(combo.getSelectedIndex());
        }
    }
    
}
