// class Node{
//     int data;
//     Node  next;


//     Node(int data){
//         this.data= data;
//         this.next= null;
//     }
// }
// public static void printLL(Node head ){
//     Node temp = head;
//     while(temp != null){
//         System.out.println(temp.data);
//         temp = temp.next;
//     }

// }



// public class addatfirst {
// public static void main(String args[]){
//     Node head = new Node(3);
//     head.next = new Node(4);
//     head.next.next = new Node(5);
//     head.next.next.next= new Node(6);
//     printLL(head);
// }
// }


class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class addatfirst {

    public static void printLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String args[]) {
        Node head = new Node(3);// we are accessign the Node object form the Node class 
        head.next = new Node(4);
        head.next.next = new Node(5);
        head.next.next.next = new Node(6);
        printLL(head);
    }
}
