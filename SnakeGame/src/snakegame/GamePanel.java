/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package snakegame;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

/**
 *
 * @author lenovo
 */
public final class GamePanel extends JPanel implements ActionListener {
    
    static final int SCREEN_WIDTH = 600;
    static final int SCREEN_HEIGHT = 600;
    static final int UNIT_SIZE = 25;
    static final int GAME_UNITS = (SCREEN_WIDTH * SCREEN_HEIGHT) / UNIT_SIZE;
    static final int DELAY = 700;
    //array for x and y co-ordinates
    final int x[] = new int[GAME_UNITS];
    final int y[] = new int[GAME_UNITS];
    
    int bodyParts = 5;
    int applesEaten = 0;
    
    //position of apple
    int appleX;
    int appleY;
    
    char direction = 'R';
    Boolean running = false;
    Timer timer;
    Random random;
    

    
    GamePanel() {
        random = new Random();
        
        this.setPreferredSize(new Dimension( SCREEN_WIDTH, SCREEN_HEIGHT ));
        this.setBackground(Color.black);
        this.setFocusable(true);
        this.addKeyListener( new MyKeyAdapter() );
        startGame();
    }
    
    public void startGame() {
        newApple();
        running = true;
        timer = new Timer( DELAY,this );
        timer.start();
        
    }
    
    /**
     *
     * @param g
     */
    @Override
    public void paintComponent( Graphics g ) {
        super.paintComponent(g);
        draw(g);
    }
    
    public void draw( Graphics g ) {
    
        for (int i = 0; i < SCREEN_HEIGHT / UNIT_SIZE; i++) {
            g.drawLine(i * UNIT_SIZE, 0, i * UNIT_SIZE, SCREEN_HEIGHT);
            g.drawLine(0, i * UNIT_SIZE , SCREEN_WIDTH , i * UNIT_SIZE);
        }
        
        
        g.setColor(Color.red);
        g.fillOval(appleX, appleY, UNIT_SIZE, UNIT_SIZE);
        
        
        //drawing the snake
        for (int i = 0; i < bodyParts; i++) {
            if( i == 0 ) {
                //head of the snake
                g.setColor(Color.blue);
                g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE);
                
            } else {
                //body of the snake
                g.setColor( new Color( 45, 180, 0 ) );
                g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE);
                
            }
        }
    }
    
    public void newApple() {
        appleX = random.nextInt((int) (SCREEN_WIDTH / UNIT_SIZE ) * UNIT_SIZE );
        appleY = random.nextInt((int) (SCREEN_HEIGHT / UNIT_SIZE ) * UNIT_SIZE );
    }
    
    public void move() {
        for (int i = bodyParts; i > 0; i--) {
            x[i] = x[i - 1];
            y[i] = y[i - 1];
            
            switch(direction) {
                case 'U' -> y[0] = y[0] - UNIT_SIZE;
                case 'D' -> y[0] = y[0] + UNIT_SIZE;
                case 'L' -> x[0] = x[0] - UNIT_SIZE;
                case 'R' -> x[0] = x[0] + UNIT_SIZE;
            }
        }
    }
    
    public void checkApple() {
        
        if( (x[0] == appleX) && y[0] == appleY ) {
            bodyParts++;
            applesEaten++;
            newApple();
        }
        
    }
    
    public void checkCollision() {
        
        //head touching the body
        for (int i = bodyParts; i > 0; i--) {
            if ((x[0] == x[i]) && y[0] == y[i] ) {
                running = false;
            }
        }
        
        //head touching the left border
        if( x[0] < 0 ) {
            running = false;
        }
        
        //head touching the right border
        if( x[0] >= SCREEN_WIDTH ) {
            running = false;
        }
        
        //head touching the top border
        if( y[0] < 0 ) {
            running = false;
        }
        
        //head touching the bottom border
        if( y[0] >= SCREEN_HEIGHT ) {
            running = false;
        }
        
        if ( !running ) {
            timer.stop();
        }
        
        
        
    }
    
    public void gameOver( Graphics g ) {
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (running) {
            move();
            checkApple();
            checkCollision();
        }
        
        repaint();
        
    }
    
    //inter-class with one method
    public class MyKeyAdapter extends KeyAdapter {
        @Override
        public void keyPressed( KeyEvent e ) {
            switch(e.getKeyCode()) {
                case KeyEvent.VK_LEFT -> { 
                    if( direction != 'R' ) {
                        direction = 'L';
                    }
                }
                    
                case KeyEvent.VK_RIGHT -> {
                    if(direction != 'L') {
                        direction = 'R';
                    }
                }
                  case KeyEvent.VK_UP -> {
                      if(direction != 'D') {
                          direction = 'U';
                      }
                }
                   case KeyEvent.VK_DOWN -> {
                       if(direction != 'U') {
                           direction = 'D';
                       }
                }
            }
        }
    }
   
}
