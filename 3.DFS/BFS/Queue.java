/*

Passing turnel, First car First out

///
 
push 5 - push 2 - push 3 - push 7 - pop - push 1 - push 4 - pop

3,7,1,4


*/
import java.util.*;

public class Queue {
    public static void main(String[] args){
        java.util.Queue<Integer> q = new LinkedList<>();
        
        q.offer(5);
        q.offer(2);
        q.offer(3);
        q.offer(7);
        q.poll();
        q.offer(1);
        q.offer(4);
        q.poll();

        while (!q.isEmpty()){
            System.out.println(q.poll());
        }


    }
    
}
