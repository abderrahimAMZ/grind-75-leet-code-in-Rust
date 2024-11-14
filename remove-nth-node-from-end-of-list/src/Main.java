








public class Main {
    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);

        head.next = second;
        second.next = third;
        third.next = fourth;

        Solution solution = new Solution();
        solution.reorderList(head);

        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }

        // test 2
        ListNode head2 = new ListNode(1);
        ListNode second2 = new ListNode(2);
        ListNode third2 = new ListNode(3);
        ListNode fourth2 = new ListNode(4);
        ListNode fifth2 = new ListNode(5);

        head2.next = second2;
        second2.next = third2;
        third2.next = fourth2;
        fourth2.next = fifth2;

        solution.reorderList(head2);

        while (head2 != null) {
            System.out.println(head2.val);
            head2 = head2.next;
        }




    }

}













