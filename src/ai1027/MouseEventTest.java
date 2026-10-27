package ai1027;

import center.SetFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseEventTest extends JFrame {
    JLabel lbl = new JLabel();
    public MouseEventTest(){
        SetFrame.setFrame(this, 500, 500, "MouseEventTest");
        JPanel panel = new JPanel();
        JButton btn = new JButton("마우스 이벤트 연습");

        panel.add(btn);
        add(panel);
        add("South", lbl);

        btn.addMouseListener(mouseListener);

        setVisible(true);

    }

    MouseListener mouseListener = new MouseListener(){
        @Override
        public void mouseClicked(MouseEvent e) {
            lbl.setText("버튼에 마우스가 클릭됨");
        }

        @Override
        public void mousePressed(MouseEvent e) {
            lbl.setText("버튼에 마우스가 눌러짐");
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            lbl.setText("버튼에 마우스가 띄어짐");
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            lbl.setText("버튼에 마우스가 들어옴");
        }

        @Override
        public void mouseExited(MouseEvent e) {
            lbl.setText("버튼에 마우스가 나감");
        }
    };

    public static void main(String[] args) {
        new MouseEventTest();
    }
}

