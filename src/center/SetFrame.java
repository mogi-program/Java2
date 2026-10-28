package center;

import javax.swing.*;
import java.awt.*;

public class SetFrame extends JFrame {
    public static void setFrame(JFrame frame, int w, int h, String title) {
        frame.setTitle(title);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Point point = CenterFrame2.getLocation(w, h);
        frame.setBounds(point.x, point.y, w, h);
        frame.setVisible(true);
    }


}
