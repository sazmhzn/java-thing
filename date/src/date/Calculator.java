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
public class Calculator {
    public Calculator() {
        
    }
    
    public int Sum(int x, int y) {
        return (x+y);
    }
    
    public int Diff(int x, int y) {
        return (x-y);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator c = new Calculator();
        
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
    
        System.out.println(c.Sum(a, b));
        System.out.println(c.Diff(a, b));
    }
}
