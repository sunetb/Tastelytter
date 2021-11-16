package com.company;

import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Tastelytter {

    private int værdi = '0';

    Tastelytter(){
    Frame f = new Frame();
    TextField t= new TextField();
    t.addKeyListener(new KeyListener() {
        @Override
        public void keyTyped(KeyEvent keyEvent) {}
        @Override
        public void keyPressed(KeyEvent keyEvent) {
            værdi = keyEvent.getKeyCode();
            if(værdi== 38) op();
            else if (værdi == 39) højre();
            else if (værdi == 40) ned();
            else if (værdi == 37) venstre();
            else if (værdi == 32) mellemrum();
            else andenTast(værdi);
        }
        @Override
        public void keyReleased(KeyEvent keyEvent) {}
    });
    t.addFocusListener(new FocusListener() {
        @Override
        public void focusGained(FocusEvent focusEvent) {
            t.setText("Jeg lytter. Tryk på nogle taster");
            t.setBackground(Color.GREEN);
        }
        @Override
        public void focusLost(FocusEvent focusEvent) {
            t.setText("Lytter ikke. Klik på mig");
            t.setBackground(Color.RED);
        }
    });
    t.setEditable(false);
    t.setText("  Jeg lytter når jeg er i fokus");
    f.add(t);
    f.setSize(200,100);
    f.setAlwaysOnTop(true);
    //f.setUndecorated(true);
    //f.setOpacity(0.1f);
    f.setVisible(true);
    }

    void op (){}
    void ned(){}
    void venstre(){}
    void højre(){}
    void mellemrum(){}
    void andenTast (int x){}

    public int getVærdi(){
        return værdi;
    }
}
