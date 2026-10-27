package ai1027;

import center.CenterFrame2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BorderTest extends JFrame {
    public BorderTest() {
        super("BorderTest");
//        JFrame에 5개의 영역에 버튼을 추가하시오
        setLayout(new BorderLayout(10,10));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] position = {
                BorderLayout.NORTH,
                BorderLayout.SOUTH,
                BorderLayout.WEST,
                BorderLayout.EAST,
                BorderLayout.CENTER
        };
        JButton btn[] = new JButton[5];
        for (int i = 0; i < btn.length; i++) {
            btn[i] = new JButton("버튼" + (i + 1));
            btn[i].addActionListener(actionListener);
            add(btn[i], position[i]);

        }
        int w = 250, h = 250;
        Point point = CenterFrame2.getLocation(w, h);
        setBounds(point.x, point.y, w, h);
        setVisible(true);
    }

    ActionListener actionListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(BorderTest.this, ((JButton)e.getSource()).getText() + " 을(를) 클릭했습니다");
        }
    };

    public static void main(String[] args) {
        new BorderTest();
    }
}
