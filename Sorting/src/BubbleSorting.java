
import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lenovo
 */
public class BubbleSorting {

    public BubbleSorting() {
    }
    
    
    static void BubbleSort( int arr[] ) {
        
    int size = arr.length;
    
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - 1; j++) {
                if( arr[i] < arr[j] ) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        BubbleSorting bs = new BubbleSorting();
        
        int[] data = { -2, 25, 9, 6,10 };
                bs.BubbleSort( data );
                System.out.println("Array in Ascending order: ");
                System.out.println( Arrays.toString(data) );
    }
}
