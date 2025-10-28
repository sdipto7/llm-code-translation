To solve this problem, we need to determine the winner of a game played on a tree structure. The game involves two players alternately removing nodes from the tree, and the player who cannot make a move loses. The solution involves analyzing the tree structure to determine if the first player can force a win.

### Approach
1. **Tree Construction**: Read the input to construct the tree using an adjacency list.
2. **BFS for Tree Traversal**: Use BFS to traverse the tree starting from node 1 to determine parent-child relationships and count the number of children each node has.
3. **Leaf Node Identification**: Identify leaf nodes (nodes with no children) and process them in reverse order.
4. **Greedy Removal Strategy**: Process each leaf node and its parent, marking them as removed. If a parent of a leaf node is already removed, the first player wins. Otherwise, update the tree structure and continue processing until all nodes are processed or a winner is determined.

### Solution Code

import java.util.*;

public class atcoder_AGC014_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < N - 1; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            adj.get(a).add(b);
            adj.get(b).add(a);
        }
        Deque<Integer> queue = new ArrayDeque<>();
        queue.add(1);
        int[] seen = new int[N + 1];
        seen[1] = 1;
        int[] parent = new int[N + 1];
        int[] childCount = new int[N + 1];
        while (!queue.isEmpty()) {
            int v = queue.poll();
            for (int u : adj.get(v)) {
                if (seen[u] == 0) {
                    seen[u] = 1;
                    parent[u] = v;
                    childCount[v]++;
                    queue.add(u);
                }
            }
        }
        Deque<Integer> leaves = new ArrayDeque<>();
        for (int i = 1; i <= N; i++) {
            if (childCount[i] == 0) {
                leaves.add(i);
            }
        }
        Arrays.fill(seen, 0);
        while (!leaves.isEmpty()) {
            int c = leaves.pollLast();
            seen[c] = 1;
            int p = parent[c];
            if (seen[p] == 1) {
                System.out.println("First");
                return;
            }
            seen[p] = 1;
            int grandparent = parent[p];
            if (grandparent != 0) {
                childCount[grandparent]--;
                if (childCount[grandparent] == 0) {
                    leaves.add(grandparent);
                }
            }
        }
        System.out.println("Second");
    }
}


### Explanation
1. **Tree Construction**: The tree is built using an adjacency list where each node points to its neighbors.
2. **BFS Traversal**: Starting from node 1, we traverse the tree to determine the parent of each node and count the number of children each node has. This helps in identifying leaf nodes (nodes with zero children).
3. **Leaf Processing**: Leaf nodes are processed in reverse order. For each leaf, we check if its parent has already been removed. If so, the first player wins. Otherwise, the parent is marked as removed, and the grandparent's child count is updated. If the grandparent becomes a leaf (child count zero), it is added to the processing queue.
4. **Winner Determination**: The process continues until all nodes are processed. If no immediate win is detected, the second player wins.

This approach efficiently determines the winner by leveraging tree properties and a greedy strategy to process nodes, ensuring optimal performance.
