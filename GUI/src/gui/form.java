/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.*;
import java.util.regex.Pattern;

/**
 *
 * @author lenovo
 */
public class form {
    public static String personName;
    public static int count = 0;
    
    public form() {
        
    }
    
    public Boolean isName( String name ) {
        String regex = "[A-Za-z]+";
        Pattern pat = Pattern.compile( regex);
        
        return pat.matcher(name).matches();
    }
    
    public Boolean isEmail( String em ) {
        String emailRegex = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@" 
        + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
                              
        Pattern pat = Pattern.compile(emailRegex);
        if ( em == null )
            return false;
        return pat.matcher( em ).matches();
        
       

    }
    
    public Boolean isNumValid( String num ) {  
        
        String regex = "\\d+";
        Pattern pat = Pattern.compile( regex );
        if(num.equals("") ) return false;
        
        return pat.matcher(num).matches() && num.length() == 10;
 
    }
    
    public static void main(String[] args) {
        form f = new form();
 
        JFrame frame = new JFrame();
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel nameLl = new JLabel("Name");
        nameLl.setBounds(10, 10, 80, 30);
        frame.add(nameLl);
        
        //text field created
        JTextField name = new JTextField();
        name.setBounds(90, 10, 120, 30);
        frame.add(name);
        
        JLabel invalidName = new JLabel("");
        invalidName.setBounds(240, 10, 50, 30);
        frame.add(invalidName);
        
        //first line is finished
        
        JLabel addressLl = new JLabel("Address");
        addressLl.setBounds(10, 50, 80, 30);
        frame.add(addressLl);
        
        JTextField address = new JTextField();
        address.setBounds(90, 50, 120, 30);
        frame.add(address);
        
        
        JLabel invalidAddress = new JLabel("");
        invalidAddress.setBounds(240, 50, 50, 30);
        frame.add(invalidAddress);
        
        //second also created
        
        JLabel contactLl = new JLabel("Contact no.");
        contactLl.setBounds(10, 90, 80, 30);
        frame.add(contactLl);
        
        JTextField contact = new JTextField();
        contact.setBounds(90, 90, 120, 30);
        frame.add(contact);
        
        JLabel invalidContact = new JLabel("");
        invalidContact.setBounds(240, 90, 50, 30);
        frame.add(invalidContact);
        
        //third section created
        
        JLabel emailLl = new JLabel("Email");
        emailLl.setBounds(10, 130, 80, 30);
        frame.add(emailLl);
        
        JTextField email = new JTextField();
        email.setBounds(90, 130, 120, 30);
        frame.add(email);
        
        JLabel invalidEmail = new JLabel();
        invalidEmail.setBounds(240, 130, 50, 30);
        frame.add(invalidEmail);
        
        //third section a lso created
        
        JButton sign = new JButton("Sign");
        sign.setBounds(10, 180, 80, 30);
        frame.add(sign);
        
        //creating a action listener for a button
        sign.addActionListener((ActionEvent e) -> {
            
            if( f.isName( name.getText() ) ) {
                invalidName.setText("Valid");
            } else {
                invalidName.setText("* invalid");
            }
            
            if( f.isNumValid( contact.getText() ) ) {
                invalidContact.setText("Valid");
            } else {
                invalidContact.setText("* invalid");
            }
            
            if( f.isEmail(email.getText()) ) {
                invalidEmail.setText("Valid");
            } else {
                invalidEmail.setText("* invalid");
            }

        });
        
        
        
     frame.setSize(400 ,400);
     frame.setLayout(null);
     frame.setVisible(true);
    }
}
