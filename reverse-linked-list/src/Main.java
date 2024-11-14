








public class Main {
    public static void main(String[] args) {

        // test 1
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        Solution solution = new Solution();
        ListNode result = solution.reverseList(head);
        System.out.println(result.val); // 3
        System.out.println(result.next.val); // 2
        System.out.println(result.next.next.val); // 1





    }

}













