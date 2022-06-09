/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package date;

/**
 *
 * @author lenovo
 */
//fri taking inputs.
import java.util.Scanner;
public class Switch {
    
    public Switch() {
        int a;
        int b;
        
    }
    
    void caseResult(int n, int a, int b) {
                switch(n) {
            case 1:
                System.out.println(a + b);
                break;
            case 2:
                System.out.println(a - b);
                break;
            case 3:
                System.out.println(a / b);
                break;
            case 4:
                System.out.println(a * b);
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
    
    void menu() {
        System.out.println("Menu\n1.add\n2.Sub\n3.Div\n4.Mul");
    }
    
    public static void main(String[] args) {
        Switch s = new Switch();
        Scanner sc = new Scanner(System.in);
        s.menu();
        
        System.out.println("Enter your choice: ");
        int choice = sc.nextInt();
        
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        
        s.caseResult(choice, a, b);
  
    }
    
}
