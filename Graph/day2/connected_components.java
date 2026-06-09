
import java.util.*;

import javax.management.Query;
public class connected_components{
    static class EDGE{
        int src;
        int dest;
        int weight;
        public EDGE(int s,int d,int w){
            this.src=s;
            this.dest=d;
            this.weight=w;

        }
    }
    public static void bfs(ArrayList<EDGE>[] graph){
        boolean vis[]=new boolean[graph.length];
        for(int i=0;i<graph.length;i++){
            if(!vis[i]){
                utilbfs(graph, vis);

            }
        }
    }
    public static void utilbfs(ArrayList<EDGE>[] graph, boolean vis[]){
        Queue<Integer>q=new LinkedList<>();
        q.add(0);
        while (!q.isEmpty()) {
            int curr=q.remove();
            if (!vis[curr]) {
                System.out.println(curr+" ");
                vis[curr]=true;
                for(int i=0;i<graph[curr].size();i++){
                    EDGE e=graph[curr].get(i);
                    q.add(e.dest);
                    
                }
            }
            
        }


    }
    public static void dfs(ArrayList<EDGE>[] graph,int curr,boolean vis[]){
        System.out.print(curr+" ");
        vis[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            EDGE e=graph[curr].get(i);
            if(!vis[e.dest]){
                dfs(graph, e.dest,  vis);
            }

        }

    }
public static void main(String[] args) {
    
    int v=5;
    ArrayList<EDGE>[]graph=new ArrayList[v];
    for(int i=0;i<v;i++){
        graph[i]=new ArrayList<>();
    }
graph[0].add(new EDGE(0, 1, 1));
graph[1].add(new EDGE(1, 0, 1));

// 0 - 2
graph[0].add(new EDGE(0, 2, 1));
graph[2].add(new EDGE(2, 0, 1));

// 1 - 3
graph[1].add(new EDGE(1, 3, 1));
graph[3].add(new EDGE(3, 1, 1));

// 2 - 4
graph[2].add(new EDGE(2, 4, 1));
graph[4].add(new EDGE(4, 2, 1));

// 3 - 4
graph[3].add(new EDGE(3, 4, 1));
graph[4].add(new EDGE(4, 3, 1));
dfs(graph, 0, new boolean[v]);

}
}