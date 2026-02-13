
// public class preorder {
//     static class Node {
//         int data;
//         Node left;
//         Node right;

//         Node(int data) {
//             this.data = data;
//             this.left = null;
//             this.right = null;

//         }
//     }

//     public static void preOrder(Node root) {
//         System.out.println(root.data);
//         preOrder(root.left);
//         preOrder(root.right);

//     }
//     public static Node createBST(int arr[], int st, int end){
//         if(st>end){
//             return null;
//         }
//         int mid= st+end/2;
//         Node root = new Node(arr[mid]);
//         root.left=createBST(arr,st,mid-1);
//         root.right=createBST(arr,mid+1,end);
//         return root;

//     }

//     public static void main(String args[]) {
//         int[] arr = { 2, 4, 5, 6, 7, 8 };
//         // preOrder();
//         int n= arr.length-1;
//         Node root =createBST(arr,0,arr.length-1);// yaha se jo create ho kar aayega usko hm
//         //  hm root pointer me store karenge  
//         preOrder(root);
//     }
// }
public class preorder {
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

    public static void preOrder(Node root) {
        if (root == null) return;
        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }

    public static Node createBST(int arr[], int st, int end) {
        if (st > end) return null;
        int mid = (st + end) / 2;
        Node root = new Node(arr[mid]);
        root.left = createBST(arr, st, mid - 1);
        root.right = createBST(arr, mid + 1, end);
        return root;
    }

    public static void main(String args[]) {
        int[] arr = {2, 4, 5, 6, 7, 8,9};
        Node root = createBST(arr, 0, arr.length - 1);
        preOrder(root);
    }
}
