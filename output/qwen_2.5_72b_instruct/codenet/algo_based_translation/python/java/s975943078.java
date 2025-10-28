
import java.util.*;

public class s975943078 {
    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = (scanner.nextInt() % K - 1 + K) % K;
        }
        int[] sum_A = new int[N + 1];
        int count = 0;
        Map<Integer, List<Integer>> modK = new HashMap<>();
        modK.put(0, new ArrayList<>(Arrays.asList(0)));

        for (int i = 0; i < N; i++) {
            sum_A[i + 1] = (sum_A[i] + A[i]) % K;
            if (!modK.containsKey(sum_A[i + 1])) {
                modK.put(sum_A[i + 1], new ArrayList<>(Arrays.asList(i + 1)));
            } else {
                modK.get(sum_A[i + 1]).add(i + 1);
            }
        }

        for (int key : modK.keySet()) {
            List<Integer> indices = modK.get(key);
            int lenK = indices.size();
            for (int i = 0; i < lenK; i++) {
                int a = indices.get(i);
                int index = bisectLeft(indices, a + K, i, lenK);
                count += index - i - 1;
            }
        }

        System.out.println(count);
    }

    public static int bisectLeft(List<Integer> list, int value, int lo, int hi) {
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (list.get(mid) < value) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        return lo;
    }
}

