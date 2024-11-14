/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    HashMap<Node,Node> map = new HashMap<>();

    public Node copyRandomList(Node head) {


        Node myhead = null;


        if (head!= null){
            if (map.get(head) == null) {

                myhead = new Node(head.val);
                map.put(head, myhead);


                myhead.next = copyRandomList(head.next);
                myhead.random = copyRandomList(head.random);
            }
            else {
                myhead = map.get(head);
            }
        }


        return myhead;
    }
}
