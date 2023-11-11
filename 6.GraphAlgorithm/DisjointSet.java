/*

Disjoint sets 
Find the root node. Set parent node and child node point out parent node.

///
 
6 4
1 4
2 3
2 4
5 6

Root node of current node:  1 1 1 1 5 5 
Parent table:  1 1 2 1 5 5 


*/

import java.util.*;

public class DisjointSet {
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        v = sc.nextInt();
        e = sc.nextInt();

        // Initialize parent node as themself
        for ( int i = 1; i<=v; i++){
            parent[i] = i;
        }

        // Do union operation each node
        for (int i=0; i<e; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            unionParent(a, b);
        }

        // Print set include each element
        System.out.print("Set included each elment : ");
        for (int i=1; i<=v; i++){
            System.out.print(findParent(i) + " ");
        }
        System.out.println();

        System.out.print("Parent table : ");
        for(int i=1; i<= v; i++){
            System.out.print(parent[i] + " ");
        }
        System.out.println();


    }
    
}
