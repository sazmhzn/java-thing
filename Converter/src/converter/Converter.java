/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package converter;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


/**
 *
 * @author lenovo
 */
public class Converter extends JFrame implements ActionListener{
    
    JMenuBar mb;
    JMenu Convert;
    JMenuItem Gram, Kilogram, Exit;
    JTextField text;
    JButton button;
    JLabel title ,label, result;
    
    
    String kg2g = "Converting KG to GR";
    String g2kg = "Converting GR to KG";
    float gram, kilogram;
    
    public Converter() {
        mb = new JMenuBar();
        Convert = new JMenu("Convert");
        Kilogram = new JMenuItem("Kilogram");
        Gram = new JMenuItem("Gram");
        Exit = new JMenuItem("Exit");
        
        Kilogram.addActionListener(this);
        Gram.addActionListener(this);
        
       
        Exit.addActionListener( (ActionEvent e) -> {
            System.exit(0);
        });
        
        Convert.add(Kilogram);
        Convert.add(Gram);
        Convert.add(Exit);
        mb.add(Convert);
        this.add(mb);
        

        title = new JLabel("");
        title.setText(kg2g);
        title.setFont(new Font("Arial", Font.BOLD, 14));
        title.setBounds(100, 50, 200, 50);
        this.add(title);
        
        text = new JTextField(  );
        text.setBounds(20, 120, 350, 30);
        this.add(text);
        
        result = new JLabel("Result:-");
        result.setBounds(20, 150, 100, 30);
        this.add(result);
        
        button = new JButton("Convert");
        button.setBounds(20, 200, 100, 50);
        button.addActionListener(this);
        this.add(button);
        
        this.setSize(400, 400);
        this.setJMenuBar(mb);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setVisible(true);
    }
    
    public void convertToGram(int kg) {
        
        gram = kg * 1000;
        
        result.setText("" + gram + " g");
    }
    
        public void convertToKilogram(int g) {
        
       kilogram = g / 1000;
        
        result.setText("" + kilogram + " kg");
    }

    
    public static void main(String[] args) {
        new Converter();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if( e.getSource() == Gram ) {
            title.setText(g2kg);
            
        }
        
        if( e.getSource() == Kilogram ) {
             title.setText(kg2g);
        }
        
        if ( e.getSource() == Exit) System.exit(0);
        
        if ( e.getSource() == button ) {
            String s = text.getText();
            
            if ( title.getText() == kg2g ) convertToGram(Integer.parseInt(s));

            if ( title.getText() == g2kg ) convertToKilogram(Integer.parseInt(s));
        }
    }
    
}
