
import java.util.*;

public class s591424993 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int g = sc.nextInt();
        List<int[]> pc = new ArrayList<>();
        for (int i = 0; i < d; i++) {
            int p = sc.nextInt();
            int c = sc.nextInt();
            pc.add(new int[]{p, c});
        }
        int ans = Integer.MAX_VALUE;
        for (int bit = 0; bit < (1 << d); bit++) {
            int count = 0;
            int sum = 0;
            TreeSet<Integer> nokori = new TreeSet<>();
            for (int j = 1; j <= d; j++) nokori.add(j);
            for (int i = 0; i < d; i++) {
                if ((bit & (1 << i)) != 0) {
                    int[] problem = pc.get(i);
                    sum += (i + 1) * 100 * problem[0] + problem[1];
                    count += problem[0];
                    nokori.remove(i + 1);
                }
            }
            if (sum < g) {
                if (!nokori.isEmpty()) {
                    int maxIdx = nokori.last();
                    int[] problem = pc.get(maxIdx - 1);
                    int pointsPerProblem = maxIdx * 100;
                    int remaining = g - sum;
                    int needed = (remaining + pointsPerProblem - 1) / pointsPerProblem;
                    needed = Math.min(needed, problem[0]);
                    count += needed;
                    sum += needed * pointsPerProblem;
                }
            }
            if (sum >= g) {
                ans = Math.min(ans, count);
            }
        }
        System.out.println(ans);
    }
}

