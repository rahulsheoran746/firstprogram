package Graph;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class PrimAlgorithmForMST {
    static class Edge{
        int src,dest,weight;
        public Edge(int s,int d,int w){
            this.src=s;
            this.dest=d;
            this.weight=w;
        }
    }
    public static void createGraph(ArrayList<Edge>[] graph){
        for(int i=0;i<graph.length;i++){
            graph[i] =new ArrayList<>();
        }
        graph[0].add(new Edge(0,1,10));
        graph[0].add(new Edge(0,2,15));
        graph[0].add(new Edge(0,3,30));

        graph[1].add(new Edge(1,0,10));
        graph[1].add(new Edge(1,3,40));

        graph[2].add(new Edge(2,3,50));
        graph[2].add(new Edge(2,0,15));

        graph[3].add(new Edge(3,0,30));
        graph[3].add(new Edge(3,1,40));
        graph[3].add(new Edge(3,2,50));
    }
    //non MST set
    static class Pair implements Comparable<Pair>{
        int node;
        int cost;
        public Pair(int n,int d){
            this.node=n;
            this.cost =d;
        }
        @Override
        public int compareTo(Pair p2) {
            return this.cost - p2.cost;
        }
    }
    public static void primAlgoForMST(ArrayList<Edge>[] graph ,int vertex){
        PriorityQueue<Pair> priorityQueue =new PriorityQueue<>();
        boolean[] visited =new boolean[vertex];
        int minCost =0;
        priorityQueue.add(new Pair(0,0));
        while(!priorityQueue.isEmpty()){
            Pair curr =priorityQueue.remove();
            if(!visited[curr.node]){
                visited[curr.node]=true;
                minCost += curr.cost;
                for(int i=0;i<graph[curr.node].size();i++){
                    Edge e =graph[curr.node].get(i);
                    if(!visited[e.dest]){
                        priorityQueue.add(new Pair(e.dest,e.weight));
                    }
                }
            }
        }
        System.out.println("Minimum Cost is:"+ minCost);
        System.out.println("Nodes which used for MST");
//        for(int i: mst){
//            System.out.print(i+ " ");
//        }
        System.out.println();

    }
    public static void main(String[] args) {
        int vertex =4;
        ArrayList<Edge>[] graph =new ArrayList[vertex];
        createGraph(graph);
        primAlgoForMST(graph,vertex);
    }
}
