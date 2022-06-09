/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gridlayout;

import java.awt.GridLayout;
import java.awt.LayoutManager;
import javax.swing.*;

/**
 *
 * @author lenovo
 */
public class MyGridLayout extends JFrame{
    
    JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10;

    
    public MyGridLayout() {
        

        this.setLayout(new GridLayout(4,4));
        
        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");
        btn4 = new JButton("4");
        btn5 = new JButton("5");
        btn6 = new JButton("6");
        btn7 = new JButton("7");
        btn8 = new JButton("8");
        btn9 = new JButton("9");
        btn10 = new JButton("10");
        
        this.add(btn1);
        this.add(btn2);
        this.add(btn3);
        this.add(btn4);
        this.add(btn5);
        this.add(btn6);
        this.add(btn7);
        this.add(btn8);
        this.add(btn9);
        this.add(btn10);

        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 500);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    
    
    public static void main(String[] args) {
       new MyGridLayout();
    }

}
