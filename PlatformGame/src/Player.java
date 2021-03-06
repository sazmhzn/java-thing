


import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;

/**
 *
 * @author user
 */
public class Player {
    
    MyPanel panel;
    
    int x;
    int y;
    
    int width;
    int height;
    
    double xspeed;
    double yspeed;
    
    //for collision checking
    Rectangle hitBox;
    
    boolean keyRight;
    boolean keyLeft;
    boolean keyUp;
    boolean keyDown;
   
    Player(int x, int y, MyPanel panel) {
        this.panel = panel;
        this.x = x;
        this.y = y;
        
        
        width = 50;
        height = 100;
        
        hitBox = new Rectangle(x, y, width, height);
    }
    
    public void set() {
        
        if( keyLeft && keyRight || !keyRight && !keyLeft ) xspeed *= 0.8;
        else if( keyLeft && !keyRight ) xspeed = xspeed -1; 
        else if ( keyRight && !keyLeft ) xspeed++;
        
        if( xspeed > 0 && xspeed < 0.75 ) xspeed = 0;
        if( xspeed < 0 && xspeed > -0.75 ) xspeed = 0;
        
        if( xspeed > 7 ) xspeed = 7;
        if( xspeed < -7 ) xspeed = -7;
        
        if( keyUp ) {
            
            hitBox.y ++;
            for( Wall wall: panel.walls ) {
                if( wall.hitBox.intersects(hitBox)) yspeed = -6;
            }
            hitBox.y --;
            
            
        }
        
        yspeed += 0.3;
        
        
        //adding gravity and collision
        hitBox.x += xspeed;
        for( Wall wall: panel.walls ) {
            if( hitBox.intersects(wall.hitBox) ) {
                hitBox.x -= xspeed;
                
                while( !wall.hitBox.intersects(hitBox) ) hitBox.x += Math.signum(xspeed);
                hitBox.x -= Math.signum(xspeed);
                xspeed = 0;
                x = hitBox.x;
            }
        }
        
        hitBox.y += yspeed;
        for( Wall wall: panel.walls ) {
            if( hitBox.intersects(wall.hitBox) ) {
                hitBox.y -= yspeed;
                
                while( !wall.hitBox.intersects(hitBox) ) hitBox.y += Math.signum(yspeed);
                hitBox.y -= Math.signum(xspeed);
                yspeed = 0;
                y = hitBox.y;
            }
        }
        
        x += xspeed;
        y += yspeed;
        
        hitBox.x = x;
        hitBox.y = y;
    }
    
    public void draw( Graphics2D g2d ) {
        g2d.setColor(Color.black);
        g2d.fillRect(x, y, width, height);
                
    }
}
