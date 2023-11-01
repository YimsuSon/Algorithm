/*

Set the pivot and swap data which is greater than pivot with data which is lesser than pivot.

///

7,3,9,0,1,2,6,5,4,8

*/

package Sort;

public class QuickSort {
    public static void QuickSort(int[] arr, int start, int end){
        // Terminate if there is a element
        if( start>end ) return ;
        int pivot = start;
        int left = start + 1;
        int right = end;
        while (left < right) {
            // Find element which is greater than pivot
            while( left <= end && arr[left] <= arr[pivot]) left++;
            // Find element which is lesser than pivot
            while( right > start && arr[right] >= arr[pivot]) right--;
            // If cross great element and less element, swap less element with pivot
            if(left > right) {
                int temp = arr[pivot];
                arr[pivot] = arr[right];
                arr[right] = temp;
            }
            // If it isn't cross, swap less element with great element
            else{
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
        // After division, sort left side
        QuickSort(arr,start, right-1);
        // sort right side
        QuickSort(arr, right+1, end);
    }
    public static void main(String[] args) {
        int n = 10;
        int [] arr = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};
        QuickSort(arr, 0, n-1);

        for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }    
}

