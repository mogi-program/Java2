package ai1027;

import center.CenterFrame2;
import center.SetFrame;

import javax.swing.*;
import java.awt.*;

public class GridTest extends JFrame {
    public GridTest() {
        super("GridTest");
        setLayout(new GridLayout(3, 3));
        SetFrame.setFrame(this, 250, 250, "GridTest");
        JButton btn[] = new JButton[9];
        for (int i = 0; i < btn.length; i++) {
            btn[i] = new JButton("버튼" + (i + 1));
            add(btn[i]);
        }
        setVisible(true);
    }

    public static void main(String[] args) {
        new GridTest();
    }
}
