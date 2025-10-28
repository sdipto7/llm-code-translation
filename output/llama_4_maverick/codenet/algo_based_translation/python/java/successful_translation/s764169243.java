
import java.util.Scanner;

public class s764169243 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = scanner.nextInt();
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

    static class SegmentTree {
        int size;
        int defaultVal;
        int[] seg;

        public SegmentTree(int size, int defaultVal) {
            this.size = 1 << (int) Math.ceil(Math.log(size) / Math.log(2));
            this.defaultVal = defaultVal;
            this.seg = new int[2 * this.size - 1];
            for (int i = 0; i < 2 * this.size - 1; i++) {
                seg[i] = defaultVal;
            }
        }

        int segfunc(int x, int y) {
            return Math.max(x, y);
        }

        void update(int k, int x) {
            k += size - 1;
            seg[k] = x;
            while (k > 0) {
                k = (k - 1) / 2;
                seg[k] = segfunc(seg[2 * k + 1], seg[2 * k + 2]);
            }
        }

        int query(int p, int q) {
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
                p = p / 2;
                q = (q - 1) / 2;
            }
            ret = segfunc(segfunc(ret, seg[p]), seg[q]);
            return ret;
        }

        void segPrint() {
            for (int num : seg) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}

