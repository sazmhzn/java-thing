/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author lenovo
 */


import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class PlatformGameTutorial {



    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 700);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation((int) (screenSize.getWidth()/2 - frame.getWidth()/2),(int)(screenSize.getHeight()/2 - frame.getHeight()/2) );
        
        frame.setResizable(false);
        frame.setTitle("Platform game");
        frame.setVisible(true);
    }

}
