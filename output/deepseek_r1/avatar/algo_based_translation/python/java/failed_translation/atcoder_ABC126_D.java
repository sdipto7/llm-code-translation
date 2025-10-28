
import java.util.*;

public class atcoder_ABC126_D {
    static class Node {
        int val;
        Boolean color;
        List<Pair> adj;

        Node() {
            adj = new ArrayList<>();
        }
    }

    static class Pair {
        Node node;
        int weight;

        Pair(Node node, int weight) {
            this.node = node;
            this.weight = weight;
        }
    }

    private static void traverse(Node node, int distance, Set<Node> nodeSet, boolean rootColor) {
        if (nodeSet.contains(node)) return;
        nodeSet.add(node);
        
        for (Pair pair : node.adj) {
            Node adjNode = pair.node;
            int newDist = distance + pair.weight;
            adjNode.color = (newDist % 2 == 0) ? rootColor : !rootColor;
            traverse(adjNode, newDist, nodeSet, rootColor);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Node> nodes = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            nodes.add(new Node());
        }
        
        for (int i = 0; i < n - 1; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            int w = scanner.nextInt();
            
            Node node1 = nodes.get(u - 1);
            Node node2 = nodes.get(v - 1);
            node1.val = u;
            node2.val = v;
            node1.adj.add(new Pair(node2, w));
            node2.adj.add(new Pair(node1, w));
        }
        
        Node root = nodes.get(0);
        root.color = true;
        Set<Node> nodeSet = new HashSet<>();
        traverse(root, 0, nodeSet, root.color);
        
        for (Node node : nodes) {
            System.out.println(node.color ? 1 : 0);
        }
    }
}

