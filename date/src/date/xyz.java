/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package date;

/**
 *
 * @author lenovo
 */
public class xyz {
    int i;
    public xyz() {
        i = 10;
    }
    
    public xyz(int a) {
        i = a;
    }
    
    public int fact(int n) {
        if (n <= 1) {
            return  1;
        } else {
            return n * fact(n - 1);
        }
    }
    
    public static void main(String[] args) {
        xyz x = new xyz();
        xyz y = new xyz(20);
        x.display();
        y.display();
        System.out.println(x.fact(5));
        //System.out.println(x.i);
    }
    
    public void display() {
        System.out.println(i);
    }
    
}
