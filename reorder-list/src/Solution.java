
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode head1, ListNode head2, boolean turn) {
        if (head1 == null) {
            return head2;
        }
        else if (head2 == null) {
            return head1;
        }
        else {
            if (turn) {
                head1.next = mergeTwoLists(head1.next, head2, !turn);
                return head1;
            }
            else {
                head2.next = mergeTwoLists(head1, head2.next, !turn);
                return head2;
            }
        }
    }
    public ListNode reverseLinkedList(ListNode head) {

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

    public void reorderList(ListNode head) {

        if (head == null || head.next == null) {
            return;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (fast.next == null || fast.next.next == null) {
                ListNode temp = slow.next;
                slow.next = null;
                slow = temp;
                break;
            }


        }

        // merge time
        ListNode head2 = reverseLinkedList(slow);
        ListNode temp = head;

        mergeTwoLists(temp,head2, true);



    }
}

