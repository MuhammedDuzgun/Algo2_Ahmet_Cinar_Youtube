package Bolum_12_Applet_Uygulamalari;

import java.applet.Applet;
import java.awt.*;

public class Demo1 extends Applet {

    /*
    * Yasam dongusu : init -> start -> paint -> stop -> destroy
    *
    * drawLine, drawOval, fillOval, drawRect, fillRect  : (int) -> x, y, w, h (w: width, h: height);
    * drawPolyLine : int[] xPoints, int[] yPoints, int length
    *
    * paint() metodu mutlaka override edilmelidir.
    *
    * */

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        g.drawLine(100, 100, 20,145);


    }
}





