package Graph;

import java.util.ArrayList;

public class CycleDetectionInDirectedGraph {
    static class Edge{
        int src;
        int dest;
        public Edge(int s,int d){
            this.src =s;
            this.dest =d;
        }
    }
    public static void createGraph(ArrayList<Edge>[] graph){
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0,2));

        graph[1].add(new Edge(1,0));

        graph[2].add(new Edge(2,3));

        graph[3].add(new Edge(3,0));
    }
    public static boolean cycleDetectionDirected(ArrayList<Edge>[] graph,boolean[] visited,int curr,boolean[] recursion){
        visited[curr] = true;
        recursion[curr] =true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e =graph[curr].get(i);
            if(recursion[e.dest])
                return true;
            else if(!visited[e.dest]){
                if(cycleDetectionDirected(graph,visited,e.dest,recursion))
                    return true;
            }
            recursion[curr] =false;
        }
        return false;
    }

    public static void main(String[] args) {
        int vertex =4;
        ArrayList<Edge>[] graph =new ArrayList[vertex];
        createGraph(graph);
        boolean[] visited =new boolean[vertex];
        boolean[] recursion = new boolean[vertex];
        System.out.println(cycleDetectionDirected(graph,visited,0,recursion));
    }
}
