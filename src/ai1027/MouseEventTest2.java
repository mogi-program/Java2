package ai1027;

import center.SetFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseEventTest2 extends JFrame {
    JLabel lbl = new JLabel();
    public MouseEventTest2(){

        lbl.setOpaque(true);
        JPanel panel = new JPanel();
        JButton btnr = new JButton("red");
        JButton btnb = new JButton("blue");
        JButton btng = new JButton("green");
        panel.add(btnr);
        panel.add(btnb);
        panel.add(btng);
        add(panel);
        add("South", lbl);

        btnr.addMouseListener(mouseListener);
        btnb.addMouseListener(mouseListener);
        btng.addMouseListener(mouseListener);

        lbl.setPreferredSize(new Dimension(500, 100));
        lbl.setBackground(Color.WHITE);
        SetFrame.setFrame(this, 500, 500, "MouseEventTest");
    }

    MouseListener mouseListener = new MouseListener(){
        @Override
        public void mouseClicked(MouseEvent e) {
            JButton btn = (JButton)e.getSource();

            switch (btn.getText()){
                case "red":
                    lbl.setBackground(Color.RED);
                    break;
                case "blue":
                    lbl.setBackground(Color.BLUE);
                    break;
                case "green":
                    lbl.setBackground(Color.GREEN);
                    break;

            }
        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }
    };


    public static void main(String[] args) {
        new MouseEventTest2();
    }
}

