package center;

import java.awt.*;

public class CenterFrame2 {
    public static Point getLocation(int w, int h) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSizeDim = toolkit.getScreenSize();
        int sw = screenSizeDim.width;
        int sh = screenSizeDim.height;

        int x = (sw - w) / 2;
        int y = (sh - h) / 2;
//        int[] location = {x,y};
//        Dimension locationDim = new Dimension(x,y)
        Point location = new Point(x, y);
        return location;
    }
}
