//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();

        Node node = new Node(1);
        node.neighbors.add(new Node(2));
        node.neighbors.add(new Node(3));
        node.neighbors.get(0).neighbors.add(new Node(4));
        node.neighbors.get(0).neighbors.add(new Node(5));
        node.neighbors.get(1).neighbors.add(new Node(6));
        node.neighbors.get(1).neighbors.add(new Node(7));
        node.neighbors.get(0).neighbors.get(0).neighbors.add(new Node(8));
        node.neighbors.get(0).neighbors.get(0).neighbors.add(new Node(9));
        node.neighbors.get(1).neighbors.get(0).neighbors.add(new Node(10));
        node.neighbors.get(1).neighbors.get(0).neighbors.add(new Node(11));
        node.neighbors.get(0).neighbors.get(0).neighbors.get(0).neighbors.add(new Node(12));
        node.neighbors.get(0).neighbors.get(0).neighbors.get(0).neighbors.add(new Node(13));
        node.neighbors.get(1).neighbors.get(0).neighbors.get(0).neighbors.add(new Node(14));
        node.neighbors.get(1).neighbors.get(0).neighbors.get(0).neighbors.add(new Node(15));
        node.neighbors.get(0).neighbors.get(0).neighbors.get(0).neighbors.get(0).neighbors.add(new Node(16));
        node.neighbors.get(0).neighbors.get(0).neighbors.get(0).neighbors.get(0).neighbors.add(new Node(17));
        node.neighbors.get(1).neighbors.get(0).neighbors.get(0).neighbors.get(0).neighbors.add(new Node(18));
        node.neighbors.get(1).neighbors.get(0).neighbors.get(0).neighbors.get(0).neighbors.add(new Node(19));
        node.neighbors.get(0).neighbors.get(0).neighbors.get(0).neighbors.get(0).neighbors.get(0).neighbors.add(new Node(20));
        node.neighbors.get(0).neighbors.get(0).neighbors.get(0).neighbors.get(0).neighbors.get(0).neighbors.add(new Node(21));
        node.neighbors.get(1).neighbors.get(0).neighbors.get(0).neighbors.get(0).neighbors.get(0).neighbors.add(new Node(22));
        node.neighbors.get(1).neighbors.get(0).neighbors.get(0).neighbors.get(0).neighbors.get(0).neighbors.add(new Node(23));
        node.neighbors.get(0).neighbors.get(0).neighbors.get(0).neighbors.get(0).neighbors.get(0).neighbors.get(0).neighbors.add(new Node(24));
        node.neighbors.get(0).neighbors.get(0).neighbors.get(0).neighbors.get(0).neighbors.get(0).neighbors.get(0).neighbors.add(new Node(25));
        node.neighbors.get(1).neighbors.get(0).neighbors.get(0).neighbors.get(0).neighbors.get(0).neighbors.get(0).neighbors.add(new Node(26));
        node.neighbors.get(1).neighbors.get(0).neighbors.get(0).neighbors.get(0).neighbors.get(0).neighbors.get(0).neighbors.add(new Node(27));

        // what should be the output?
        System.out.println(solution.cloneGraph(node));

    }
}