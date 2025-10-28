
import java.util.*;

class BIT {
    int size;
    int[] tree;

    BIT(int N) {
        this.size = N;
        this.tree = new int[N + 1];
    }

    int _bitsum(int i) {
        int ret = 0;
        while (i > 0) {
            ret += tree[i];
            i ^= i & -i;
        }
        return ret;
    }

    int bitsum(int l, Integer r) {
        if (r == null) {
            return _bitsum(l);
        } else {
            return _bitsum(r) - _bitsum(l);
        }
    }

    void bitadd(int i, int x) {
        i += 1;
        while (i <= size) {
            tree[i] += x;
            i += i & -i;
        }
    }
}

public class atcoder_ABC107_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = n * (n + 1) / 4;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        Map<Integer, Integer> d = new HashMap<>();
        Set<Integer> set = new TreeSet<>(Arrays.asList(a));
        set.add(0);
        int index = 0;
        for (int x : set) {
            d.put(x, index++);
        }
        int[] _a = set.stream().mapToInt(Integer::intValue).toArray();
        for (int i = 0; i < n; i++) {
            a[i] = d.get(a[i]);
        }
        int[] t = {len(_a), 0};
        while (t[0] - t[1] > 1) {
            int mid = (t[0] + t[1]) / 2;
            if (check(mid, a, m)) {
                t[0] = mid;
            } else {
                t[1] = mid;
            }
        }
        System.out.println(_a[t[1]]);
    }

    private static boolean check(int X, int[] a, int m) {
        int[] b = new int[a.length + 1];
        for (int i = 0; i < a.length; i++) {
            b[i + 1] = (a[i] >= X ? 2 : -1) + b[i];
        }
        int c = Arrays.stream(b).min().orElse(0);
        for (int i = 0; i < b.length; i++) {
            b[i] -= c;
        }
        BIT bit = new BIT(Arrays.stream(b).max().orElse(0) + 2);
        int ans = 0;
        for (int x : b) {
            ans += bit.bitsum(x + 1, null);
            bit.bitadd(x, 1);
        }
        return ans >= m;
    }

    private static int len(int[] array) {
        return array.length;
    }
}

