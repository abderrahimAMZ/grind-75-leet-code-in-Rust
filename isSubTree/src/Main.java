








public class Main {
    public static void main(String[] args) {

        // test 1
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);

        node1.next = node2;
        node2.next = node3;

        node1.random = node3;
        node2.random = node1;
        node3.random = node2;

        Solution solution = new Solution();
        Node result = solution.copyRandomList(node1);

        System.out.println("Test 1");
        System.out.println("Expected: 1");
        System.out.println("Output: " + result.val);
        System.out.println();






    }

}













