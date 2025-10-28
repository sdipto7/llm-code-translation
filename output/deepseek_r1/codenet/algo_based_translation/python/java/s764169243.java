
import java.io.*;
import java.util.*;

public class s764169243 {
    static class SegmentTree {
        private int size;
        private int[] seg;
        private int defaultVal;

        public SegmentTree(int size, int defaultVal) {
            this.defaultVal = defaultVal;
            this.size = 1;
            while (this.size < size) {
                this.size <<= 1;
            }
            seg = new int[2 * this.size - 1];
            Arrays.fill(seg, defaultVal);
        }

        private int segfunc(int x, int y) {
            return Math.max(x, y);
        }

        public void update(int k, int x) {
            k += size - 1;
            seg[k] = x;
            while (k > 0) {
                k = (k - 1) / 2;
                seg[k] = segfunc(seg[2*k+1], seg[2*k+2]);
            }
        }

        public int query(int p, int q) {
            if (q <= p) {
                return defaultVal;
            }
            p += size - 1;
            q += size - 2;
            int ret = defaultVal;
            while (q - p > 1) {
                if ((p & 1) == 0) {
                    ret = segfunc(ret, seg[p]);
                }
                if ((q & 1) == 1) {
                    ret = segfunc(ret, seg[q]);
                    q--;
                }
                p >>= 1;
                q = (q - 1) >> 1;
            }
            if (p == q) {
                ret = segfunc(ret, seg[p]);
            } else {
                ret = segfunc(segfunc(ret, seg[p]), seg[q]);
            }
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
            ans[num-1] *= (i + 1) - leftSeg.query(0, num);
            leftSeg.update(num-1, i+1);
        }

        SegmentTree rightSeg = new SegmentTree(N, 0);
        for (int i = 0; i < N; i++) {
            int num = a[N-1 - i];
            ans[num-1] *= (i + 1) - rightSeg.query(0, num);
            rightSeg.update(num-1, i+1);
        }

        long sum = 0;
        for (long val : ans) {
            sum += val;
        }
        System.out.println(sum);
    }
}

