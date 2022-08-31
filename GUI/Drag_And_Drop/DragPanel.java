package GUI.Drag_And_Drop;

import javax.swing.*;
import org.w3c.dom.events.MouseEvent;
import java.awt.*;
import java.awt.Point;
import java.awt.event.*;
import java.awt.event.MouseMotionAdapter;

public class DragPanel extends JPanel {

    ImageIcon icon = new ImageIcon("D:\\VSC Programs\\Java Programs\\pizza.png");
    final int WIDTH = icon.getIconWidth();
    final int HEIGHT = icon.getIconHeight();
    Point iconcorner;
    Point prevPt;

    DragPanel() {

        iconcorner = new Point(0, 0);
        ClickListener clicklistener = new ClickListener();
        DragListener draglistener = new DragListener();

        this.addMouseListener(clicklistener);
        this.addMouseMotionListener(draglistener);

    }

    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        icon.paintIcon(this, g, (int)iconcorner.getX(), (int)iconcorner.getY());

    }

    private class ClickListener extends MouseAdapter {

        public void mousePressed(MouseEvent e) {
            prevPt = e.getPoint();
        }

    }

    private class DragListener extends MouseMotionAdapter {

        public void mouseDragged(MouseEvent e) {

            Point currentpt = e.getPoint();

            iconcorner.translate(
                (int)(currentpt.getX() - prevPt.getX()),
                (int)(currentpt.getY() - prevPt.getY())
                );
                prevPt = currentpt;
                repaint();
        }

    }

}
