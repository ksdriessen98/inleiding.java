package ho11;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by keanu driessen on 10-11-2016.
 */
public class opdracht11_3 extends Applet{


    public void paint(Graphics g) {
        int getal1 = 0;
        int getal2 = 1;
        int totaal;
        int x = 20;

        g.drawString("1", 20, 50 );

        for (int teller = 0; teller < 10; teller++) {
            x += 20;
            totaal = getal2 + getal1;
            g.drawString("" + totaal, x, 50 );
            getal1 = getal2;
            getal2 = totaal;


        }
    }
}

