
import java.util.*;

public class atcoder_ABC148_F {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ta = sc.nextInt() - 1;
        int ao = sc.nextInt() - 1;

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < n - 1; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        int[] taDist = new int[n];
        Arrays.fill(taDist, -1);
        taDist[ta] = 0;

        int[] aoDist = new int[n];
        Arrays.fill(aoDist, -1);
        aoDist[ao] = 0;

        aoDfs(ao, graph, aoDist);
        taDfs(ta, graph, taDist);

        int res = 0;
        for (int i = 0; i < n; i++) {
            if (taDist[i] > aoDist[i]) continue;
            res = Math.max(res, aoDist[i]);
        }

        System.out.println(res - 1);
    }

    private static void taDfs(int node, ArrayList<ArrayList<Integer>> graph, int[] taDist) {
        for (int neighbor : graph.get(node)) {
            if (taDist[neighbor] == -1) {
                taDist[neighbor] = taDist[node] + 1;
                taDfs(neighbor, graph, taDist);
            }
        }
    }

    private static void aoDfs(int node, ArrayList<ArrayList<Integer>> graph, int[] aoDist) {
        for (int neighbor : graph.get(node)) {
            if (aoDist[neighbor] == -1) {
                aoDist[neighbor] = aoDist[node] + 1;
                aoDfs(neighbor, graph, aoDist);
            }
        }
    }
}

