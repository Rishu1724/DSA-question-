import java.util.*;
class Node{
        int data;
        Node left,right;

        // this is the constructor of the Binarytree 
        Node(int d){
            data=d;
            left= null;
            right=null;
        }
    }

public class Createtree{
    public static void main(String[] args) {
        // initilly and alocation the memeory to the node

        Node firstNode = new Node(2);
        Node secondNode = new Node(3);
        Node thirdNode = new Node(4);
        Node forthNode = new Node(5);


        // now we have to connect the node of the tree
        firstNode.left= secondNode;
        firstNode.right=thirdNode;
        secondNode.left = forthNode;
    }
  
}