
import java.util.*;

class Node {
    Integer val;
    Boolean color;
    List<int[]> a = new ArrayList<>();
}

public class atcoder_ABC126_D {
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
            node1.a.add(new int[]{v - 1, w});
            node2.a.add(new int[]{u - 1, w});
        }
        Node root = nodes[0];
        root.color = true;
        Set<Node> nodeSet = new HashSet<>();
        traverse(root, 0, nodes, nodeSet);
        for (int i = 0; i < n; i++) {
            Node node = nodes[i];
            if (node.color != null && node.color) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }

    public static void traverse(Node node, int distance, Node[] nodes, Set<Node> nodeSet) {
        if (nodeSet.contains(node)) {
            return;
        } else {
            nodeSet.add(node);
        }
        for (int[] pair : node.a) {
            Node adjNode = nodes[pair[0]];
            int dis = pair[1];
            if ((distance + dis) % 2 == 0) {
                adjNode.color = node.color;
            } else {
                adjNode.color = !node.color;
            }
            traverse(adjNode, distance + dis, nodes, nodeSet);
        }
    }
}

