
import java.util.ArrayList;
import java.util.Iterator;


public class CollectionExample {
    public static void main(String[] args) {
        
        //this is a array List. it is use for dynamix array holding
        
        ArrayList<String> cst;
        cst = new ArrayList<>();
        
        //adding strings to the array
        cst.add("Ram");
        cst.add("Gita");
      
        //iterationg through the array
        Iterator i = cst.iterator();
        while( i.hasNext()) {
            System.out.println("value " + i.next() );
        }
    }
}
