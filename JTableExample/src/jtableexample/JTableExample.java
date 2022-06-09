/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jtableexample;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author lenovo
 */
public class JTableExample {
    
    JFrame f;
    
    
    public JTableExample() {
        f = new JFrame();
        
       
        
        String data[][]={ {"101","Amit","670000"},    
                          {"102","Jai","780000"},    
                          {"101","Sachin","700000"}};    
    String column[]={"ID","NAME","SALARY"};        
        //initializing a table
       JTable t = new JTable(data, column);
        t.setBounds(30, 40, 300, 400);
        
        JScrollPane sp = new JScrollPane(t);
        f.add(sp);
        f.setSize(400, 500);
        f.setVisible(true);
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        new JTableExample();
    }
    
}
