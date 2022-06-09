
package date;

/**
 *
 * @author lenovo
 */
import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        int[] num = new int[5];
        
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < 5; i++) {
            num[i] = sc.nextInt();
        }
        
        for (int i = 0; i < 5; i++) {
            System.out.println(num[i] + " ");
        }
        
        
    }
}
