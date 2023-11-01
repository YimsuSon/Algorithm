/*

Select minimum data and swap with data in the beginning of list


///

7,3,9,0,1,2,6,5,4,8

*/


package Sort;


public class SelectionSort {
    
    public static void main(String[] args) {
        int n = 10;
        int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};

        for ( int i = 0 ; i < n ; i++){
            int min_index = i;
            // Select minimum value
            for ( int j = i + 1 ; j < n; j++ ){ 
                if ( arr[min_index] > arr[j] ){
                    min_index = j;
                }
            }
            // Swap 
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }

        
        for ( int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
