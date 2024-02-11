package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class GraphImplementation {
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
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,3));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,4));

        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,4));
        graph[3].add(new Edge(3,5));

        graph[4].add(new Edge(4,2));
        graph[4].add(new Edge(4,3));
        graph[4].add(new Edge(4,5));

        graph[5].add(new Edge(5,3));
        graph[5].add(new Edge(5,4));
        graph[5].add(new Edge(5,6));

        graph[6].add(new Edge(6,5));
    }
    public static void bfs(ArrayList<Edge> graph[],int v,boolean[] visited,int start){
        Queue<Integer> queue =new LinkedList<>();
        queue.add(start);
        while(!queue.isEmpty()){
            int curr = queue.remove();
            if(visited[curr]==false){
                System.out.print(curr+" ");
                visited[curr] =true;
                for(int i=0;i<graph[curr].size();i++){
                    Edge e =graph[curr].get(i);
                    queue.add(e.dest);
                }
            }
        }
    }
    public static void dfs(ArrayList<Edge>[] graph, int curr, boolean[] visited){
        System.out.print(curr+" ");
        visited[curr]= true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e =graph[curr].get(i);
            if(visited[e.dest]==false)
                dfs(graph,e.dest,visited);

        }
    }
    public static void allPathsFromSourceToTraget(ArrayList<Edge>[] graph,boolean[] visited,int current,String path,int target){
        if(current==target){
            System.out.println(path);
            return;
        }
        for(int i=0;i<graph[current].size();i++){
            Edge e =graph[current].get(i);
            if(!visited[e.dest]) {
                visited[current] = true;
                allPathsFromSourceToTraget(graph, visited, e.dest, path+e.dest, target);
                visited[current] = false;
            }
        }
    }
    public static void main(String[] args) {
        //Graph implementation with the help of Adjacency list
        int vertex=7;
        ArrayList<Edge>[] graph =new ArrayList[vertex];
        createGraph(graph);
        //print 2's neighbours
        System.out.println("printing 2's neighbours");
        for(int i=0;i<graph[2].size();i++){
            Edge e =graph[2].get(i);
            System.out.print(e.dest+" ");
        }
        System.out.println();
        //BFS traversal implementation
        System.out.println("Printing graph in BFS");
        boolean[] visited =new boolean[vertex];
        //bfs(graph,vertex);
        //if my graph is consist of disconnected components then we will follow this approach
        for(int i=0;i<vertex;i++){
            if(visited[i]==false){
                bfs(graph,vertex,visited,i);
            }
        }
        System.out.println();
        //DFS traversal implementation
        boolean[] visited2 =new boolean[vertex];
        System.out.println("Printing graph in DFS");
        for(int i=0;i<vertex;i++){
            if(visited2[i]==false){
                dfs(graph,i,visited2);
            }
        }
        //   dfs(graph,0,visited2);
        System.out.println();
        //All Paths from source to target
        //we will use modified dfs
        System.out.println("Printing all paths from source to target");
        boolean[] visited3 =new boolean[vertex];
        String path="0";
        int src =0 ,target =5;
        allPathsFromSourceToTraget(graph,visited3,src,path,target);




    }
}
