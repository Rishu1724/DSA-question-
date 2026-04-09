// package Trie;
// trie me always end of the word store karte hai .. ye EOW khuch bhi ho skata h koi bhi value  




public class Alloperation {
    // this is the node of the trie data structure
    static class Node{
        Node Childreen[] = new Node[26];
        boolean eow = false;// end of the word 

        Node(){
            for(int i =0;i <26; i++){
                Childreen[i] = null;
            }
        }

}
    static Node head = new Node();
    public static void main(String[] args) {
        String words[] ={"hello", "baby"};
        
    }
}
