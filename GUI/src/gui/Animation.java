/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

/**
 *
 * @author lenovo
 */

import java.awt.*;
import java.awt.Graphics;
import javax.swing.*;

public class Animation extends JFrame {
    
    public Animation() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setSize(400, 400);
        setLayout(null);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
            @Override
            public void paint( Graphics g ) {
                
                 // Car body
                g.setColor(Color.YELLOW);
                g.fillRect(98, 98, 205, 75);
                
                g.setColor(Color.ORANGE);     
                g.fillRect(100, 100, 200, 70);
                
                
                //g.drawOval(47, 50, 105, 105);
                //setForeground( Color.BLUE );  
                g.setColor( new Color ( 132, 94, 194 ) ); //Fill
                g.fillOval(105, 145, 50, 50);
                
                g.setColor( new Color( 0, 192, 163 ) ); //Border
                g.fillOval( 107, 147, 50, 50);
                
                
              
                g.setColor( new Color ( 132, 94, 194 ) ); //Fill
                g.fillOval(240, 145, 50, 50);
                
                g.setColor( new Color( 0, 192, 163 ) ); //Border
                g.fillOval( 243, 147, 50, 50);
                

    }
            
     public static void main(String[] args) {
        new Animation();
    }

 
}
