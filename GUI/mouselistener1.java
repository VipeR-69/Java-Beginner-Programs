package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class mouselistener1 extends JFrame implements MouseListener{

    JLabel label;

    mouselistener1() {
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(null);

        label = new JLabel();
        label.setBounds(0, 0, 100, 100);
        label.setBackground(Color.blue);
        label.setOpaque(true);
        label.addMouseListener(this);
        // this.addMouseListener(this);

        this.add(label);
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // Invoked when the mouse button has been clicked (pressed and released) on a component
        
        System.out.println("You clicked the mouse");
        label.setBackground(Color.yellow);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // Invoked when the mouse button has been pressed on a component
        
        System.out.println("You pressed the mouse");
        label.setBackground(Color.red);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // Invoked when the mouse button has been released on a component
        
        System.out.println("You released the mouse");
        label.setBackground(Color.green);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // Invoked when the mouse enters a component
        
        System.out.println("You entered the component");
        label.setBackground(Color.orange);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // Invoked when the mouse exits a component
        
        System.out.println("You exited the component");
        label.setBackground(Color.pink);
    }
}
