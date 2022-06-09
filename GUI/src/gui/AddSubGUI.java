/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.*;

public class AddSubGUI {
   static int i = 1;
   
   public AddSubGUI() {
       
   }
   
   public Boolean isEven(int n) {
       return (n % 2 == 0);
   }
   
    public static void main(String[] args) {
        
        AddSubGUI a = new AddSubGUI();
        
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //creating a text area
        JTextField inputArea = new JTextField();
         inputArea.setBounds(10, 10, 200, 40);
         frame.add(inputArea);
         
         
         
         JTextField secondInput = new JTextField();
         secondInput.setBounds(10, 50, 200, 40);
         frame.add(secondInput);
         
         
         JTextField result = new JTextField();
         result.setBounds(10, 100, 200, 40);
         frame.add(result);
         
        JButton addButton = new JButton("Add");
        addButton.setBounds(10, 150, 100, 40);
        frame.add(addButton);
   
             
            addButton.addActionListener((ActionEvent e) -> {
                
                int first = Integer.parseInt( inputArea.getText() );
                int second = Integer.parseInt(secondInput.getText());
         
               
                    i += 1;
                    if( a.isEven( i  ) ) {
                         var sum = first + second;
                        result.setText(sum + "");
                        addButton.setText("Subtract");
                    } else {
                        int diff = first - second;
                        result.setText("" + diff);
                        addButton.setText("Add");
                    }
        });
       
        
       
        frame.setTitle("Calculator 2");
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        
    }
}
