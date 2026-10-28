package ai1027;

import center.SetFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseEventTest extends JFrame {
    JLabel lbl = new JLabel();
    public MouseEventTest(){

        JPanel panel = new JPanel();
        JButton btn = new JButton("마우스 이벤트 연습");

        panel.add(btn);
        add(panel);
        add("South", lbl);

        btn.addMouseListener(mouseListener);


        SetFrame.setFrame(this, 500, 500, "MouseEventTest");
    }

    MouseListener mouseListener = new MouseListener(){
        @Override
        public void mouseClicked(MouseEvent e) {
            lbl.setText("버튼에 마우스가 클릭됨");
        }

        @Override
        public void mousePressed(MouseEvent e) {
            int btnc = e.getButton();
            switch (btnc){
                case 1:
                    lbl.setText("왼쪽");
                    break;
                case MouseEvent.BUTTON2:
                    lbl.setText("가운데");
                    break;
                case MouseEvent.BUTTON3:
                    lbl.setText("오른쪽");
                    break;

            }

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

