package show2;

/**
 * Created by keanu driessen on 8-9-2016.
 */

import java.awt.*;
import java.applet.*;

public class show extends Applet {

    public void init() {
        setBackground(Color.blue);
    }

    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.drawString("Welcome to Java!!", 50, 60 );
    }
}