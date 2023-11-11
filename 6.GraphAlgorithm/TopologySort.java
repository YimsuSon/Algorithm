/*

Topology Sort : 
Input node that indegree is 0 to queue.

///
 
7 8 
1 2
1 5
2 3
2 6
3 4
4 7
5 6
6 4


1 2 5 3 6 4 7 



*/

import java.util.*;

public class TopologySort {
    
    public static int v,e;
    public static int[] indegree = new int[100001];
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();

    public static void topologySort(){
        // List for storing reult of algorithm
        ArrayList<Integer> result = new ArrayList<>();
        // List for queue
        java.util.Queue<Integer> q = new LinkedList<>();

        for ( int i = 1; i <= v; i++){
            if(indegree[i] == 0){
                q.offer(i);
            }
        }

        while(!q.isEmpty()){
            int now = q.poll();
            result.add(now);
            // Minus 1 from connected noe
            for (int i = 0; i < graph.get(now).size(); i++){
                indegree[graph.get(now).get(i)] -= 1;
                // Put new indegree 0 to queue
                if(indegree[graph.get(now).get(i)] == 0 ){
                    q.offer(graph.get(now).get(i));
                } 
            }
        }

        for (int i = 0; i < result.size(); i++){
            System.out.print(result.get(i) + " ");
        }



        }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            v = sc.nextInt();
            e = sc.nextInt();

            // Initialize graph
            for (int i = 0; i <= v; i++){
                graph.add(new ArrayList<Integer>());
            }

            // Input every distance information 
            for (int i = 0; i<e; i++){
                int a = sc.nextInt();
                int b = sc.nextInt();
                graph.get(a).add(b);
                indegree[b] += 1;
            }
            topologySort();;
        }
}


