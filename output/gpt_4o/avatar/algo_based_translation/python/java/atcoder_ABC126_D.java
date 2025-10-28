
import java.util.*;

class Node {
    int val;
    Boolean color;
    List<int[]> a;

    Node() {
        this.val = 0;
        this.color = null;
        this.a = new ArrayList<>();
    }
}

public class atcoder_ABC126_D {
    static Set<Node> nodeSet = new HashSet<>();

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
            nodes[u - 1].val = u;
            nodes[v - 1].val = v;
            nodes[u - 1].a.add(new int[]{v - 1, w});
            nodes[v - 1].a.add(new int[]{u - 1, w});
        }
        
        Node root = nodes[0];
        root.color = true;
        
        traverse(root, 0, nodes);
        
        for (Node node : nodes) {
            if (node.color != null && node.color) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
        
        scanner.close();
    }

    static void traverse(Node node, int distance, Node[] nodes) {
        if (nodeSet.contains(node)) {
            return;
        }
        nodeSet.add(node);
        
        for (int[] pair : node.a) {
            Node adjNode = nodes[pair[0]];
            int dis = pair[1];
            if ((distance + dis) % 2 == 0) {
                adjNode.color = nodes[0].color;
            } else {
                adjNode.color = !nodes[0].color;
            }
            traverse(adjNode, distance + dis, nodes);
        }
    }
}

