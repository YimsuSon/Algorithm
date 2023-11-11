/*

Cycle detection by using disjoint sets : 
Check the each edges and root nodes. If root nodes aren’t same, use union operator

///
 
3 3
1 2
1 3
2 3
Cycle is occurred.

*/

import java.util.Scanner;

public class CycleDetection {
    
    public static int v, e;
    public static int[] parent = new int[100001];

    // Find set included specific element
    public static int findParent(int x){
        // Find root node
        if ( x == parent[x]) 
            return x;
        // Path Compression using recursive function 
        return parent[x] = findParent(parent[x]);
    }

    // Merge set include two element
    public static void unionParent(int a, int b){
        a = findParent(a);
        b = findParent(b);
        if(a<b) parent[b] = a;
        else parent[a] = b;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        v = sc.nextInt();
        e = sc.nextInt();

        // Initialize parent node as themself
        for (int i = 1; i <= v; i++){
            parent[i] = i;
        }

        boolean cycle = false;

        for (int i = 0; i<e; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            // Terminate if cycle is occured
            if (findParent(a) == findParent(b)){
                cycle = true;
                break;
            } // Start union operator if cycle is not occured
            else {
                unionParent(a, b);
            }
        }

        if (cycle){
            System.out.println("Cycle is occured");
        }
        else {
            System.out.println("Cycle is not occured");
        }
    }
}
