/*

Find shortest distance from every node to every node. It store information of shortest distance to 2-dimension node.

///
 

6 11
1
1 2 2
1 3 5
1 4 1
2 3 3
2 4 2
3 2 3
3 6 5
4 3 3
4 5 1
5 3 1
5 6 2


0
2
3
1
2
4

*/

import java.util.*;


public class FloydWarshall {

    public static final int INF = (int) 1e9; 
    public static int n, m;
    // 2-dimesion array (Graph )
    public static int[][] graph = new int[501][501];

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        // Initialize shortest distance table as INF
        for(int i=0; i<501; i++){
            Arrays.fill(graph[i], INF);
        }

        // Initialize distance to themselves
        for(int a=1; a<n; a++){
            for(int b=1; b<n; b++){
                if(a==b) graph[a][b] = 0;
            }
        }

        // Input distance 
        for (int i=0; i<m; i++){
            // C is distance from a to b
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            graph[a][b] = c;
        }

        // Start Floyd-Warshall 
        for (int k=1; j<=n; k++){
            for (int a=1; a<=n; a++){
                for (int b=1; b<=n; b++){
                    graph[a][b] = Math.min(graph[a][b], graph[a][k] + graph[k][b]);
                }
            }
        }

        // Print result
        for (int a =1; a <= n; a++){
            for (int b=1; b <= n; b++){
                if(graph[a][b] == INF){
                    System.out.print("INF");
                } // Print
                else {
                    System.out.print(graph[a][b] + " ");
                }
            }
            System.out.println();
        }

    }
}
