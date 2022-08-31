package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class keylistener1 extends JFrame implements KeyListener{

    JLabel label;
    ImageIcon icon;
    
    keylistener1() {
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(null);
        this.addKeyListener(this);

        icon = new ImageIcon("E:\\Downloads\\ufo.png");

        label = new JLabel();
        label.setBounds(0, 0, 100, 100);
        // label.setBackground(Color.BLUE);
        // label.setOpaque(true);
        label.setIcon(icon);

        this.getContentPane().setBackground(Color.black);
        this.add(label);
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // KeyTyped = Invoked when a key is typed. Uses KeyChar, char output

        switch(e.getKeyChar()) {
            case'a': label.setLocation(label.getX()-10, label.getY());
            break;
            case'w': label.setLocation(label.getX(), label.getY()-10);
            break;
            case's': label.setLocation(label.getX(), label.getY()+10);
            break;
            case'd': label.setLocation(label.getX()+10, label.getY());
            break;
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // KeyPressed = Invoked when a physical key is pressed down. Uses KeyCode, int output

        System.out.println("You pressed key Char - "+e.getKeyChar());
        System.out.println("You pressed key Code - "+e.getKeyCode()+"\n");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // KeyReleased = called whenever a button is released

        System.out.println("You released key Char - "+e.getKeyChar());
        System.out.println("You released key Code - "+e.getKeyCode()+"\n");
    }
}
