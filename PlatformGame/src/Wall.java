

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;

/**
 *
 * @author user
 */
public class Wall {
    
    int x;
    int y;
    
    int width;
    int height;
    
    Rectangle hitBox;

    public Wall(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        
        hitBox = new Rectangle( x, y, width, height );
    }
    
    public void draw( Graphics2D g2d ) {
        g2d.setColor(Color.black);
        g2d.drawRect(x, y, width, height);
        g2d.setColor(Color.white);
        //to not draw over the border
        g2d.fillRect(x +1, y + 1, width - 2, height - 2);
    }
}

