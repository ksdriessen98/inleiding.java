package ho11;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by keanu driessen on 10-11-2016.
 */
public class opdracht11_6 extends Applet {

    public void paint(Graphics g) {
        int teller = 0;
        int y = 20;
        int x = 60;

        while(teller < 5) {
            y += 5;
            x -= 10;
            g.drawOval(y, y, x, x);
            teller++;
        }
    }
}
