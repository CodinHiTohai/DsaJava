import java.util.*;


public class hashpath {
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
        Queue<Integer>q=new LinkedList<>();
        boolean vis[]=new boolean[graph.length];
        q.add(0);
        while (!q.isEmpty()) {
            int curr=q.remove();
            if(!vis[curr]){
                System.out.println(curr+"  ");
                vis[curr]=true;
                for(int i=0;i<graph[curr].size();i++){
                    EDGE e=graph[curr].get(i);
                    q.add(e.dest);
                }
            }
            
        }
    }
    public static void dfs(ArrayList<EDGE>[] graph,int curr,boolean vis [] ){
        System.out.println(curr+" ");
    vis[curr]=true;
    for(int i=0;i<graph[curr].size();i++){
        EDGE e=graph[curr].get(i);
        if(!vis[e.dest]){
            dfs(graph, e.dest, vis);
        }
    }
    }
    public static boolean hashpath(ArrayList<EDGE>[] graph,int src,int dest,boolean vis[]){
        if(src==dest){
            return true;
        }
        vis[src]=true;
        for(int i=0;i<graph[src].size();i++){
            EDGE e=graph[src].get(i);
            if(!vis[e.dest]&&hashpath(graph,  e.dest,dest, vis)){
                return true;

            }
        }
        return false;
    }
    public static void main(String[] args) {
        int v=7;
        ArrayList<EDGE>[] graph=new ArrayList[v];
        for(int i=0;i<v;i++){
            graph[i]=new ArrayList <>();
        }
        graph[0].add(new EDGE(0, 1, 1));
        graph[0].add(new EDGE(0, 2, 1));

        graph[1].add(new EDGE(1, 0, 1));
        graph[1].add(new EDGE(1, 3, 1));
        

        graph[2].add(new EDGE(2, 0, 1));
        graph[2].add(new EDGE(2, 4, 1));


        graph[3].add(new EDGE(3, 1, 1));
        graph[3].add(new EDGE(3, 4, 1));
        graph[3].add(new EDGE(3, 5, 1));

        graph[4].add(new EDGE(4, 2, 1));
        graph[4].add(new EDGE(4, 3, 1));
        graph[4].add(new EDGE(4, 5, 1));


        graph[5].add(new EDGE(5, 3, 1));
        graph[5].add(new EDGE(5, 4, 1));
System.out.println(hashpath(graph, 0, 7,new boolean[v]));
        
    }
}
