
import java.io.*;
import java.util.*;

public class atcoder_ABC107_D {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        List<Integer> list = new ArrayList<>();
        for (int num : a) {
            list.add(num);
        }
        list.add(0);
        TreeSet<Integer> set = new TreeSet<>(list);
        List<Integer> _a = new ArrayList<>(set);
        Map<Integer, Integer> d = new HashMap<>();
        for (int i = 0; i < _a.size(); i++) {
            d.put(_a.get(i), i);
        }
        int[] compressedA = new int[n];
        for (int i = 0; i < n; i++) {
            compressedA[i] = d.get(a[i]);
        }

        long m = ((long) n * (n + 1)) / 4;

        int[] t = {_a.size(), 0};
        while (t[0] - t[1] > 1) {
            int mid = (t[0] + t[1]) / 2;
            if (check(mid, compressedA, m)) {
                t[1] = mid;
            } else {
                t[0] = mid;
            }
        }

        System.out.println(_a.get(t[1]));
    }

    private static boolean check(int X, int[] a, long m) {
        int n = a.length;
        int[] b = new int[n + 1];
        for (int i = 0; i < n; i++) {
            b[i + 1] = b[i] + (a[i] >= X ? 1 : -1);
        }

        int minB = Integer.MAX_VALUE;
        for (int num : b) {
            if (num < minB) minB = num;
        }

        int maxB = 0;
        for (int i = 0; i < b.length; i++) {
            b[i] -= minB;
            if (b[i] > maxB) maxB = b[i];
        }

        BIT bit = new BIT(maxB + 2);
        long ans = 0;
        for (int num : b) {
            ans += bit.bitsum(num + 1);
            bit.bitadd(num, 1);
        }

        return ans >= m;
    }

    static class BIT {
        private final int size;
        private final int[] tree;

        public BIT(int N) {
            this.size = N;
            tree = new int[N + 1];
        }

        private int bitsum(int i) {
            int ret = 0;
            while (i > 0) {
                ret += tree[i];
                i ^= i & -i;
            }
            return ret;
        }

        public int bitsum(int l, int r) {
            return bitsum(r) - bitsum(l);
        }

        public void bitadd(int i, int x) {
            i += 1;
            while (i <= size) {
                tree[i] += x;
                i += i & -i;
            }
        }
    }
}

