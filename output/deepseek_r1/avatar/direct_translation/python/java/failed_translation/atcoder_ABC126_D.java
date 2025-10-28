import java.util.*;

public class atcoder_ABC126_D {
    static class Node {
        int val;
        Boolean color;
        List<Edge> adj = new ArrayList<>();
    }

    static class Edge {
        Node node;
        int weight;
        Edge(Node n, int w) {
            node = n;
            weight = w;
        }
    }

    static Node root;

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
            Node nodeU = nodes[u - 1];
            Node nodeV = nodes[v - 1];
            nodeU.val = u;
            nodeV.val = v;
            nodeU.adj.add(new Edge(nodeV, w));
            nodeV.adj.add(new Edge(nodeU, w));
        }
        root = nodes[0];
        root.color = true;
        Set<Node> visited = new HashSet<>();
        traverse(root, 0, visited);
        for (Node node : nodes) {
            System.out.println(node.color ? 1 : 0);
        }
    }

    static void traverse(Node node, long distance, Set<Node> visited) {
        if (visited.contains(node)) {
            return;
        }
        visited.add(node);
        for (Edge edge : node.adj) {
            Node adjNode = edge.node;
            int w = edge.weight;
            long sum = distance + w;
            adjNode.color = (sum % 2 == 0) ? root.color : !root.color;
            traverse(adjNode, sum, visited);
        }
    }
}
