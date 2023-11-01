
/*

Stacking box, Last box First out

///
 
push 5 - push 2 - push 3 - push 7 - pop - push 1 - push 4 - pop

1,3,2,5


*/
import java.util.*;

public class Stack {
    public static void main(String[] args){
        java.util.Stack<Integer> s = new java.util.Stack();

       
        s.push(5);
        s.push(2);
        s.push(3);
        s.push(7);
        s.pop();
        s.push(1);
        s.push(4);
        s.pop();

        // Print stack
        while (!s.empty()){
            System.out.println(s.peek());
            s.pop();
        }


    }
    
}
