// package BinarySearchtree;

public class Build {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;

        }
    }

    // this is the function insertion of node in the tree 

    public static Node insertTree(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data > val) {
            root.left = insertTree(root.left, val);
        } else {
            root.right = insertTree(root.right, val);

        }
        return root;

    }

    // SEARCHING OF THE KEY IN THE NODE
    static boolean TreeSearch(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;

        }
        if (root.data > key) {
            return TreeSearch(root.left, key);
        } else {
            return TreeSearch(root.right, key);
        }

    }


        // THIS IS THE INORDER FUCTION 
    static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data);
        inorder(root.right);

    }

    public static void main(String args[]) {
        int values[] = { 5, 1, 3, 4, 2, 7 };
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insertTree(root, values[i]);
        }
        inorder(root);
        System.out.println();
        if (TreeSearch(root, 6)) {
            System.out.print("found");
        } else {
            System.out.println("not found ");
        }

    }
}
