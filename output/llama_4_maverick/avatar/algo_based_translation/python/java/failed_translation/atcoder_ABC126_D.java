
import java.util.*;

class Node {
    Integer val;
    Boolean color;
    List<Pair> a;

    public Node() {
        a = new ArrayList<>();
    }
}

class Pair {
    Node node;
    Integer dis;

    public Pair(Node node, Integer dis) {
        this.node = node;
        this.dis = dis;
    }
}

public class atcoder_ABC126_D {
    static void traverse(Node node, Integer distance, Set<Node> nodeSet, Node root) {
        if (nodeSet.contains(node)) {
            return;
        }
        nodeSet.add(node);
        for (Pair pair : node.a) {
            Node adjNode = pair.node;
            Integer dis = pair.dis;
            if ((distance + dis) % 2 == 0) {
                adjNode.color = root.color;
            } else {
                adjNode.color = !root.color;
            }
            traverse(adjNode, distance + dis, nodeSet, root);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Node[] nodes = new Node[n];
        for (int i = 0; i < n; i++) {
            nodes[i] = new Node();
        }
        for (int i = 0; i < n - 1; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            int w = scanner.nextInt();
            Node node1 = nodes[u - 1];
            Node node2 = nodes[v - 1];
            node1.val = u;
            node2.val = v;
            node1.a.add(new Pair(node2, w));
            node2.a.add(new Pair(node1, w));
        }
        Node root = nodes[0];
        root.color = true;
        Set<Node> nodeSet = new HashSet<>();
        traverse(root, 0, nodeSet, root);
        for (int i = 0; i < n; i++) {
            Node node = nodes[i];
            System.out.println(node.color ? 1 : 0);
        }
    }
}

