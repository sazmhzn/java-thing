/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

/**
 *
 * @author lenovo
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.*;

public class Calculator {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JTextField tf = new JTextField();
        JTextField tf1 = new JTextField();
        JTextField result = new JTextField();
        JButton add = new JButton("Add");
        
        tf.setBounds(10, 10, 150, 30);
        tf1.setBounds(10, 50, 150, 30);
        result.setBounds(10, 90, 150, 30);
        
        //button
        add.setBounds(10, 120, 80, 30);
        

         add.addActionListener((ActionEvent e) -> {
            //it will fi/l the text in the the text area
            
            int i = Integer.parseInt( tf.getText() ) ;
            int j = Integer.parseInt(tf1.getText());
            int sum = i + j;
            result.setText(""+sum);
            
            add.setText("Subtract");
        });
        
        frame.add(tf);
        frame.add(tf1);
        frame.add(result);
        frame.add(add);
        
        
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        
    }
}
