
import java.util.*;

class BIT {
    int size;
    int[] tree;
    int depth;

    public BIT(int N) {
        this.size = N;
        this.tree = new int[N + 1];
        this.depth = Integer.bitCount(N);
    }

    private int _bitSum(int i) {
        int ret = 0;
        while (i > 0) {
            ret += tree[i];
            i ^= i & -i;
        }
        return ret;
    }

    public int bitSum(int l, int r) {
        if (r < 0) return _bitSum(l);
        return _bitSum(r) - _bitSum(l);
    }

    public void bitAdd(int i, int x) {
        i++;
        while (i <= size) {
            tree[i] += x;
            i += i & -i;
        }
    }
}

public class atcoder_ABC107_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n * (n + 1) / 4;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Map<Integer, Integer> d = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        set.add(0);
        for (int num : a) {
            set.add(num);
        }
        List<Integer> sorted = new ArrayList<>(set);
        Collections.sort(sorted);
        for (int i = 0; i < sorted.size(); i++) {
            d.put(sorted.get(i), i);
        }
        for (int i = 0; i < n; i++) {
            a[i] = d.get(a[i]);
        }

        int[] t = {sorted.size(), 0};
        while (t[0] - t[1] > 1) {
            int mid = (t[0] + t[1]) / 2;
            if (check(mid, a, n, m)) {
                t[0] = mid;
            } else {
                t[1] = mid;
            }
        }
        System.out.println(sorted.get(t[1]));
    }

    static boolean check(int X, int[] a, int n, int m) {
        int[] b = new int[n + 1];
        b[0] = 0;
        for (int i = 0; i < n; i++) {
            b[i + 1] = b[i] + (a[i] >= X ? 1 : -1);
        }
        int min = Arrays.stream(b).min().getAsInt();
        for (int i = 0; i <= n; i++) {
            b[i] -= min;
        }
        BIT bit = new BIT(Arrays.stream(b).max().getAsInt() + 2);
        long ans = 0;
        for (int x : b) {
            ans += bit.bitSum(-1, x + 1);
            bit.bitAdd(x, 1);
        }
        return ans >= m;
    }
}

