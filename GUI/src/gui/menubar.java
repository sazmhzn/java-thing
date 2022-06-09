/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author lenovo
 */
public class menubar extends JFrame implements ActionListener{
    
    JMenu menu;
    JMenuBar mb;
    JMenuItem open, exit;
    JLabel l;
    
    public menubar() {
        l = new JLabel("no task");
        l.setBounds(200, 150, 100, 40);
        this.add(l);
        
        
        mb = new JMenuBar();
        
        menu = new JMenu("this");
       
        
        mb.add(menu);
        
        open = new JMenuItem("Open");
        exit = new JMenuItem("Exit");
        
        open.addActionListener(this);
        exit.addActionListener(this);
        
        
        menu.add(open);
        menu.add(exit);
        
        
        
        this.setJMenuBar(mb);
        
        this.setSize( 400, 500 );
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setVisible(true);
    }
    
    
    public static void main(String[] args) {
        new menubar();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();
        l.setText(s + " selected");
    }
}
