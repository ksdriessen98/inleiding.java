package ho11;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by keanu driessen on 10-11-2016.
 */
public class opdracht11_4 extends Applet{

    public void paint(Graphics g) {
        int teller = 1;
        int getal = 1;
        int y = 0;

        while(teller < 30) {
            y += 20;
            teller = getal * 3;
            g.drawString("" + teller, y, 50 );
            getal++;
        }
    }
}
