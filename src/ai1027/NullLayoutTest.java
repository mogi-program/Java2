package ai1027;

import center.SetFrame;

import javax.swing.*;

public class NullLayoutTest extends JFrame {
    NullLayoutTest() {
        setLayout(null);

        int[] pointsX = {50, 80, 110};
        int[] pointsY = new int[] {50, 80, 110};

        int btnW = 70, btnH = 60;

        for(int i = 0 ; i < pointsX.length ; i++) {
            JButton btn = new JButton("버튼" + (i + 1));
            btn.setBounds(pointsX[i], pointsY[i], btnW, btnH);
            add(btn);
        }

        SetFrame.setFrame(this, 250, 250, "NullLaytoutTest");

        setVisible(true);
    }

    public static void main(String[] args) {
        new NullLayoutTest();
    }
}
