package Graph;

import java.util.ArrayList;

public class BellmanFordAlgorithm {
    static class Edge{
        int src,dest,weight;
        public Edge(int s,int d,int w){
            this.src =s;
            this.dest =d;
            this.weight =w;
        }
    }
    public static void createGraph(ArrayList<Edge>[] graph){
        for(int i=0;i< graph.length;i++){
            graph[i] =new ArrayList<>();
        }
        graph[0].add(new Edge(0,1,2));
        graph[0].add(new Edge(0,2,4));

        graph[1].add(new Edge(1,2,-4));

        graph[2].add(new Edge(2,3,2));

        graph[3].add(new Edge(3,4,4));

        graph[4].add(new Edge(4,1,-1));
    }
    public static void algorithm(ArrayList<Edge>[] graph, int vertex,int src){
        int[] distanceArray =new int[vertex];
        for(int i=0;i<vertex;i++){
            if(i!=src){
                distanceArray[i]=Integer.MAX_VALUE;
            }
        }
        for(int k=0;k<vertex-1;k++){
            for(int i=0;i<vertex;i++){
                for(int j=0;j<graph[i].size();j++){
                    Edge e =graph[i].get(j);
                    int u =e.src;
                    int v =e.dest;
                    //perform relaxation
                    if(distanceArray[u]+e.weight<distanceArray[v]&&distanceArray[u]!=Integer.MAX_VALUE){
                        distanceArray[v] =distanceArray[u]+e.weight;
                    }
                }
            }
        }
        for(int i:distanceArray){
            System.out.print(i+"  ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int vertex =5;
        ArrayList<Edge>[] graph =new ArrayList[vertex];
        createGraph(graph);
        algorithm(graph,vertex,0);
    }
}
