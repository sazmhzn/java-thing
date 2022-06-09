/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.*;
import java.util.Scanner;

/**
 *
 * @author lenovo
 */

public class GUI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame f = new JFrame("Button Example");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //To write the text or input area
        JTextField tf = new JTextField();
        
        //for takaing input
        Scanner sc = new Scanner(System.in);
        
        
        //the x, y axis and width , height
        tf.setBounds(50,50, 200, 20);
        
        //creating  abuttin with text
        JButton b = new JButton("Click Here");
        JButton b1 = new JButton("Clear");
        b.setBounds(50, 80, 95, 30);
        b1.setBounds(155, 80, 95, 30);
        
        //the action the button will perfome
        b.addActionListener((ActionEvent e) -> {
            //it will fi/l the text in the the text area
            tf.setText("Welcome to Javapoint.");
        });
        b1.addActionListener( (ActionEvent e) -> {
            tf.setText("");
        });
        f.add(tf);
        f.add(b);
        f.add(b1);
        
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }
    
}
