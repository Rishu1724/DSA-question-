class Node{
    int data;
    Node left,right;

    Node(int d){
        data = d;
        left = null;
        right = null ;

    }
}

class Length {

    public static int lenghtTree(Node root){
    if(root == null){
        return 0;

    }
    int lh = lenghtTree(root.left);
    int rh = lenghtTree(root.right);
    int height = Math.max(lh,rh)+1;
    return height;
}
    public static void main(String args[]){
          Node root = new Node(12);
          root.left = new Node(14);
          root.right= new Node(34);
          root.right = new Node(98);
          root.right.left = new Node(78);
          System.out.println(lenghtTree(root));


    }
}
