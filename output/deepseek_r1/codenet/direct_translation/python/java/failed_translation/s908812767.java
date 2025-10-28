To solve this problem, we need to determine if a given tree can be colored with two colors such that adjacent nodes connected by an edge with an even weight have the same color and those connected by an edge with an odd weight have different colors. The solution uses a depth-first search (DFS) approach to check and apply the coloring constraints.

### Approach
1. **Graph Representation**: Represent the tree using an adjacency list where each node points to a list of edges. Each edge contains the connected node and the weight of the edge.
2. **Color Initialization**: Initialize an array to keep track of the color of each node, starting with all nodes uncolored (-1).
3. **DFS Traversal**: Use DFS to traverse the tree starting from an uncolored node. For each node, check the parity of the edge weights to determine the color of adjacent nodes:
   - If the weight is even, adjacent nodes must have the same color.
   - If the weight is odd, adjacent nodes must have different colors.
4. **Check Validity**: During the DFS traversal, if a conflict in coloring is detected, output "No" and terminate. If all nodes are successfully colored, output the colors.

### Solution Code

import java.util.*;

public class s908812767 {
    static class Edge {
        int to;
        int weight;
        Edge(int to, int weight) {
            this.to = to;
            this.weight = weight;
        }
    }

    static Map<Integer, List<Edge>> graph = new HashMap<>();
    static int[] color;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        color = new int[n + 1];
        Arrays.fill(color, -1);

        for (int i = 0; i < n - 1; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();
            graph.computeIfAbsent(u, k -> new ArrayList<>()).add(new Edge(v, w));
            graph.computeIfAbsent(v, k -> new ArrayList<>()).add(new Edge(u, w));
        }

        while (true) {
            int i = 0;
            for (int j = 1; j <= n; j++) {
                if (color[j] == -1) {
                    i = j;
                    color[i] = 0;
                    break;
                }
            }
            if (i == 0) {
                for (int j = 1; j <= n; j++) {
                    System.out.println(color[j]);
                }
                break;
            } else {
                if (!dfs(i)) {
                    System.out.println("No");
                    return;
                }
            }
        }
    }

    static boolean dfs(int i) {
        for (Edge edge : graph.getOrDefault(i, Collections.emptyList())) {
            int v = edge.to;
            int w = edge.weight;
            if (w % 2 == 0) {
                if (color[v] == -1) {
                    color[v] = color[i];
                    if (!dfs(v)) {
                        return false;
                    }
                } else if (color[v] != color[i]) {
                    return false;
                }
            } else {
                if (color[v] == -1) {
                    color[v] = 1 - color[i];
                    if (!dfs(v)) {
                        return false;
                    }
                } else if (color[v] == color[i]) {
                    return false;
                }
            }
        }
        return true;
    }
}


### Explanation
- **Graph Construction**: The tree is built using a HashMap where each node maps to a list of edges. Each edge is represented by an object containing the connected node and the weight.
- **Color Initialization**: The color array is initialized to -1, indicating that all nodes are initially uncolored.
- **DFS Traversal**: The DFS function checks each edge connected to the current node. Depending on the parity of the edge weight, it sets the color of the adjacent node and recursively checks the subtree. If a conflict is detected, the function returns false.
- **Main Loop**: The main loop processes each uncolored node, starting a DFS from that node. If all nodes are colored without conflicts, the colors are printed. If a conflict is detected, "No" is printed and the program exits.

This approach ensures that the tree is colored correctly according to the given constraints using a systematic DFS traversal.
