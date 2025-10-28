
import java.util.*;
import java.io.*;

class Node {
    Integer val;
    Boolean color;
    List<Object[]> a;
    
    public Node() {
        this.a = new ArrayList<>();
    }
}

public class atcoder_ABC126_D {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        List<Node> nodes = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            nodes.add(new Node());
        }
        
        for (int i = 0; i < n - 1; i++) {
            String[] input = br.readLine().split(" ");
            int u = Integer.parseInt(input[0]);
            int v = Integer.parseInt(input[1]);
            int w = Integer.parseInt(input[2]);
            
            Node node1 = nodes.get(u - 1);
            Node node2 = nodes.get(v - 1);
            
            node1.val = u;
            node2.val = v;
            
            node1.a.add(new Object[]{node2, w});
            node2.a.add(new Object[]{node1, w});
        }
        
        Node root = nodes.get(0);
        root.color = true;
        Set<Node> nodeSet = new HashSet<>();
        
        traverse(root, 0, nodeSet, root);
        
        for (int i = 0; i < n; i++) {
            Node node = nodes.get(i);
            if (node.color) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
    
    public static void traverse(Node node, int distance, Set<Node> nodeSet, Node root) {
        if (nodeSet.contains(node)) {
            return;
        }
        nodeSet.add(node);
        
        for (Object[] pair : node.a) {
            Node adjNode = (Node) pair[0];
            int dis = (Integer) pair[1];
            
            if ((distance + dis) % 2 == 0) {
                adjNode.color = root.color;
            } else {
                adjNode.color = !root.color;
            }
            
            traverse(adjNode, distance + dis, nodeSet, root);
        }
    }
}

