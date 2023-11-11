/*

Check elements in list from starting portion to end portion one by one in order.

///

5 peter
james time peter jack jun

3


*/

import java.util.*;


public class SequentialSearch {
    // Check elements from beginning of list
    public static int sequentialSearch(int n, String target, String[] arr){
        for ( int i = 0; i < n; i++){
            System.out.println(arr[i]);
            // If it find element
            if (arr[i].equals(target)){
                // return current portion
                return i+1;
            }
        }
        // if it isn't find element, return -1
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input number of element and element that you want to find");
        // Number of element
        int n = sc.nextInt();
        // Element that you want to find
        String target = sc.next();

        System.out.println("Input elements with space");

        String[] arr = new String[n];

        for( int i = 0; i < n; i++){
            arr[i] = sc.next();
        }
        
        // Print result 
        System.out.println(sequentialSearch(n, target, arr));


        
    }


}
