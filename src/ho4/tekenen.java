package ho4;

/**
 * Created by keanu driessen on 8-9-2016.
 */
import java.awt.*;
import java.applet.*;

public class tekenen extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawLine(20, 20, 80, 120);
        g.drawLine(140, 20, 80, 120);
        g.drawLine(140, 20, 20, 20);
    }
}