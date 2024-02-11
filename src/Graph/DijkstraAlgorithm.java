package Graph;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class DijkstraAlgorithm {
    static class Edge{
        int src,dest,weight;
        public Edge(int s,int d,int w){
            this.src =s;
            this.dest =d;
            this.weight =w;
        }
    }
    public static class Pair implements Comparable<Pair>{
        int node;
        int shortestDistance;
        public Pair(int n,int d){
            this.node =n;
            this.shortestDistance =d;
        }
        @Override
        public int compareTo(Pair p2) {
            return this.shortestDistance-p2.shortestDistance;
        }
    }
    public static void createGraph(ArrayList<Edge>[] graph){
        for(int i=0;i< graph.length;i++){
            graph[i] =new ArrayList<>();
        }
        graph[0].add(new Edge(0,1,2));
        graph[0].add(new Edge(0,2,4));

        graph[1].add(new Edge(1,2,1));
        graph[1].add(new Edge(1,3,7));

        graph[2].add(new Edge(2,4,3));

        graph[3].add(new Edge(3,5,1));

        graph[4].add(new Edge(4,5,5));
        graph[4].add(new Edge(4,3,2));
    }
    public static void algorithm(ArrayList<Edge>[] graph,int src,int vertex){
        boolean[] visited =new boolean[vertex];
        PriorityQueue<Pair> priorityQueue =new PriorityQueue<>();
        priorityQueue.add(new Pair(0,0));
        int[] distanceArray= new int[vertex];
        for(int i=0;i<vertex;i++){
            if(i!=src){
                distanceArray[i] =Integer.MAX_VALUE;
            }
        }
        while(!priorityQueue.isEmpty()){
            Pair curr =priorityQueue.remove();//shortest
            if(!visited[curr.node]){
                visited[curr.node] =true;
                for(int i=0;i<graph[curr.node].size();i++){
                    Edge e =graph[curr.node].get(i);
                    int u =e.src;
                    int v= e.dest;
                    //perform relaxation
                    if(distanceArray[u]+e.weight<distanceArray[v]){
                        distanceArray[v]= distanceArray[u]+e.weight;
                        priorityQueue.add(new Pair(v,distanceArray[v]));
                    }
                }
            }
        }
        for (int i:distanceArray){
            System.out.print(i+" ");
        }
        System.out.println();

    }
    public static void main(String[] args) {
        int vertex =6;
        ArrayList<Edge>[] graph =new ArrayList[vertex];
        createGraph(graph);
        algorithm(graph,0,vertex);
    }
}
