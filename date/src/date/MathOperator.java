/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package date;
import java.util.Scanner;

public class MathOperator {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number: ");
        int first = sc.nextInt();
        
        System.out.println("Enter Second number: ");
        int second = sc.nextInt();
        
    int sum = first + second;
    int sub = first - second;
    int multi = first *  second;
    int division = first / second;
    int mod = first % second;
    
    System.out.println("sum is :" + sum);  
    System.out.println("diff is :" + sub);  
    System.out.println("multiplication is :" + multi);  
    System.out.println("division is :" + division);  
    System.out.println("Reminder is :" + mod);  
    }
    
}
