package ai1013;

import center.CenterFrame2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class FlowLayoutTest extends JFrame {
    ArrayList<JButton> list = new ArrayList<JButton>(5);
    Color[] colors = {Color.RED, Color.GREEN, Color.BLUE, Color.YELLOW, Color.CYAN};
    boolean flag = true;
    public FlowLayoutTest() {
        setTitle("FlowLayoutTest");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());



        for(int i = 0; i < 5; i++) {
            JButton btn = new JButton("버튼" + i);
            list.add(btn);
            add(btn);
            btn.addActionListener(actionListener);
        }

        int w = 250, h = 250;
        Point point = CenterFrame2.getLocation(w, h);
        setBounds(point.x, point.y, w, h);

        setVisible(true);
    }

    ActionListener actionListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton selectedBtn = (JButton)e.getSource();
            if (selectedBtn.getBackground() == Color.LIGHT_GRAY) {
                selectedBtn.setBackground(colors[list.indexOf(selectedBtn)]);
            }
            else {
                selectedBtn.setBackground(Color.LIGHT_GRAY);
            }

        }
    };
    public static void main(String[] args) {
        new FlowLayoutTest();
    }
}
