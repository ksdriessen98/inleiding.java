package ho4;

/**
 * Created by keanu driessen on 8-9-2016.
 */
import java.awt.*;
import java.applet.*;

public class tekenen8PO extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawLine(20, 20, 100, 20);
        g.drawString("Lijn", 45, 35);
        g.drawRect(20, 50, 110, 60);
        g.drawString("Rechthoek", 30, 130);
        g.drawRoundRect(20, 145, 110, 60, 20, 20);
        g.drawString("Afgeronde rechthoek", 20, 220);
        g.setColor(Color.magenta);
        g.fillRect(160, 50, 110, 60);
        g.setColor(Color.black);
        g.drawOval(160, 50, 110, 60);
        g.drawString("Gevulde rechthoek met ovaal", 135, 130);
        g.setColor(Color.magenta);
        g.fillOval(160, 145, 110, 60);
        g.setColor(Color.black);
        g.drawString("Gevulde ovaal", 170, 220);
        g.drawOval(310, 50, 110, 60);
        g.setColor(Color.magenta);
        g.fillArc(310, 50, 110, 60, 0, 45);
        g.setColor(Color.black);
        g.drawString("Taartpunt met ovaal eromheen", 310, 130);
        g.drawArc(310, 145, 60, 60, 0, 360);
        g.drawString("Cirkel", 325, 220);
    }
}