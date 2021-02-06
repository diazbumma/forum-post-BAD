package com.diazbumma.gui;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class SomeWindow extends Frame {

    public SomeWindow(String title) {
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

        String[] types = {
                Font.SERIF,
                Font.SANS_SERIF,
                Font.MONOSPACED
        };
        int[] styles = {
                Font.PLAIN,
                Font.ITALIC,
                Font.BOLD,
                Font.ITALIC + Font.BOLD
        };

        for (int i = 0; i < types.length; i++) {
            for (int j = 0; j < styles.length; j++) {
                Font font = new Font(types[i], styles[j], 18);
                g.setFont(font);
                g.drawString("What would you do if you weren't afraid?", 20, (i * 4 + j + 5) * 20);
            }
        }
    }
}
