/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package date;

/**
 *
 * @author lenovo
 */

import java.util.Scanner;
public class AreaOfCircle {
    
    public static void main(String[] args) {
        final float pi = 3.14f;
        System.out.println("Enter radius of the circle: ");
        
        Scanner sc = new Scanner(System.in);
        float r = sc.nextFloat();    
        float area = pi * r * r;
        
        System.out.println(area);
  
    }
}
