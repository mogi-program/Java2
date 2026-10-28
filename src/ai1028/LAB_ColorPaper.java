package ai1028;

import center.SetFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

public class LAB_ColorPaper extends JPanel {
    int x1, x2, y1, y2;
    LAB_ColorPaper(){
        setBackground(Color.YELLOW);
        addMouseListener(panelListener);
    }

    MouseListener panelListener = new MouseAdapter(){
        public void mousePressed(MouseEvent e){
            x1 = e.getX();
            y1 = e.getY();
        }
        public void mouseReleased(MouseEvent e){
            x2 = e.getX();
            y2 = e.getY();
            repaint();
        }
    };

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.MAGENTA);
        g.drawLine(x1, y1, x2, y2);
    }
}
