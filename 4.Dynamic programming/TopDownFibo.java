
/*

Use recursive function

///
 
10

55


*/

public class TopDownFibo {
     // Initialize DP table to Memoization
     public static long[] d = new long[100];
    
     public static long fibo(int x){
         
         // Derminate condition
         if ( x == 1 || x == 2){
             return 1;
         }
 
         // Return result if it is already calculated
         if ( d[x] != 0 ){
             return d[x];
         }
 
         // Return result if it is already calculated
         d[x] = fibo(x-1) + fibo(x-2);
         return d[x];
     }
     
     public static void main(String[] args) {
         System.out.println(fibo(10));
     }
 
}
