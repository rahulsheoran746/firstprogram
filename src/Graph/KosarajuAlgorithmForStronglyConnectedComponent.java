package Graph;

import java.util.ArrayList;
import java.util.Stack;

public class KosarajuAlgorithmForStronglyConnectedComponent {
    static class Edge{
        int src;
        int dest;
        public Edge(int s,int d){
            this.src=s;
            this.dest= d;
        }
    }
    public static void createGraph(ArrayList<Edge>[] graph){
        for(int i=0;i<graph.length;i++){
            graph[i] =new ArrayList<>();
        }
        graph[0].add(new Edge(0,2));
        graph[0].add(new Edge(0,3));
        graph[1].add(new Edge(1,0));
        graph[2].add(new Edge(2,1));
        graph[3].add(new Edge(3,4));

    }

    public static void topologicalSort(ArrayList<Edge>[] graph, int curr,boolean[] visited,Stack<Integer> stack){
        visited[curr] =true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e =graph[curr].get(i);
            if(!visited[e.dest]){
                topologicalSort(graph,e.dest,visited,stack);
            }
        }
        stack.push(curr);
    }

    public static void kosaRajuAlgo(ArrayList<Edge>[] graph,int vertex){
        Stack<Integer> stack = new Stack<>();
        boolean[] visited =new boolean[vertex];
        //step1(get nodes in stack(topological sort))
        for(int i=0;i<vertex;i++){
            if(!visited[i]){
                topologicalSort(graph,i,visited,stack);
            }
        }
        //step2(Transpose the graph)
        ArrayList<Edge>[] transposeGraph =new ArrayList[vertex];
        for(int i=0;i<transposeGraph.length;i++){
            transposeGraph[i] =new ArrayList<>();
            visited[i] =false;
        }
        for(int i=0;i<vertex;i++){
            for(int j=0;j<graph[i].size();j++){
                Edge e =graph[i].get(j);
                transposeGraph[e.dest].add(new Edge(e.dest,e.src));
            }
        }
        //step3(Do DFS according to stack nodes on transpose graph)
        while(!stack.isEmpty()){
            int curr =stack.pop();
            if(!visited[curr]){
                dfs(transposeGraph,curr,visited);
                System.out.println();
            }

        }
    }

    private static void dfs(ArrayList<Edge>[] transposeGraph, int curr, boolean[] visited) {
        visited[curr] =true;
        System.out.print(curr+" ");
        for(int i=0;i<transposeGraph[curr].size();i++){
            Edge e =transposeGraph[curr].get(i);
            if(!visited[e.dest]){
                dfs(transposeGraph,e.dest,visited);
            }
        }

    }

    public static void main(String[] args) {
        int vertex =5;
        ArrayList<Edge>[] graph =new ArrayList[vertex];
        createGraph(graph);
        kosaRajuAlgo(graph,vertex);
    }
}
