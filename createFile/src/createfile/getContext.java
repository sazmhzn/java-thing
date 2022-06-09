/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package createfile;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author lenovo
 */
public class getContext {
   
    
    public getContext() {
         
    }
    
    public static void main(String[] args) {
        getContext g = new getContext();
        
        JFrame frame = new JFrame( " get the fiel context ");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel input = new JLabel("File Location");
        input.setBounds(10, 10, 170, 30);
        frame.add(input);
        
        JTextField fileName = new JTextField();
        fileName.setBounds(100, 10, 300, 30);
        frame.add(fileName);
        
        JLabel content = new JLabel("Information");
        content.setBounds(10, 50, 170, 30);
        frame.add(content);
        
        JTextArea text = new JTextArea();
        text.setBounds(100, 50, 300, 100);
        frame.add(text);
        
        JButton get = new JButton("Get");
        get.setBounds(10, 190, 150, 50);
        frame.add(get);
        
        JTextField addText = new JTextField();
        
        //geting a
        get.addActionListener( (ActionEvent e) -> { 
         String fileLocaiton =  fileName.getText();
                     
          text.setText(g.openFile(fileLocaiton));
           
        });

        frame.setSize(700, 500);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setVisible(true);
  
    }
    
    public String openFile( String fl ) {
        try {
            File myObj = new File( fl );
            Scanner sc = new Scanner( myObj );
            
            //checking if there is next line if string
            if( sc.hasNextLine() ) {
                return sc.nextLine();
            }
            //catch the error in the file handeling
        } catch( IOException e ) {
            System.out.println("An error has occured.");
            e.printStackTrace();
            
            return null;
        }
        return null;
    }
}
