class Node{
    int data;
    Node left,right;

    Node(int d){// constructor 
        data = d;
        left = null;
        right = null ;

    }
}


public class levelorderT {
    public static void levelT(Node root){
        if(root == null){
            return ;
        }
    }

    public static void main(String args[]){
         Node root = new Node(12);
          root.left = new Node(14);
          root.right= new Node(34);
          root.right = new Node(98);
          root.right.left = new Node(78);
            levelorderT(root);

    }
}
