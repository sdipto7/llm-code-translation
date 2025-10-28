import java.util.*;
import java.io.*;

class Main {
    static class SegmentTree {
        int size;
        long[] seg;
        long defaultVal;

        SegmentTree(int size, long defaultVal) {
            this.size = Integer.highestOneBit(size) << 1;
            this.defaultVal = defaultVal;
            this.seg = new long[2 * this.size - 1];
            Arrays.fill(this.seg, defaultVal);
        }

        long segfunc(long x, long y) {
            return Math.max(x, y);
        }

        void update(int k, long x) {
            k += size - 1;
            seg[k] = x;
            while (k > 0) {
                k = (k - 1) / 2;
                seg[k] = segfunc(seg[2 * k + 1], seg[2 * k + 2]);
            }
        }

        long query(int p, int q) {
            if (q <= p) return defaultVal;
            p += size - 1;
            q += size - 2;
            long ret = defaultVal;
            while (q - p > 1) {
                if ((p & 1) == 0) ret = segfunc(ret, seg[p]);
                if ((q & 1) == 1) {
                    ret = segfunc(ret, seg[q]);
                    q--;
                }
                p = p / 2;
                q = (q - 1) / 2;
            }
            ret = segfunc(ret, segfunc(ret, seg[p]));
            return ret;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        long[] ans = new long[N];
        for (int i = 0; i < N; i++) {
            ans[i] = i + 1;
        }
        SegmentTree leftSeg = new SegmentTree(N, 0);
        for (int i = 0; i < N; i++) {
            int num = a[i];
            ans[num - 1] *= (i + 1 - leftSeg.query(0, num));
            leftSeg.update(num - 1, i + 1);
        }
        SegmentTree rightSeg = new SegmentTree(N, 0);
        for (int i = N - 1; i >= 0; i--) {
            int num = a[i];
            ans[num - 1] *= (N - i - rightSeg.query(0, num));
            rightSeg.update(num - 1, N - i);
        }
        long sum = 0;
        for (long num : ans) {
            sum += num;
        }
        System.out.println(sum);
    }
}
