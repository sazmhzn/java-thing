/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jtableexample;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author lenovo
 */
public class action implements ActionListener{
    JFrame f;
    JButton b;
    JLabel tf;
    
    
    action() {
        f = new JFrame("title");
        f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        b= new JButton("press");
        b.setBounds(100, 150, 100, 100);
        
        b.addActionListener(this);
        
         tf = new JLabel("Not pressed");
        tf.setBounds(100, 300, 100, 20);
        
        f.add(b);
        f.add(tf);
        
        
              
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }
    
    
    public static void main(String[] args) {
        new action();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Action performed");
       int a = JOptionPane.showConfirmDialog(f, "are you sure?");
        
       if(a == JOptionPane.YES_OPTION) {
           f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       }
       
        System.out.println(e.getSource());
            tf.setText(b.getText());
        
    }
   
}
