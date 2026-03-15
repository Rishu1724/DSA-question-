class Node {

    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
    public void reverse(Node head){
        
 }

public class reverseLL {

    public static void main(String args[]) {

        Node head = new Node(10);
        head.next = new Node(30);
        head.next.next = new Node(40);

        Node temp = head;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}