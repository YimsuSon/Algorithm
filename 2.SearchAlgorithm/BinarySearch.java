/*

Compare datas which are middle portion with first portion or end portion

///

5 0
0 2 4 6 8

1

*/

import java.util.*;


public class BinarySearch {
    public static int binarySearch(int[] arr, int target, int start, int end){
        if(start > end) return -1;
        int mid = (start + end) / 2;
        // if find target, return mid
        if(arr[mid] == target) return mid;
        // if mid is lesser than target, check left side
        else if (arr[mid] > target) return binarySearch(arr, target, start, mid -1);
        // if mid is greater than target, check right side
        else return binarySearch(arr, target, mid+1, end);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Input target and number of element
        int n = sc.nextInt();
        int target = sc.nextInt();

        // Input every elements
        int[] arr = new int[n];
        for (int i = 0; i <n ; i++){
            arr[i] = sc.nextInt();
        }

        // Print 
        int result = binarySearch(arr, target,0 , n);
        if (result == -1){
            System.out.println("Can't find target");
        } else {
            System.out.println(result + 1);
        }
    }
    
}
