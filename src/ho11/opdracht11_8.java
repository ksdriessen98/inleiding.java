package ho11;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by keanu driessen on 10-11-2016.
 */
public class opdracht11_8 extends Applet {

    public void paint(Graphics g) {
        int teller = 0;
        int y = 20;

        while(teller < 100) {
            y += 5;
            g.drawOval(20, 20, y, y);
            teller++;
        }
    }
}
