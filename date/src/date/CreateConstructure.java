/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package date;

/**
 *
 * @author lenovo
 */
public class CreateConstructure {
    int a;
    int b = 0;
    
    public CreateConstructure() {
        a = 10;
    }
    
    public CreateConstructure(int l) {
        a = l;
    }
    
    public CreateConstructure(int d, int c) {
          a = d;
          b = c;
          
    }
    
    void print(int x, int y) {
        System.out.println(a  + b);
    }
    
    void print(int x) {
        System.out.println(a + x);
    }
    
    void print() {
        System.out.println(a);
    }
    
    public static void main(String[] args) {
        CreateConstructure c = new CreateConstructure();
        CreateConstructure c1 = new CreateConstructure(20);
        CreateConstructure c2 = new CreateConstructure(20, 20);
       
        c1.print(30);
        c2.print(0);
      
    }
}
