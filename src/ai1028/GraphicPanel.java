package ai1028;

import javax.swing.*;
import java.awt.*;

public class GraphicPanel extends JPanel {
    public GraphicPanel(){
        setBackground(Color.white);
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.GREEN);
        g.drawLine(50, 30, 250, 30);
        g.setColor(Color.ORANGE);
        g.fillRect(30, 50, 200, 250);
        g.drawRect(250, 50, 200, 200);
        g.setColor(Color.MAGENTA);
        g.drawOval(30, 50, 200, 250);
        g.fillOval(250, 50, 200, 200);
        g.setColor(Color.BLUE);
        int[] xPoints = {350, 250, 450};
        int[] yPoints = {50, 150, 150};
        g.fillPolygon(xPoints , yPoints , 3);
        g.setColor(Color.RED);
        xPoints = new int[]{350, 250, 450};
        yPoints = new int[]{250, 150, 150};
        g.fillPolygon(xPoints , yPoints , 3);

    }
}
