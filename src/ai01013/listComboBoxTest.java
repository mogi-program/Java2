package ai01013;

import center.CenterFrame;

import javax.swing.*;
import java.awt.*;

public class listComboBoxTest extends JFrame {

    public listComboBoxTest() throws HeadlessException {
        setTitle("문자열 입력 컴포넌트");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        String[] items = {"강아지", "고양이", "토끼", "미어캣", "코알라"};
        JList list = new JList(items);
        JComboBox combo = new JComboBox(items);

        add(combo);
        add(list);

        int w = 350, h = 350;
        int[] locations = CenterFrame.getLocation(w, h);
        setBounds(locations[0], locations[1], w, h);
        setVisible(true);
    }

    public static void main(String[] args) {

        new listComboBoxTest();
    }
}
