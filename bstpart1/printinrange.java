

public class printinrange {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;

        }
    }
    public static Node insert(Node root,int val){
        if(root==null){
            root=new Node(val);
            return root;
        }
        if(root.data>val){
            root.left=insert(root.left, val);
        }else{
            root.right=insert(root.right, val);
        }
        return root;
    }
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static boolean search(Node root,int key){
        if(root==null){
            return false;
        }
        if(root.data==key){
            return true;
        }
        if(root.data>key){
            return search(root.left, key);

        }else{
            return search(root.right, key);
        }
    }
    public static Node delete(Node root,int val){
        if(root.data>val){
            root.left =delete(root.left, val);
        }else if(root.data<val){
            root.right=delete(root.right, val);
        }else{
            if (root.left==null && root.right==null){
            return null;
            }
        
        if(root.left==null){
            return root.right;
        }else if(root.right==null){
            return root.left;
        }
        Node is=findinordersuccesro(root.right);
        root.data=is.data;
        delete(root.right, is.data);


    }
    return root;
}
public static void printinrange(Node root,int k1,int k2){
    if(root==null){
        return;
    }
    if(root.data>=k1&&root.data<=k2){
        printinrange(root.left, k1, k2);
        System.out.print(root.data);
        printinrange(root.right, k1, k2);
    }else if(root.data<k1){
        printinrange(root.left, k1, k2);
    }else{
        printinrange(root.right, k1, k2);
    }
}
public static Node findinordersuccesro(Node root){
    while(root.left!=null){
        root=root.left;
    }
    return root;
}

    public static void main(String[] args) {
        int values[]={8,5,3,1,4,6,10,11,14};
        Node root=null;
        for(int i=0;i<values.length;i++){
            root=insert(root, values[i]);

        }
    printinrange(root, 5, 12);
    }
}
