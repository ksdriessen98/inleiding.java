package ho6;

/**
 * Created by keanu driessen on 15-9-2016.
 */
import java.awt.*;
import java.applet.*;


public class getallen2 extends Applet {
    int a;
    int b;
    int c;
    int uitkomst1;
    int uitkomst2;
    int uitkomst3;

    public void init() {
        a = 60;
        b = 24;
        c = 365;
        uitkomst1 = a * a;
        uitkomst2 = uitkomst1 * b;
        uitkomst3 = uitkomst2 * c;
    }


    public void paint(Graphics g){
        g.drawString("aantal secondens in een uur : " + uitkomst1, 20, 20);
        g.drawString("aantal secondens in een dag : " + uitkomst2, 20, 35);
        g.drawString("aantal secondens in een jaar : " + uitkomst3, 20, 50);
    }
}
