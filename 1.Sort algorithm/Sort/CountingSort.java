package Sort;

public class CountingSort {

    public static final int max_value = 9;
    public static void main(String[] args) {
        int n = 15;
        int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 9, 1, 4, 8, 0, 5, 2};
        // Declare count table
        int [] cnt = new int[max_value + 1];

        for (int i = 0; i<n; i++){
            // Add element in list to count table
            cnt[arr[i]] += 1;
        }
        // Check count table
        for (int i=0; i <= max_value; i++){
            // Print elements refering count table
            for (int j=0; j < cnt[i]; j++){
                System.out.print(i + " ");
            }
        }
    }
}
