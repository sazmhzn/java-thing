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

public class SwitchCase {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter the number of day: ");
        int day = sc.nextInt();
        
        System.out.println("The day is: ");
        switch( day ) {
            case 1: 
                System.out.println("Sunday");
                break;
            case 2: 
                System.out.println("Monday");
                break;
            case 3: 
                System.out.println("Tuesday");
                break;
            case 4: 
                System.out.println("Wednesday");
                break;
            case 5: 
                System.out.println("Thursday");
                break;
            case 6: 
                System.out.println("Friday");
                break;
            case 7: 
                System.out.println("Saturday");
                break;
            default:
                System.out.println("invalid option given");
        }
            
            
    }
}
