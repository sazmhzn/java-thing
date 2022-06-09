
package date;


import java.util.Scanner;

public class HelloMyName {
    public static void main(String[] args) {
        System.out.println("write your charachter: ");
        Scanner sc = new Scanner(System.in);
        char name = sc.next().charAt(0);
        System.out.println("The character you hev typed is: " + name);
    }
}
