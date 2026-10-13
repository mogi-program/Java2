package ai01013;

import center.CenterFrame;

import javax.swing.*;
import java.awt.*;

public class TestFieldAreaPasswordTest extends JFrame {

    public TestFieldAreaPasswordTest() throws HeadlessException {
        setTitle("문자열 입력 컴포넌트");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // 한 줄 입력
        JTextField field = new JTextField("", 20);
        // 여러 줄 입력
        JTextArea area = new JTextArea("", 5, 20);
        // 비밀번호 입력
        JPasswordField password = new JPasswordField("", 20);

        add(field);
        add(area);
        add(password);

        int w = 350, h = 350;
        int[] locations = CenterFrame.getLocation(w, h);
        setBounds(locations[0], locations[1], w, h);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TestFieldAreaPasswordTest();
    }
}
