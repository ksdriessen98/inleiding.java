package ho13;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by keanu driessen on 10-1-2017.
 */
public class opdracht13_1 extends Applet {

    Button[] knop = new Button[5];

    @Override
    public void init() {
        super.init();

        knop[0] = new Button("Geel");
        add(knop[0]);
        knop[0].addActionListener(new Knoplisterner());

        knop[1] = new Button("Rood");
        add(knop[1]);
        knop[1].addActionListener(new Knoplisterner1());

        knop[2] = new Button("Groen");
        add(knop[2]);
        knop[2].addActionListener(new Knoplisterner2());

        knop[3] = new Button("Blauw");
        add(knop[3]);
        knop[3].addActionListener(new Knoplisterner3());

        knop[4] = new Button("roze");
        add(knop[4]);
        knop[4].addActionListener(new Knoplisterner4());

    }

    class Knoplisterner implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            setBackground(Color.yellow);
            repaint();
        }
    }

    class Knoplisterner1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            setBackground(Color.red);
            repaint();
        }
    }

    class Knoplisterner2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            setBackground(Color.green);
            repaint();
        }
    }

    class Knoplisterner3 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            setBackground(Color.blue);
            repaint();
        }
    }

    class Knoplisterner4 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            setBackground(Color.pink);
            repaint();
        }
    }
}