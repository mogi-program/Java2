package ai1028;

import center.SetFrame;

import javax.swing.*;
import java.awt.event.*;

public class FindLocationMouseEvent extends JFrame {
    JTextField textX, textY;
    public FindLocationMouseEvent() {
        JPanel panel = new JPanel();
        textX = new JTextField(5);
        textY = new JTextField(5);

        panel.add(textX);
        panel.add(textY);
        add("South", panel);
        addMouseListener(mouseListener);
        addMouseMotionListener(mouseListener2);

        SetFrame.setFrame(this, 500, 500, "FindLocationMouseEventTest");
    }

    MouseListener mouseListener = new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            textX.setText(e.getX() + "");
            textY.setText(e.getY() + "");
        }

    };
    MouseMotionListener mouseListener2 = new MouseMotionAdapter() {
        @Override
        public void mouseMoved(MouseEvent e) {
            textX.setText(e.getX() + "");
            textY.setText(e.getY() + "");
        }

    };

    public static void main(String[] args) {
        new  FindLocationMouseEvent();
    }
}
