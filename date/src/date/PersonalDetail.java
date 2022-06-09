
package date;

import java.util.Scanner;
public class PersonalDetail {
    public static void main(String[] args) {
        System.out.println("Enter your name: ");
        Scanner sc  = new Scanner(System.in);
        String name = sc.nextLine();
        
        int r = (int) (Math.random() * 5) + 1;
        
        //System.out.println(r);
        
        System.out.println("Gess a number: ");
        int guess = sc.nextInt();
        
        if(guess == r) {
            System.out.println("You win!");
        } else {
            System.out.println("Try again!");
        }
        
    }
}
