
import java.util.*;

public class s233116196 {
    public static void main(String[] args) {
        int[] input = readInput();
        int N = input[0];
        int M = input[1];
        Map<Integer, List<Integer>> G = initializeGraph(N);
        populateGraph(G, M);
        int cmax = bfsTraversal(N, G);
        System.out.println(cmax);
    }

    public static int[] readInput() {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        return new int[]{Integer.parseInt(input[0]), Integer.parseInt(input[1])};
    }

    public static Map<Integer, List<Integer>> initializeGraph(int N) {
        Map<Integer, List<Integer>> G = new HashMap<>();
        for (int i = 1; i <= N; i++) {
            G.put(i, new ArrayList<>());
        }
        return G;
    }

    public static void populateGraph(Map<Integer, List<Integer>> G, int M) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < M; i++) {
            String[] edge = scanner.nextLine().split(" ");
            int a = Integer.parseInt(edge[0]);
            int b = Integer.parseInt(edge[1]);
            G.get(a).add(b);
            G.get(b).add(a);
        }
    }

    public static int bfsTraversal(int N, Map<Integer, List<Integer>> G) {
        int[] col = new int[N + 1];
        Arrays.fill(col, -1);
        int cnt = 0;
        for (int i = 1; i <= N; i++) {
            if (col[i] < 0) {
                col[i] = cnt;
                Deque<Integer> que = new ArrayDeque<>();
                que.add(i);
                while (!que.isEmpty()) {
                    int x = que.poll();
                    for (int y : G.get(x)) {
                        if (col[y] < 0) {
                            col[y] = cnt;
                            que.add(y);
                        }
                    }
                }
                cnt++;
            }
        }
        int cmax = Arrays.stream(col).max().getAsInt();
        return cmax + 1;
    }
}

