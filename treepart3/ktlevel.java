
import java.util.*;
public class ktlevel{
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class binarttree{
        static int idx=-1;
        public static Node buildtree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newnode=new Node(nodes[idx]);
            newnode.left=buildtree(nodes);
            newnode.right=buildtree(nodes);
            return newnode;
        }
    }
    public static void levelk(Node root,int k,int level){
        if(root==null){
            return ;
        }
        if(level==k){
            System.out.print(root.data+" ");
        }
        levelk(root.left, k, level+1);
        levelk(root.right, k, level+1);

    }
    public static boolean getpath(Node root,int n,ArrayList<Node>path){
        if(root==null){
            return false;
        }
        path.add(root);
        if(root.data==n){
            return true;
        }
        boolean foundleft=getpath(root.left, n, path);
        boolean foundright=getpath(root.right, n, path);
        if(foundleft||foundright){
            return true;
        }
        path.remove(path.size()-1);
        return false;
        
    }
    public static Node lca(Node root,int n1,int n2){
        ArrayList<Node>path1=new ArrayList<>();
        ArrayList<Node>path2=new ArrayList<>();
        getpath(root,n1,path1);
        getpath(root,n2,path2);

        int i=0;
        for(;i<path1.size()&&i<path2.size();i++){
            if(path1.get(i)!=path2.get(i)){
                break;
            }
        }
Node lca=path1.get(i-1);
return lca;
    }
    public static int lcadist(Node root,int n){
        if(root==null){
            return -1;
        }
        if(root.data==n){
            return 0;
        }
        int leftdist=lcadist(root.left, n);
        int rightdist=lcadist(root.right, n);
        if(leftdist==-1&&rightdist==-1){
            return -1;
        }else if(leftdist==-1){
            return rightdist+1;
        }else{
            return leftdist+1;
        }
    }
    public static int mindist(Node root,int n1,int n2){
        Node lca=lca(root, n1, n2);
        int dist1=lcadist(root,n1);
        int dist2=lcadist(root,n2);
        return dist1+dist2;
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        int n1=4,n2=6;
        System.out.println(mindist(root, n1, n2));
        
    }
}