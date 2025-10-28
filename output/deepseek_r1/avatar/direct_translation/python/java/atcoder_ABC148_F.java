
import java.util.*;

public class atcoder_ABC148_F {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ta = sc.nextInt() - 1;
        int ao = sc.nextInt() - 1;

        List<List<Integer>> g = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            g.add(new ArrayList<>());
        }
        for (int i = 0; i < n - 1; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            g.get(a).add(b);
            g.get(b).add(a);
        }

        int[] taDist = new int[n];
        Arrays.fill(taDist, -1);
        Queue<Integer> q = new LinkedList<>();
        q.add(ta);
        taDist[ta] = 0;
        while (!q.isEmpty()) {
            int u = q.poll();
            for (int v : g.get(u)) {
                if (taDist[v] == -1) {
                    taDist[v] = taDist[u] + 1;
                    q.add(v);
                }
            }
        }

        int[] aoDist = new int[n];
        Arrays.fill(aoDist, -1);
        q.add(ao);
        aoDist[ao] = 0;
        while (!q.isEmpty()) {
            int u = q.poll();
            for (int v : g.get(u)) {
                if (aoDist[v] == -1) {
                    aoDist[v] = aoDist[u] + 1;
                    q.add(v);
                }
            }
        }

        int res = 0;
        for (int i = 0; i < n; i++) {
            if (taDist[i] <= aoDist[i] && aoDist[i] > res) {
                res = aoDist[i];
            }
        }
        System.out.println(res - 1);
    }
}

