/*

Input smallest adjacent node to Queue and pop from queue

///
 
graph = [ [],
          [2,3,8],
          [1,7],
          [1,4,5],
          [3,5],
          [3,4],
          [7],
          [2,6,8],
          [1,7]
        ]

1 2 3 8 7 4 5 6


*/

import java.util.*;


public class BFS {

    public static boolean[] visited = new boolean[9];
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();

    // Define BFS
    public static void bfs(int start){
        java.util.Queue<Integer> q = new LinkedList<>();
        q.offer(start);

        // Mark a vist to current node
        visited[start] = true;

        // Repeat process untill queue is empty
        while(!q.isEmpty()){
            // Print element from queue
            int x = q.poll();
            System.out.print(x + " ");

            // Insert unvisited node that connected with node to queue
            for(int i = 0; i < graph.get(x).size(); i++){
                int y = graph.get(x).get(i);
                if(!visited[y]){
                    q.offer(y);
                    visited[y] = true;
                }
            }
        }
    }

    public static void main(String[] args){
        // Initialize graph
        for (int i = 0; i<9; i++){
            graph.add(new ArrayList<Integer>());
        }

        // Store connected information to node 1
        graph.get(1).add(2);
        graph.get(1).add(3);
        graph.get(1).add(8);

        // Store connected information to node 2
        graph.get(2).add(1);
        graph.get(2).add(7);

        // Store connected information to node 3
        graph.get(3).add(1);
        graph.get(3).add(4);
        graph.get(3).add(5);
        
        // Store connected information to node 4
        graph.get(4).add(3);
        graph.get(4).add(5);

        // Store connected information to node 5 
        graph.get(5).add(3);
        graph.get(5).add(4);

        // Store connected information to node 6
        graph.get(6).add(7);
        
        // Store connected information to node 7
        graph.get(7).add(2);
        graph.get(7).add(6);
        graph.get(7).add(8);

        // Store connected information to node 8
        graph.get(8).add(1);
        graph.get(8).add(7);

        bfs(1);
        
        

    }
    
}
