
import java.util.*;

public class s233116196 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            adj.get(a).add(b);
            adj.get(b).add(a);
        }
        int[] color = new int[N + 1];
        Arrays.fill(color, -1);
        int count = 0;
        for (int i = 1; i <= N; i++) {
            if (color[i] == -1) {
                color[i] = count;
                Queue<Integer> queue = new LinkedList<>();
                queue.add(i);
                while (!queue.isEmpty()) {
                    int x = queue.poll();
                    for (int y : adj.get(x)) {
                        if (color[y] == -1) {
                            color[y] = count;
                            queue.add(y);
                        }
                    }
                }
                count++;
            }
        }
        int max = 0;
        for (int i = 1; i <= N; i++) {
            if (color[i] > max) {
                max = color[i];
            }
        }
        System.out.println(max);
    }
}

