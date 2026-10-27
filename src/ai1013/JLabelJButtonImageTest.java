package ai1013;

import javax.swing.*;
import center.CenterFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class JLabelJButtonImageTest extends JFrame {
    ImageIcon lblIcon = new ImageIcon("img/강아지2.jpg");
    JLabel lbl = new JLabel();
    public JLabelJButtonImageTest() {
        setTitle("ImageIcon설정 컴포넌트");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton btn = new JButton("Click Me", new ImageIcon("img/강아지.png"));
        btn.addActionListener(btnListener);



        add("North", btn);
        add("Center", lbl);

        int w = 350, h = 350;
        int[] locations = CenterFrame.getLocation(w, h);
        setBounds(locations[0], locations[1], w, h);
        setVisible(true);

    }
    ActionListener btnListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (lbl.getIcon() == null) {
                lbl.setIcon(lblIcon);
            } else {
                lbl.setIcon(null);
            }
        }
    };
    public static void main(String[] args) {

        new JLabelJButtonImageTest();
    }
}
