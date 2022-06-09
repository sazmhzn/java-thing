/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package date;

/**
 *
 * @author lenovo
 */
public class Animal {
    public String sound;
    int numLegs = 4;
    
    public void Animal() {
        
    }
    
    public void numberOfEyes() {
        System.out.println("Two");
    }
    
    public void numberOfLegs() {
        System.out.println(numLegs);
    }
    
    public void numberOfLegs(int n) {
        numLegs = n;
        System.out.println(numLegs);
    }
    
    public void speak( String snd ) {
        sound = snd;
        System.out.println(  sound + sound);
    }
}
