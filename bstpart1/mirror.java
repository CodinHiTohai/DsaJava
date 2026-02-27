public class mirror {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            this.left=this.right=null;
        }
    }
    public static Node createmirro(Node root){
        if(root==null){
            return null;
        }
        Node leftmirror=createmirro(root.left);
        Node rightmirror=createmirro(root.right);
        root.left=rightmirror;
        root.right=leftmirror;
        return root;
    }
    public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
        Node root=new Node(8);
        root.left=new Node(5);
        root.right=new Node(10);
        root.left.left=new Node(3);
        root.left.right=new Node(6);
        root.right.right=new Node(11);
        createmirro(root);
        preorder(root);
    }
}
