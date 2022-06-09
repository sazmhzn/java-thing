/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listeners;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;


/**
 *
 * @author lenovo
 */
public class KeyListeners extends JFrame implements KeyListener {

    JLabel label;
    JTextField text;
    
       KeyListeners () {
           
           label = new JLabel();
           label.setBounds(20, 20, 100, 20);
           
           text = new JTextField();
           text.setBounds(20, 50, 200, 20);
           text.addKeyListener(this);
           
           setDefaultCloseOperation(this.EXIT_ON_CLOSE);
           add(label);
           add(text);
           setSize(250 ,150);
           setLayout(null);
           setVisible(true);
       }
    public static void main(String[] args) {
        // TODO code application logic here
        new KeyListeners();
        
    }

    @Override
    public void keyTyped(KeyEvent e) {
        label.setText("Key typed");
    }

    @Override
    public void keyPressed(KeyEvent e) {
      label.setText("Key pressed");
    }

    @Override
    public void keyReleased(KeyEvent e) {
      label.setText("Key released");
    }
    
}
