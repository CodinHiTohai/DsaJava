import java.util.*;

public class diameteroftree {

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
    static class binarytree{
        static int idx=-1;
        public static Node buildtre(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newnode=new Node(nodes[idx]);
            newnode.left=buildtre(nodes);
            newnode.right=buildtre(nodes);
            return newnode;

        }
    }
    public static void preeorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preeorder(root.left);
        preeorder(root.right);
    }
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void postorder(Node root){
        if(root==null){
            return;
        }
        preeorder(root.left);
        preeorder(root.right);
        System.out.print(root.data);
    }
    public static void traversal(Node root){
        Queue<Node>q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node currnode=q.remove();
            if(currnode==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                System.out.print(currnode.data+" ");
                if(currnode.left!=null){
                    q.add(currnode.left);
                }if(currnode.right!=null){
                    q.add(currnode.right);
                }
            }
        }
    }
    public static int height(Node root){
        if(root==null){
            return 0;
        }
        int leftheight=height(root.left);
        int rightheight=height(root.right);
        return Math.max(leftheight,rightheight)+1;
    }
    public static int countnode(Node root){
        if(root==null){
            return 0;
        }
        int leftcount=countnode(root.left);
        int rightcount=countnode(root.right);
        return leftcount+rightcount+1;
    }
    public static int sumofnode(Node root){
        if(root==null){
            return 0;
        }
        int leftsum=sumofnode(root.left);
        int rightsum=sumofnode(root.right);
        return leftsum+rightsum+root.data;
    }
    static class info{
        int diam;
        int height;
        public info(int height,int diam){
            this.height=height;
            this.diam=diam;
        }
    }
    public static info diamter(Node root){
        if(root==null){
            return new info(0, 0);
        }
        info leftinfo=diamter(root.left);
        info rightinfo=diamter(root.right);
        int selfdiam=Math.max(leftinfo.height, rightinfo.height)+1;
        int diam=Math.max(selfdiam, Math.max(leftinfo.diam, rightinfo.diam));
        int height=Math.max(leftinfo.height, rightinfo.height)+1;
        return new info(height, diam);
    }
    

    public static void main(String[] args) {
Node root=new Node(1);
root.left=new Node(2);
root.right=new Node(3);
root.left.left=new Node(4);
root.left.right=new Node(5);
root.left.right=new Node(6);
root.left.right=new Node(7);

Node subroot=new Node(2);
subroot.left=new Node(4);
subroot.right=new Node(5);

    }
}
