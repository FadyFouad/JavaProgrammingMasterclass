package com.etatech;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyWindow extends Frame {
    @Override
    public void paint(Graphics g) {
        super.paint(g);

        Font font = new Font("SantSerif",Font.BOLD,16);

        g.setFont(font);
        g.drawString("Hello Java",200,100);
    }

    public MyWindow(String title) throws HeadlessException {
        super(title);
        setSize(500,200);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });



    }
}
