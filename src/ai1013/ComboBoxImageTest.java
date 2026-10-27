package ai1013;

import center.CenterFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ComboBoxImageTest extends JFrame {
    String[] items = {"강아지", "고양이", "토끼", "미어캣", "코알라"};
    JComboBox combo = new JComboBox(items);
    ImageIcon icon = new ImageIcon("img/강아지2.jpg");;
    JLabel lbl =  new JLabel();
    public ComboBoxImageTest() throws HeadlessException {
        setTitle("문자열 입력 컴포넌트");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        combo.addItemListener(comboListener);
        add(combo);
        add(lbl);
        lbl.setIcon(icon);

        int w = 350, h = 350;
        int[] locations = CenterFrame.getLocation(w, h);
        setBounds(locations[0], locations[1], w, h);
        setVisible(true);
    }
    ItemListener comboListener = new ItemListener() {
        @Override
        public void itemStateChanged(ItemEvent e) {

            String selectedItem = (String) e.getItem();
            switch (selectedItem){
                case "강아지":
                    icon = new ImageIcon("img/강아지2.jpg");
                    lbl.setIcon(icon);
                    break;
                case "고양이":
                    icon = new ImageIcon("img/고양이.jpg");
                    lbl.setIcon(icon);
                    break;
                case "토끼":
                    icon = new ImageIcon("img/토끼.jpg");
                    lbl.setIcon(icon);
                    break;
                case "미어캣":
                    icon = new ImageIcon("img/미어캣.jpg");
                    lbl.setIcon(icon);
                    break;
                case "코알라":
                    icon = new ImageIcon("img/코알라.jpg");
                    lbl.setIcon(icon);
                    break;

            }
        }
    };

    public static void main(String[] args) {

        new ComboBoxImageTest();
    }
}
