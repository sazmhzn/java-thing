
import java.awt.Color;
public class MyFrame extends javax.swing.JFrame {
    
    public MyFrame() {
       MyPanel panel = new MyPanel(); 
       
       panel.setLocation(0, 0);
       
       //set the size of the frame
       panel.setSize(this.getSize());
       panel.setBackground(Color.LIGHT_GRAY);
        this.add(panel);
       panel.setVisible(true);
       
       addKeyListener(new KeyChecker(panel));
    }
}
