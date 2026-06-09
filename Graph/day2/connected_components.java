
import java.util.*;
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

}
}