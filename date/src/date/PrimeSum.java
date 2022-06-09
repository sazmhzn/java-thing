/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package date;

/**
 *
 * @author lenovo
 */
public class PrimeSum {
    int i;

   public static void main(String[] args) {
       int count;
       int sum = 0;
       for (int i = 1; i < 100; i++) {           
           count = 0;           
           for (int j = 2; j <= i / 2; j++) {
               
               if( i % j == 0 ) {
                   count++;
                   break;
               }
           }
           
           if( count == 0 && i != 1) {
               System.out.println("Prime: " + i);
               sum += i;
           }
           
           
       }System.out.println(sum);
    }
}
