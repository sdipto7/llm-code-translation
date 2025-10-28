
import java.util.Scanner;

class SegmentTree {
    private int size;
    private int defaultVal;
    private int[] seg;

    public SegmentTree(int size, int defaultVal) {
        this.size = 1 << ((size - 1).bitLength());
        this.defaultVal = defaultVal;
        this.seg = new int[2 * this.size - 1];
    }

    private int segfunc(int x, int y) {
        return Math.max(x, y);
    }

    public void update(int k, int x) {
        k += this.size - 1;
        seg[k] = x;
        while (k > 0) {
            k = (k - 1) / 2;
            seg[k] = segfunc(seg[2 * k + 1], seg[2 * k + 2]);
        }
    }

    public int query(int p, int q) {
        if (q <= p) {
            return defaultVal;
        }
        p += this.size - 1;
        q += this.size - 2;
        int ret = defaultVal;
        while (q - p > 1) {
            if ((p & 1) == 0) {
                ret = segfunc(ret, seg[p]);
            }
            if ((q & 1) == 1) {
                ret = segfunc(ret, seg[q]);
                q--;
            }
            p /= 2;
            q = (q - 1) / 2;
        }
        ret = segfunc(segfunc(ret, seg[p]), seg[q]);
        return ret;
    }

    public void seg_print() {
        for (int i : seg) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

public class s764169243 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = scanner.nextInt();
        }
        int[] ans = new int[N];
        for (int i = 0; i < N; i++) {
            ans[i] = i + 1;
        }
        SegmentTree left_seg = new SegmentTree(N, 0);
        for (int i = 0; i < N; i++) {
            int num = a[i];
            ans[num - 1] *= i + 1 - left_seg.query(0, num);
            left_seg.update(num - 1, i + 1);
        }
        SegmentTree right_seg = new SegmentTree(N, 0);
        for (int i = 0; i < N; i++) {
            int num = a[N - 1 - i];
            ans[num - 1] *= i + 1 - right_seg.query(0, num);
            right_seg.update(num - 1, i + 1);
        }
        int result = 0;
        for (int i : ans) {
            result += i;
        }
        System.out.println(result);
        scanner.close();
    }
}

