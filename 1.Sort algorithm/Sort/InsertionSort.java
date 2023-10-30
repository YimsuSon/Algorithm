package Sort;
public class InsertionSort {
   public static void main(String[] args ){
        int n = 10;
        int [] arr = { 7, 5, 9, 0, 3, 1, 6, 2, 4, 8 };
        // Start sorting from begginng of list
        for ( int i = 0; i < n; i++){
            // Move to beginnig of list 
            for (int j = i; j > 0; j--) {
                //  Check datas
                if (arr[j] < arr[j-1]){
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else break;
                
            }
        }  
        for ( int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
   }

}
