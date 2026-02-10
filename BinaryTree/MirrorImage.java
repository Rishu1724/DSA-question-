// public class MirrorImage {
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

    public static Node mirrorImage(Node root) {
        if (root == null) {
            return null;
        }

        Node left = mirrorImage(root.left);
        Node right = mirrorImage(root.right);

        root.left = right;
        root.right = left;

        return root;
    }

    public static void preOrder(Node root) {
        if (root == null) return;

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String args[]) {
        Node root = new Node(12);
        root.left = new Node(4);
        root.right = new Node(5);
        root.left.left = new Node(6);
        root.right.right = new Node(7);

        System.out.print("Original Tree: ");
        preOrder(root);

        mirrorImage(root);

        System.out.print("\nMirror Tree: ");
        preOrder(root);
    }

