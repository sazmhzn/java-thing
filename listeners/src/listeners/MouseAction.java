/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listeners;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.lang.model.SourceVersion;

/**
 *
 * @author lenovo
 */
public class MouseAction extends JFrame implements MouseListener {
    
    JLabel label;
    MouseAction() {
        setDefaultCloseOperation(MouseAction.EXIT_ON_CLOSE);
        addMouseListener(this);
        
        label = new JLabel();
        label.setBounds(90, 80, 130, 40);
        label.setFont( new Font("Serif", Font.BOLD , 20) );
        add(label);
        setSize( 250, 250);
        setLayout(null);
        setVisible(true);
        
    }
    
    public static void main(String[] args) {
        new MouseAction();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        label.setText("Clicked");
    }

    @Override
    public void mousePressed(MouseEvent e)  {
        label.setText("Pressed");
    }
    
    @Override
    public void mouseReleased(MouseEvent e) {
        label.setText("Released");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        label.setText("Entered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        label.setText("Exited");
    }
    
}
