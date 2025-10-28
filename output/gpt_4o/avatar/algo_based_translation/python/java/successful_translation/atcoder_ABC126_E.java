
import java.util.*;

public class atcoder_ABC126_E {
    public static final long INF = (long) Math.pow(10, 18);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();
        scanner.nextLine(); // Consume the rest of the line

        List<List<Integer>> edge = new ArrayList<>(N);
        for (int i = 0; i < N; i++) {
            edge.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            int X = scanner.nextInt() - 1;
            int Y = scanner.nextInt() - 1;
            scanner.nextInt(); // Read Z and ignore it
            scanner.nextLine(); // Consume the rest of the line

            edge.get(X).add(Y);
            edge.get(Y).add(X);
        }

        boolean[] used = new boolean[N];
        int ans = 0;

        for (int i = 0; i < N; i++) {
            if (!used[i]) {
                ans++;
                Deque<Integer> queue = new ArrayDeque<>();
                queue.add(i);

                while (!queue.isEmpty()) {
                    int node = queue.poll();
                    used[node] = true;

                    for (int nextnode : edge.get(node)) {
                        if (!used[nextnode]) {
                            queue.add(nextnode);
                        }
                    }
                }
            }
        }

        System.out.println(ans);
    }
}

