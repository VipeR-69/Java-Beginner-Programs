package GUI;

import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;

public class slider1 implements ChangeListener {

    JSlider slider;
    JFrame frame;
    JPanel panel;
    JLabel label;

    slider1() {

        frame = new JFrame();
        slider = new JSlider(0, 100, 50);
        panel = new JPanel();
        label = new JLabel();

        slider.setPreferredSize(new Dimension(400, 200));
        
        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(10);
        
        slider.setPaintTicks(true);
        slider.setMajorTickSpacing(25);
        
        slider.setPaintLabels(true);
        slider.setFont(new Font("MV Boli", Font.BOLD, 15));

        slider.setOrientation(SwingConstants.VERTICAL);
        slider.addChangeListener(this);

        label.setText(" C = "+slider.getValue());
        label.setFont(new Font("MV Boli", Font.BOLD, 25));

        panel.setBackground(Color.yellow);

        panel.add(slider);
        panel.add(label);
        frame.add(panel);
        frame.setSize(450, 450);
        frame.setVisible(true);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        
        label.setText(" C = "+slider.getValue());
    }
    
}
