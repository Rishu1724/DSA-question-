
class Node {

    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class printLL {

    Node head;

    public void add(int idx, int data) {
        Node newNode = new Node(data);//Node is the class and the newNode is the object 

        if (idx == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node temp = head;
        int i = 0;
        while (i < idx - 1 && temp != null) {
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        printLL pr = new printLL();  

        
        pr.head = new Node(10);
        pr.head.next = new Node(30);
        pr.head.next.next = new Node(40);

        pr.add(2, 2);
        pr.print();
    }
}
