
package date;

import java.util.Scanner;
public class threeCalculator {
  int a;
  int b;
  int c;

    public threeCalculator( int x, int y, int z) {
            //Scanner sc = new Scanner(System.in);
            a = x;
            b = y;
            c = z;
    }
    
        public threeCalculator () {
            
        }
    
    public void add() {
        
        System.out.println(a + b + c);
    }
    
    //method whit paramenters
    public void add(int x , int y, int z) {
            System.out.println("sum = " + (x + y + z));
    }
    
    public static void main(String[] args) {
        
        //initiallizinf the parameteres
        threeCalculator w = new threeCalculator(10, 20, 10);
        threeCalculator n = new threeCalculator();
        
        w.add();
        n.add();
        w.add(10,10,10);
        n.add(1,20,10);
        
    }
}
