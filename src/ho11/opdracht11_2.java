package ho11;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by keanu driessen on 10-11-2016.
 */
public class opdracht11_2 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int getallen;
        int y = 0;

        for(getallen = 20; getallen > 9; getallen -= 1) {
            y += 20;
            g.drawString("" + getallen, y, 50 );
        }
    }
}
