package ai1028;

import center.SetFrame;

import javax.swing.*;
import java.awt.event.MouseListener;

public class LAB_DrawLineFrame extends JFrame {
    LAB_ColorPaper colorPaper;

    LAB_DrawLineFrame(){
        colorPaper = new LAB_ColorPaper();
        add("Center", colorPaper);

        SetFrame.setFrame(this, 500, 500, "마우스로 선그리기");
    }


    public static void main(String[] args) {
        new LAB_DrawLineFrame();
    }
}
