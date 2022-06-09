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
public class oddEven {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        
        Scanner sc = new Scanner(System.in);
        char num = sc.next().charAt(2);
        System.out.println(num);
        
        if( num % 2 == 0 ) {
            System.out.println("it is even number");
        }
    }
}
