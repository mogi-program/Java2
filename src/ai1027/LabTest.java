package ai1027;

import center.SetFrame;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class LabTest extends JFrame {
    public LabTest() {
        Random rand = new Random();
        int rows = rand.nextInt(10) + 1;
        int cols = rand.nextInt(10) + 1;
        setLayout(new GridLayout(rows, cols));
        SetFrame.setFrame(this, 500, 500, "LabTest");
        Color[] colors = {Color.red, Color.green, Color.blue, Color.YELLOW, Color.magenta, Color.orange};
        for (int i = 0; i < rows*cols; i++) {
            int randNum = rand.nextInt(6) + 1;
            JButton btn = new JButton(randNum + "");
            btn.setBackground(colors[randNum-1]);
            add(btn);
        }
        setVisible(true);
    }

    public static void main(String[] args) {
        new LabTest();
    }
}
