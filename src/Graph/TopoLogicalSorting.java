package Graph;

import java.util.*;

public class TopoLogicalSorting {
    static class Edge{
        int src;
        int dest;
        //we can add a new field weight for every edge;
        public Edge(int s,int d){
            this.src =s;
            this.dest =d;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }

        graph[2].add(new Edge(2,3));

        graph[3].add(new Edge(3,1));

        graph[4].add(new Edge(4,0));
        graph[4].add(new Edge(4,1));

        graph[5].add(new Edge(5,0));
        graph[5].add(new Edge(5,2));
    }
    public static void topologicalSortingModifiedDFS(ArrayList<Edge>[] graph,boolean[] visited,int curr,Stack<Integer> stack){
        visited[curr] =true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e =graph[curr].get(i);
            if(!visited[e.dest]){
                topologicalSortingModifiedDFS(graph,visited,e.dest,stack);
            }
        }
        stack.push(curr);

    }


    public static void main(String[] args) {
        int vertex =6;
        ArrayList<Edge>[] graph =new ArrayList[vertex];
        createGraph(graph);
        boolean[] visited =new boolean[vertex];
        Stack<Integer> stack =new Stack<>();
        for(int i=0;i<vertex;i++){
            if(!visited[i]){
                topologicalSortingModifiedDFS(graph,visited,i,stack);
            }
        }
       while(!stack.isEmpty()){
           System.out.print(stack.pop()+" ");
       }
        System.out.println();

    }
}
