

class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null|| head.next == null) {
            return head;
        }


        ListNode prev = null;
        ListNode current = null;




        while (head != null) {
            current = head;
            head = head.next;
            current.next = prev;
            prev = current;


        }
        return prev;

    }
}
