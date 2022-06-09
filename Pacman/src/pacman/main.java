package pacman;

import javax.swing.JFrame;

public class main extends JFrame {

    public main() {
        init();
    }
    
    private void init() {
        
        add(new Pacman());
        
        setTitle("Pacman");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 500);
    }

    public static void main(String[] args) { 
        var ex = new main();
        ex.setVisible(true);
    }
}