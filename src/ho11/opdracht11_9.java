package ho11;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by keanu driessen on 10-11-2016.
 */
public class opdracht11_9 extends Applet{

    public void paint(Graphics g) {
        g.drawRect(49, 89, 321, 321);
        int x;
        int y = 50;
        for (int row = 0; row < 4; row++) {
            x = 50;
            y += 40;
            for (int kolom = 0; kolom < 8; kolom++) {
                if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                    g.setColor(Color.black);
                    g.fillRect(x, y, 40, 40);
                } else {
                    g.setColor(Color.white);
                    g.fillRect(x, y, 40, 40);
                } x += 40;
            }
            x = 50;
            y += 40;
            for (int kolom = 0; kolom < 8; kolom++) {
                if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                    g.setColor(Color.white);
                    g.fillRect(x, y, 40, 40);
                } else {
                    g.setColor(Color.black);
                    g.fillRect(x, y, 40, 40);
                } x += 40;
            }
        }
    }
}

