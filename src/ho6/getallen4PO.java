package ho6;

/**
 * Created by keanu driessen on 15-9-2016.
 */
import java.awt.*;
import java.applet.*;



public class getallen4PO extends Applet {
    int uitkomst1;
    double a, b, c, d;
    double uitkomst;

    public void init() {
        a = 5.9;
        b = 6.3;
        c = 6.9;
        d = 3;
        uitkomst = (a + b + c) / d * 10;
        uitkomst1 = (int) uitkomst;
    }


    public void paint(Graphics g){
        g.drawString("gemiddelde cijfer cursist : " + uitkomst1, 20, 20);
    }
}