/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package date;

/**
 *
 * @author lenovo
 */
public class SumOfNumber {
    
    public SumOfNumber() {
        
    }
   
     public int Sum( int a ) {
         int rem;
         int sumation = 0;
        while( a != 0 ) {
            rem = a % 10;
            sumation += rem;
            a /= 10;
        }
        
        return sumation;   
    }
    
    public static void main(String[] args) {
        
        SumOfNumber x = new SumOfNumber();
        
        System.out.println(x.Sum(55));
  
    }
}
