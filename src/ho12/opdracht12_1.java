package ho12;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by keanu driessen on 16-11-2016.
 */
public class opdracht12_1 extends Applet {

    double salaris[], totaalsalaris, gemiddelde;


    public void init() {
        salaris = new double [10];

        for (int teller = 0; teller < salaris.length; teller ++) {
            salaris[teller] = 50 * teller + 50;
            totaalsalaris += salaris[teller];
        }
    }

    public void paint(Graphics g) {
        gemiddelde = totaalsalaris / salaris.length;
        g.drawString("Gemiddelde = " + gemiddelde, 50, 30);

    }
}
