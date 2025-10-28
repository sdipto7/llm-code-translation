
import java.util.*;

class BIT {
    int size;
    int[] tree;
    int depth;

    BIT(int N) {
        this.size = N;
        this.tree = new int[N + 1];
        this.depth = Integer.toBinaryString(N).length();
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
        Set<Integer> set = new TreeSet<>();
        set.add(0);
        for (int x : a) {
            set.add(x);
        }
        int index = 0;
        for (int x : set) {
            d.put(x, index++);
        }
        int[] _a = new int[set.size()];
        index = 0;
        for (int x : set) {
            _a[index++] = x;
        }
        a = Arrays.stream(a).map(d::get).toArray();
        int[] t = {set.size(), 0};
        while (t[0] - t[1] > 1) {
            int mid = (t[0] + t[1]) / 2;
            t[check(mid, a, n, m) ? 0 : 1] = mid;
        }
        System.out.println(_a[t[1]]);
    }

    static boolean check(int X, int[] a, int n, int m) {
        int[] b = new int[n + 1];
        for (int i = 0; i < n; i++) {
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
}

