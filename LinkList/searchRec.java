public class searchRec {
   public static class Node{
        int data;
        Node next;

       public Node(int data){
            this.data=data;
            this.next= null;
        }
    }
    // public static void printNode(Node head){// here my head is fixed that why we are using static here
    //     while(head!=null){
    //         System.out.println(head.data);
    //         head= head.next;
    //     }
    // }
     

    // but in this case we dont use static function here becasue we use temp here


    public static void printNode(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp= temp.next;
        }
    }
    // main function is static that why we can call static funtion 
    
    public static void main(String args[]){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next=new Node(3);
        printNode(head);
    }
}
