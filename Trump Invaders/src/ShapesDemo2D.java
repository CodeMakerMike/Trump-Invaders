/**
 * Created by mhall17162 on 5/12/2017.
 */

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import javax.swing.*;

/*
 * This is like the FontDemo applet in volume 1, except that it
 * uses the Java 2D APIs to define and render the graphics and text.
 */

public class ShapesDemo2D extends JApplet {
    final static int maxCharHeight = 15;
    final static int minFontSize = 6;

    final static Color bg = Color.red;
    final static Color fg = Color.black;
    final static Color red = Color.red;
    final static Color white = Color.white;

    Dimension totalSize;

    public void init() {
        //Initialize drawing colors
        setBackground(bg);
        setForeground(fg);
    }

    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        Dimension d = getSize();
        int gridWidth = d.width / 6;
        int gridHeight = d.height / 2;

        int x = 5;
        int y = 7;
        int rectWidth = gridWidth - 2 * x;


        // draw Rectangle2D.Double
        g2.draw(new Rectangle2D.Double(x, y, rectWidth, 300));
        x += gridWidth;
    }


    public static void main(String s[]) {
        JFrame f = new JFrame("ShapesDemo2D");
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {System.exit(0);}
        });
        JApplet applet = new ShapesDemo2D();
        f.getContentPane().add("Center", applet);
        applet.init();
        f.pack();
        f.setSize(new Dimension(1200,900));
        f.setVisible(true);
    }

}