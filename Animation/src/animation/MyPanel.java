/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animation;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author lenovo
 */
public class MyPanel extends JPanel implements ActionListener {
 
    final int PANEL_WIDTH = 700;
    final int PANEL_HIEGHT = 700;
    Image enemy;
    Image backgroundImage;
    //how many unit is the image moving
    int xVelocity = 2;
    int yVelocity = 1;
    Timer timer;
    //starting position
    int x = PANEL_WIDTH/2;
    int y = PANEL_HIEGHT/2;
   
    MyPanel() {
        
        setPreferredSize(new Dimension( PANEL_WIDTH, PANEL_HIEGHT ));
        setBackground(Color.black);
        
        enemy = new ImageIcon("pac.png").getImage();
        backgroundImage = new ImageIcon("background.jpg").getImage();
        timer = new Timer( 10, this );
        timer.start();
    }
    
    @Override
    public void paint( Graphics g  ) {
        super.paint(g);//paint backgorund
         
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(backgroundImage, 0, 0, null);
        g2d.drawImage(enemy, x, y, null);
   
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if( x >= PANEL_WIDTH - enemy.getWidth(this) || x < 0  ) {
            xVelocity = xVelocity * -1;
        }
        if( y >= PANEL_HIEGHT - enemy.getHeight(this) || y < 0  ) {
            yVelocity = yVelocity * -1;
        }
        
        x = x + xVelocity;
        y = y + yVelocity;
        
        repaint();
    }
    
}
