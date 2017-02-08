package ho11;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by keanu driessen on 8-2-2017.
 */
public class opdracht11_1 extends Applet{

public void paint(Graphics g) {
    int teller;
    int y = 20;

    for (teller = 0; teller < 10; teller++) {
        y += 20;
        g.drawLine(y, 20, y, 100);
    }
}
}
