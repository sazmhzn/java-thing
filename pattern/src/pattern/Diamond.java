/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pattern;

import java.util.Scanner;


public class Diamond {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        
        for (int i = 1; i < n; i++) {
            
            //this will print the starting space 
            for (int j = i; j  < n; j++) {
                System.out.print(" ");
            }
            
            //this will print the numbers
            for (int j = 1; j < (i * 2); j++) {
                System.out.print( j );
            }
            System.out.println(" ");
        } //the top part of the diamond ends heref   
        
        //this willbe the bottom part of the dismmond
        for (int i = 4; i >= 1; i--) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            
            for (int j = 1; j < ( i * 2 ); j++) {
                System.out.print( j );
            }
            
            System.out.println(" ");
        }
    }
}
