package GUI.Drag_And_Drop;

import javax.swing.*;

public class Frame extends JFrame {
    
    DragPanel dragpanel = new DragPanel();
    Frame() {

        this.setTitle("Drag and Drop");
        this.setSize(600, 600);
        this.add(dragpanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
