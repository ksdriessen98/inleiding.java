package ho11;


import java.awt.*;
import java.applet.*;

/**
 * Created by keanu driessen on 10-11-2016.
 */
public class opdracht11_5 extends Applet{

    public void paint(Graphics g) {
        int teller = 0;
        int y = 0;

        while(teller < 5) {
            y += 20;
            g.drawRect(y, y, 20, 20);
            teller++;
        }
    }
}