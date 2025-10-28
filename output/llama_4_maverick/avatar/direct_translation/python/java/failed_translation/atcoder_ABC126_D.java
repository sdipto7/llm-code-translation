
import java.util.*;

public class atcoder_ABC126_D {
    static class Node {
        Integer val;
        Boolean color;
        List<Pair> a = new ArrayList<>();

        public Node() {}
    }

    static class Pair {
        Node node;
        Integer dis;

        public Pair(Node node, Integer dis) {
            this.node = node;
            this.dis = dis;
        }
    }

    static Set<Node> nodeSet = new HashSet<>();
    static Node root;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Node[] nodes = new Node[n];
        for (int i = 0; i < n; i++) {
            nodes[i] = new Node();
        }
        for (int i = 0; i < n - 1; i++) {
            int u = scanner.nextInt() - 1;
            int v = scanner.nextInt() - 1;
            int w = scanner.nextInt();
            Node node1 = nodes[u];
            Node node2 = nodes[v];
            node1.val = u + 1;
            node2.val = v + 1;
            node1.a.add(new Pair(node2, w));
            node2.a.add(new Pair(node1, w));
        }
        root = nodes[0];
        root.color = true;
        traverse(root, 0);
        for (int i = 0; i < n; i++) {
            Node node = nodes[i];
            System.out.println(node.color ? 1 : 0);
        }
    }

    static void traverse(Node node, int distance) {
        if (nodeSet.contains(node)) {
            return;
        } else {
            nodeSet.add(node);
        }
        for (Pair pair : node.a) {
            Node adjNode = pair.node;
            int dis = pair.dis;
            if ((distance + dis) % 2 == 0) {
                adjNode.color = root.color;
            } else {
                adjNode.color = !root.color;
            }
            traverse(adjNode, distance + dis);
        }
    }
}

