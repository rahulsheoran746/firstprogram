package Graph;

import java.util.ArrayList;

public class BridgeUsingTarjanAlgorithmn {
    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }
    public static void createGraph(ArrayList<Edge>[] graph){
        for(int i=0;i<graph.length;i++){
            graph[i] =new ArrayList<>();
        }
        graph[0].add(new Edge(0,3));
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));

        graph[1].add(new Edge(1,2));
        graph[1].add(new Edge(1,0));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,1));

        graph[3].add(new Edge(3,0));
        graph[3].add(new Edge(3,4));
        graph[3].add(new Edge(3,5));

        graph[4].add(new Edge(4,3));
        graph[4].add(new Edge(4,5));

        graph[5].add(new Edge(5,4));
        graph[5].add(new Edge(5,3));
    }
    public static void getBridge(ArrayList<Edge> [] graph, int vertex){
        boolean[] visited =new boolean[vertex];
        int[] discoveryTime =new int[vertex];
        int[] lowestDiscoveryTime =new int[vertex];
        int time =0;
        for(int i=0;i<vertex;i++){
            if(!visited[i]){
                dfs(graph,i,visited,discoveryTime,lowestDiscoveryTime,time,-1);
            }
        }
    }

    private static void dfs(ArrayList<Edge>[] graph, int curr, boolean[] visited, int[] discoveryTime, int[] lowestDiscoveryTime, int time, int parent) {
        visited[curr] =true;
        discoveryTime[curr] = lowestDiscoveryTime[curr] = ++time;
        for(int i=0;i<graph[curr].size();i++){
            Edge e =graph[curr].get(i);
            //case 1 when e.dest have parent
            if(e.dest==parent){
                continue;
            }
            //case 2 when parent is not visited
            else if(!visited[e.dest]){
                dfs(graph,e.dest,visited,discoveryTime,lowestDiscoveryTime,time,curr);
                lowestDiscoveryTime[curr] = Math.min(lowestDiscoveryTime[curr],lowestDiscoveryTime[e.dest]);
                if(discoveryTime[curr]<lowestDiscoveryTime[e.dest]){
                    System.out.println("bridge is : "+curr+" ---- "+e.dest);
                }
            }
            //when parent is visited
            else{
                lowestDiscoveryTime[curr] =Math.min(lowestDiscoveryTime[curr],discoveryTime[e.dest]);
            }
        }
    }


    public static void main(String[] args) {
        int vertex = 6;
        ArrayList<Edge>[] graph = new ArrayList[vertex];
        createGraph(graph);
        getBridge(graph,vertex);
    }
}
