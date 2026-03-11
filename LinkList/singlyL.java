import java.util.*;

class Node {
    int data;
    Node next;

    public Node(int data) {// this is the constructor which is the same as the class name
        this.data = data;
        this.next = null;
    }

}

public static int lengthCount(int Node) {

}

public class singlyL {
    public static void main(String args[]) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);// third ndoe
        head.next.next.next.next = new Node(60);

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
