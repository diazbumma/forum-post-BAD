package com.diazbumma.drawshape;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class DrawWindow extends Frame {

    public DrawWindow(String title) {
        super(title);
        setSize(500, 500);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Polygon polygon = new Polygon();

        polygon.addPoint(130, 135);
        polygon.addPoint(175, 120);
        polygon.addPoint(213, 158);
        polygon.addPoint(178, 198);
        polygon.addPoint(130, 180);

        g.drawPolygon(polygon);
    }
}
