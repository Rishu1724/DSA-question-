import java.util.*;


public class Merge2BST {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data= data;
            this.left=null;
            this.right= null;

        }

    } 
    public static void getInorder(Node root , ArrayList<Integer> arr){
        if(root ==null){
            return;

        }
        getInorder(root.left,arr);
        arr.add(root.data);
        getInorder(root.right,arr);
    }
    public static Node mergerBSTs(Node root1, Node root2){
        // step1
        ArrayList<Integer> arr1 = new ArrayList<>();
        getInorder(root1,arr1);
    }




    public static void main(String args[]){
        /*
                2
               / \
              1  4
        */
       Node root1= new Node(2);
       root1.left= new Node(1);
       root1.right= new Node(4);


       Node root2 = new Node(9);
       root2 = new Node(3);
       root2 = new Node(12);

    }
}
