package ho14;


import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import java.net.*;

/**
 * Created by keanu driessen on 1-2-2017.
 */
public class opdracht14_PO extends Applet
{

    Button start, next;
    TextField nummer;
    int getal, spel = 23;
    boolean geklikt, gewonnen, verloren, spellean = true, winsmily, testje = true;
    int hulp1, hulp2;
    Image verlorenfoto, gewonnenfoto, winkyfoto;
    URL pad;

    @Override
    public void init() {
        start = new Button("Reset");
        start.addActionListener(new Start());

        next = new Button("Ok");
        next.addActionListener(new Update());
        nummer = new TextField("", 5);
        nummer.addActionListener(new Update());
        add(start);
        add(nummer);
        add(next);

        pad = opdracht14_PO.class.getResource("/plaatjes/");
        verlorenfoto = getImage(pad, "verloren.jpg");
        gewonnenfoto = getImage(pad, "gewonnen.jpg");
        winkyfoto = getImage(pad, "winky.jpg");
    }

    public class Start implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            spel = 23;
            verloren = false;
            gewonnen = false;
            spellean = true;
            winsmily = false;
            testje = true;
            repaint();
        }
    }

    public class Update implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            updateSpel();
        }
    }

    public void updateSpel() {

        int invoer = 0;
        if (testje) {
            invoer = Integer.valueOf(nummer.getText());
        }   nummer.setText("");

        if (invoer > 0 && invoer < 4 && spel > 0 && spel >= invoer) {

            spel -= invoer;
            hulp2 = invoer;
            hulp1 = 69;

            geklikt = true;
            if (spel != 21 && spel > 20) {
                int hulp = spel - 21;
                spel -= hulp;
                winsmily = true;
            }
            else if (spel != 17 && spel > 16 && spel < 21) {
                int hulp = spel - 17;
                spel -= hulp;
                winsmily = true;
            }
            else if (spel != 13 && spel > 12 && spel < 17) {
                int hulp = spel - 13;
                spel -= hulp;
                winsmily = true;
            }
            else if (spel != 9 && spel > 8 && spel < 13) {
                int hulp = spel - 9;
                spel -= hulp;
            }
            else if (spel != 5 && spel > 4 && spel < 9) {
                int hulp = spel - 5;
                spel -= hulp;
                winsmily = true;
            }
            else if (spel != 1 && spel > 0 && spel < 5) {
                int hulp = spel - 1;
                spel -= hulp;
                winsmily = true;
            }
            else {
                int random = new Random().nextInt(3) + 1;
                spel -= random;
                getal = random;
                hulp1 = getal;  hulp2 = 69;
                repaint();
            }

            //win and lose
            if (spel <=hulp2 &&  hulp1 ==69) {
                geklikt = false;
                spellean = false;
                gewonnen = false;
                verloren = true;
                testje = false;
            }
            if (spel <= hulp1 &&  hulp2 ==69) {
                geklikt = false;
                spellean = false;
                gewonnen = true;
                verloren = false;
                testje = false;
            }
        }
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        int x = 50;
        int y = 50;
        if (spellean) {
            if (geklikt) {
                g.drawString("De computer pakt: " + getal + " smilys", x, y);
                y += 25;
            }
            g.drawString("Aantal Smilys: " + spel, x, y);
        }

        int x2 = 50;
        int y2 = 35;

        for (int i = 0; i < spel; i++) {
            if (i % 4 == 0) {
                x2 = 50;
                y2 += 50;
            }
            if (winsmily) {
                g.drawImage(winkyfoto, x2, y2, 40, 40, this);
            }
            else {
                g.drawImage(verlorenfoto, x2, y2, 40, 40, this);
            }
            x2 += 50;
        }

        //win
        if (gewonnen) {
            g.drawString("Je hebt gewonnen!", 50, 50);
            g.drawImage(gewonnenfoto, 50, 60, 300, 200, this);
        }

        //lose
        if (verloren) {
            g.drawString("Je hebt verloren...!", 50, 50);
            g.drawImage(verlorenfoto, 50, 60, 200, 200, this);
        }
    }
}