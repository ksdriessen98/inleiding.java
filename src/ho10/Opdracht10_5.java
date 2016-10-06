package ho10;

import java.applet.Applet;
import java.awt.*;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by keanu driessen on 6-10-2016.
 */
public class Opdracht10_5 extends Applet {

    TextField tekstveld;
    Button knop;

    double invoer;
    double totaal;
    double gemiddelde;

    int aantalCijfers;

    boolean geklikt;


    @Override
    public void init() {
        super.init();
        tekstveld = new TextField("", 5);
        add(tekstveld);

        knop = new Button("OK");
        add(knop);
        KnopListener kl = new KnopListener();
        knop.addActionListener( kl );


    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        int x = 50;
        int y = 80;

        if ( geklikt ) {
            if (invoer < 5.5) {
                g.drawString("Het cijfer is onvoldoende", x, y);
            }
            if (invoer >= 5.5) {
                g.drawString("het cijfer is voldoende", x, y);
            }

            y = y + 20;
            g.drawString("Gemiddelde : " + gemiddelde, x, y);
        }

    }

    class KnopListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String s = tekstveld.getText();
            invoer = Double.parseDouble(s);

            totaal = totaal + invoer;
            aantalCijfers++;

            gemiddelde = totaal / aantalCijfers;

            geklikt = true;

            repaint();
        }
    }
 }
