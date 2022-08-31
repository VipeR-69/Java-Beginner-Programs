package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class radiobutton1 extends JFrame implements ActionListener {

    JRadioButton pizza;
    JRadioButton burger;
    JRadioButton hotdog;

    ImageIcon icon1 = new ImageIcon("D:\\VSC Programs\\Java Programs\\pizza.png");
    ImageIcon icon2 = new ImageIcon("D:\\VSC Programs\\Java Programs\\pizza.png");
    ImageIcon icon3 = new ImageIcon("D:\\VSC Programs\\Java Programs\\pizza.png");

    radiobutton1() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        pizza = new JRadioButton("Pizza");
        pizza.addActionListener(this);
        pizza.setIcon(icon1);
        burger = new JRadioButton("burger");
        burger.addActionListener(this);
        burger.setIcon(icon2);
        hotdog = new JRadioButton("hotdog");
        hotdog.addActionListener(this);
        hotdog.setIcon(icon3);

        ButtonGroup group = new ButtonGroup();
        group.add(pizza);
        group.add(burger);
        group.add(hotdog);

        this.add(pizza);
        this.add(burger);
        this.add(hotdog);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == pizza){
            System.out.println("You orderd a pizza !!!!");
        }
        else if(e.getSource() == burger) {
            System.out.println("You ordered a burger !!!!");
        }
        else if(e.getSource() == hotdog) {
            System.out.println("You ordered a hotdog !!!!");
        }    
 
    }
}
