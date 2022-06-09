

import java.awt.event.KeyAdapter;
//this will be where keys will be read

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyChecker extends KeyAdapter {
    
    MyPanel panel = new MyPanel();
    
    
    public KeyChecker( MyPanel panel ) {
        this.panel = panel;
    }
    
    @Override
    public void keyPressed( KeyEvent e ) {
        panel.keyPressed(e);
    }
    
    @Override
    public void keyReleased( KeyEvent e ) {
        panel.keyReleased(e);
    }
    
}
