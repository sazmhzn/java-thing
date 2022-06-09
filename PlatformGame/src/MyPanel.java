
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.lang.Math;
import java.util.Timer;
import java.util.TimerTask;
/**
 *
 * @author user
 */
public class MyPanel extends javax.swing.JPanel implements ActionListener {

    Player player;
    int rand;
    ArrayList<Wall> walls = new ArrayList<Wall>();
    
    Timer timer;

    MyPanel() {
        
        //sending this panel
        player = new Player( 400, 300 , this);
        makeWalls();
        timer = new Timer();
        timer.schedule( new TimerTask() {

            @Override
            public void run() {
                player.set();
                repaint();
            }
            //17miliseconds appox. 60 fps
        }, 0, 17);
    }
    
    
    @Override
    public void paint( Graphics g ) {
        super.paint(g);
        
        Graphics2D g2d = (Graphics2D) g;
        
        player.draw(g2d);
        
        for ( Wall wall: walls ) wall.draw(g2d);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }

    void keyPressed(KeyEvent e) {
        if( e.getKeyChar() == 'a' ) player.keyLeft = true;
        if( e.getKeyChar() == 's' ) player.keyDown = true;
        if( e.getKeyChar() == 'd' ) player.keyRight = true;
        if( e.getKeyChar() == 'w' ) player.keyUp = true;
    }

    void keyReleased(KeyEvent e) {
        if( e.getKeyChar() == 'a' ) player.keyLeft = false;
        if( e.getKeyChar() == 's' ) player.keyDown = false;
        if( e.getKeyChar() == 'd' ) player.keyRight = false;
        if( e.getKeyChar() == 'w' ) player.keyUp = false;
    }

    private void makeWalls() {
        for (int i = 50; i < 650; i+= 10) {
            walls.add( new Wall( i, 600, 10, 10 ) );
        }
        
        for (int i = 10; i < 650; i+= 10) {
            rand =  (int)(Math.random() * 600) + 1;
            walls.add(new Wall(i, 100, 10, 10) );
            walls.add(new Wall(rand, i, 10,10  ));
            
        }
        
        walls.add(new Wall(50, 550, 10, 10));
        walls.add(new Wall(50, 500, 10, 10));
        walls.add(new Wall(150, 550, 10, 10));
        walls.add( new Wall( 300, 400, 10, 10 ) );
        walls.add(new Wall(600, 550, 10, 10));
        walls.add(new Wall(600, 500, 10, 10));
        walls.add(new Wall(450, 550, 10, 10));
        walls.add( new Wall( 100, 550, 10, 10 ) );
       
    }
    
}
