package ho12;

import java.awt.*;
import java.applet.*;

/**
 * Created by keanu driessen on 16-11-2016.
 */
public class opdracht12_2 extends Applet{

    Button[] knop;

    @Override
    public void init() {

        knop = new Button[26];
        for (int i = 0; i < knop.length; i++) {
            knop[i] = new Button("" + i);
            add(knop[i]);
        }
    }

}
