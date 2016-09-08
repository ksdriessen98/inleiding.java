package show2;

/**
 * Created by keanu driessen on 8-9-2016.
 */

import java.awt.*;
import java.applet.*;

public class show extends Applet {

    public void init() {
        setBackground(Color.white);
    }

    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawString("Keanu", 50, 60 );

        g.setColor(Color.red);
        g.drawString("Driessen", 50, 70 );
    }
}