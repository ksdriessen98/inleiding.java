package ho12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

/**
 * Created by keanu driessen on 16-11-2016.
 */
public class opdracht12_3 extends Applet{

    TextField[] tekstvak;
    int[] getallen;
    Button knop;

    @Override
    public void init() {

        tekstvak = new TextField[5];
        getallen = new int[5];

        for (int i = 0; i < tekstvak.length; i++) {
            tekstvak[i] = new TextField("", 5);
            add(tekstvak[i]);
        }

        knop = new Button("OK");
        add(knop);
        knop.addActionListener(new Knoplisterner());

    }

    class Knoplisterner implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            for (int i = 0; i < tekstvak.length; i++) {
                String invoer = tekstvak[i].getText();
                getallen[i] = Integer.parseInt(invoer);
            }

            Arrays.sort(getallen);

            for (int i = 0; i < getallen.length; i++) {
                tekstvak[i].setText(String.valueOf(getallen[i]));
            }

        }
    }
}
