package ho11;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by keanu driessen on 10-11-2016.
 */
public class opdracht11_1 extends Applet {

    public void paint(Graphics g) {
        int lijnen;
        int y = 0;

        for(lijnen = 1; lijnen <= 10; lijnen++) {
            y += 20;
            g.drawLine(y , 50, y, 250 );
        }
    }
}