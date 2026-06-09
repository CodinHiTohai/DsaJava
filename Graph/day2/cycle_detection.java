
import java.util.*;
public class cycle_detection {
    static class edge{
        int src;
        int dest;
        
        public edge(int s,int d){
            this.src=s;
            this.dest=d;
        
        }
    }
    public static boolean detectcycle(ArrayList<edge>[] graph){
    boolean vis[]=new boolean[graph.length];
    for(int i=0;i<graph.length;i++){
        if(!vis[i]){
        
           if( detectcycleutil(graph,i,vis,-1)){
            return true;
           }
        }
    }
    return false;
    }
    public static boolean detectcycleutil(ArrayList<edge>graph[],int curr,boolean vis[],int par){

        vis[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            edge e=graph[curr].get(i);
            if(!vis[e.dest]){
                if(detectcycleutil(graph,e.dest, vis, curr)){
                    return true;
                }
            }else if(vis[e.dest]&&e.dest!=par){
                return true;
            }
        }
return false;
    }

    public static void main(String[] args) {
        int v=5;
        ArrayList<edge>[]graph=new ArrayList[v];
        for(int i=0;i<v;i++){
            graph[i]=new ArrayList<>();

        }
    graph[0].add(new edge(0,1));
    graph[0].add(new edge(0,2));
    graph[0].add(new edge(0,3));
    graph[1].add(new edge(1,0));
    graph[1].add(new edge(1,2));
    graph[2].add(new edge(2,0));
    graph[2].add(new edge(2,1));
    graph[3].add(new edge(3,0));
    graph[3].add(new edge(3,4));
    graph[4].add(new edge(4,3));

System.out.println(detectcycle(graph));



        
    
}
}
