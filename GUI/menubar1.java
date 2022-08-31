package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class menubar1 extends JFrame implements ActionListener {
    
    JMenuBar menu;
    JMenu filemenu;
    JMenu editmenu;
    JMenu helpmenu;

    JMenuItem load;
    JMenuItem save;
    JMenuItem exit;
    JMenuItem color;

    ImageIcon icon;
    JFileChooser filechooser = new JFileChooser();

    menubar1() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(new FlowLayout());

        menu = new JMenuBar();
        filemenu = new JMenu("File");
        editmenu = new JMenu("Edit");
        helpmenu = new JMenu("Help");

        icon = new ImageIcon("D:\\VSC Programs\\Java Programs\\pizza.png");

        load = new JMenuItem("Load");
        save = new JMenuItem("Save");
        exit = new JMenuItem("Exit");
        color = new JMenuItem("Choose Color");
        load.addActionListener(this);
        save.addActionListener(this);
        exit.addActionListener(this);
        color.addActionListener(this);

        load.setIcon(icon);
        save.setIcon(icon);
        exit.setIcon(icon);
        color.setIcon(icon);

        load.setMnemonic(KeyEvent.VK_L);      // l for load
        save.setMnemonic(KeyEvent.VK_S);      // s for save
        exit.setMnemonic(KeyEvent.VK_E);      // e for exit
        color.setMnemonic(KeyEvent.VK_C);     // c for choose color
        filemenu.setMnemonic(KeyEvent.VK_F);      // Alt+f for filemenu
        editmenu.setMnemonic(KeyEvent.VK_E);      // Alt+E for editmenu
        helpmenu.setMnemonic(KeyEvent.VK_H);      // Alt+H for helpmenu

        filemenu.add(load);
        filemenu.add(save);
        filemenu.add(exit);
        
        editmenu.add(color);

        menu.add(filemenu);
        menu.add(editmenu);
        menu.add(helpmenu);
        this.add(menu);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == load) {

            File file = new File(filechooser.getSelectedFile().getAbsolutePath());
            filechooser.setCurrentDirectory(new File("."));
            int response = filechooser.showOpenDialog(null);    // select file to open
            if(response == 0) {
                System.out.println(file);
            }
            else {
                System.out.println("Cancelled");
            }
        }

        else if(e.getSource() == save) {
            
            File file = new File(filechooser.getSelectedFile().getAbsolutePath());
            filechooser.setCurrentDirectory(new File("."));
            int response = filechooser.showSaveDialog(null);    // select file to save
            if(response == 0) {
                System.out.println(file);
            }
            else {
                System.out.println("Cancelled");
            }
        }

        else if(e.getSource() == exit) {
            System.exit(0);
        }

        else if(e.getSource() == color) {

            Color color = JColorChooser.showDialog(null, "Pick a Color", Color.blue);
            menu.setBackground(color);
        }
    }
}
