/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package date;

/**
 *
 * @author lenovo
 */
public class PrimeConstructor {
    public int a;
    
    public PrimeConstructor() {
        a = 30;
    }
    
    public int isPrime() {
        int check=1;
        for(int i = 2; i <= a / 2; i++){
            if( a % i == 0 ){
                check = 0;
                break;
            }
        }
        return check;     
    }
    
    public static void main(String[] args) {
        //int a = 30;
        PrimeConstructor p = new PrimeConstructor();
        if(p.isPrime() == 1) {
            System.out.println("Prime");
        } else {
            System.out.println("Not prime");
        }
    }
}
