package ai1006;

import center.CenterFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class RadioButtonTest extends JFrame {
    ImageIcon[] imageIcons;
    JLabel lbl;
    int selectedIndex;
    JRadioButton[] radios;

    RadioButtonTest(){
        setTitle("라디오버튼 테스트"); //super("프레임제목")
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panNorth = new JPanel();
        String[] entertaioners = {"아이브", "리센느", "캣츠아이"};
        radios = new JRadioButton[entertaioners.length];
        imageIcons = new ImageIcon[entertaioners.length];
        lbl = new JLabel();

        ButtonGroup group = new ButtonGroup();

        int i = 0;
        for(String entertaioner : entertaioners){
            imageIcons[i] = new ImageIcon("img/images" + i + ".jpg");
            radios[i] =  new JRadioButton(entertaioner);
            group.add(radios[i]);
            radios[i].addItemListener(radioListener);
            panNorth.add(radios[i++]);
        }

        add("North",  panNorth);


        add("Center",lbl);

//        setLayout(new FlowLayout());
        int w = 500, h = 500;
        int[] location = CenterFrame.getLocation(w,h);

        setBounds(location[0],location[1],w,h); // setLocation(x,y) + setSize(w, h)
        setVisible(true);
    }

    public static void main(String[] args) {
        new RadioButtonTest();
    }
    ItemListener radioListener = new ItemListener() {
        @Override
        public void itemStateChanged(ItemEvent e) {
            JRadioButton selectedRadio = (JRadioButton) e.getSource();
            if(selectedRadio == radios[0])
                lbl.setIcon(imageIcons[0]);
            else if (selectedRadio == radios[1])
                lbl.setIcon(imageIcons[1]);
            else if (selectedRadio == radios[2])
                lbl.setIcon(imageIcons[2]);
        }
    };
}
