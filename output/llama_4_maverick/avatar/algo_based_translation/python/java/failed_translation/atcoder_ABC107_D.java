
public class atcoder_ABC107_D {
    static class BIT {
        int size;
        int[] tree;
        int depth;

        BIT(int N) {
            size = N;
            tree = new int[N + 1];
            depth = Integer.toBinaryString(N).length();
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

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int n = scanner.nextInt();
        int m = n * (n + 1) / 4;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        java.util.TreeSet<Integer> set = new java.util.TreeSet<>();
        for (int x : a) {
            set.add(x);
        }
        set.add(0);
        int[] _a = new int[set.size()];
        int idx = 0;
        java.util.HashMap<Integer, Integer> d = new java.util.HashMap<>();
        for (int x : set) {
            _a[idx] = x;
            d.put(x, idx++);
        }
        for (int i = 0; i < n; i++) {
            a[i] = d.get(a[i]);
        }

        boolean check(int X) {
            int[] b = new int[n + 1];
            b[0] = 0;
            for (int i = 0; i < n; i++) {
                b[i + 1] = b[i] + (a[i] >= X ? 1 : -1);
            }
            int c = Integer.MAX_VALUE;
            for (int x : b) {
                c = Math.min(c, x);
            }
            for (int i = 0; i <= n; i++) {
                b[i] -= c;
            }
            BIT bit = new BIT(getMax(b) + 2);
            int ans = 0;
            for (int x : b) {
                ans += bit.bitsum(x + 1, null);
                bit.bitadd(x, 1);
            }
            return ans >= m;
        }

        int[] t = new int[] { _a.length - 1, 0 };
        while (t[0] - t[1] > 1) {
            int mid = (t[0] + t[1]) / 2;
            if (check(mid)) {
                t[1] = mid;
            } else {
                t[0] = mid;
            }
        }
        System.out.println(_a[t[1]]);
    }

    static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }
}

