/*

Calculate the distance to move from specific node to other node 
and update priority queue in the shortest path table

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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

class Node implements Comparable<Node>{
    private int index;
    private int distance;

    public Node(int index, int distance){
        this.index = index;
        this.distance = distance;
    }

    public int getIndex() {
        return this.index;
    }

    public int getDistance(){
        return this.distance;
    }

    @Override
    public int compareTo(Node other){
        if (this.distance < other.distance){
            return -1;
        }
        return 1;
    }
}

public class Dijkstras {
    public static final int INF = (int) 1e9;

    public static int n, m, start;
    // Array to store connected nodes
    public static ArrayList<ArrayList<Node>> graph = new ArrayList<ArrayList<Node>>();
    // Shortest distance table
    public static int[] d = new int[100001];

    public static void dijkstra(int start){
        PriorityQueue<Node> pq = new PriorityQueue<>();
        // Push to queue
        pq.offer(new Node(start,0));
        d[start] = 0;
        while(!pq.isEmpty()){
            // Pop shortest distance of node 
            Node node = pq.poll();
            int dist = node.getDistance();
            int now = node.getIndex();
            // Pass node if it marked a visit
            if (d[now] < dist) continue;
            // Check connected node with current node
            for (int i = 0; i<graph.get(now).size(); i++){
                int cost = d[now] + graph.get(now).get(i).getDistance();
                // If other node is short
                if (cost < d[graph.get(now).get(i).getIndex()]){
                    d[graph.get(now).get(i).getIndex()] = cost;
                    pq.offer(new Node(graph.get(now).get(i).getIndex(), cost));
                }
            }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        start = sc.nextInt();

        // Initialize graph
        for(int i = 0; i <= n; i++){
            graph.add(new ArrayList<Node>());
        }

        // Input every distance
        for(int i=0; i<m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            graph.get(a).add(new Node(b,c));
        }

        // Initialize shortest distance table as INF
        Arrays.fill(d, INF);

        dijkstra(start);

        for (int i =1; i <=n; i++){
            if(d[i] == INF){
                System.out.println("INFINITY");
            }// Print distnace
            else {
                System.out.println(d[i]);
            }
        }
    }

}
