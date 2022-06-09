
import java.util.Stack;

public class MyStack {

    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        pushElement(stk, 10);
        pushElement(stk, 20);
        pushElement(stk, 30);
        popElement(stk);
        pushElement(stk, 40);
        peekElement(stk);
    }

    static void pushElement(Stack stk, int x) {
        System.out.println("Pusing Data " + x);
        stk.push(x);
        System.out.println("Stack " + x);
    }

    static void popElement(Stack stk) {
        System.out.println("Poping data ");
        Integer x = (Integer) stk.pop();
        System.out.println("Stack " + stk);
    }
    
    //Chceck what value is at last
    static void peekElement(Stack stk) {
        Integer x = (Integer) stk.peek();
        System.out.println(x);
    }
    
   

}
