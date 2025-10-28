
import java.util.Scanner;

class SegmentTree {
    int size;
    int defaultVal;
    int[] seg;

    SegmentTree(int size, int defaultVal) {
        this.size = 1 << (size - 1).bitLength();
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
        k += this.size - 1;
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
        p += this.size - 1;
        q += this.size - 2;
        int ret = defaultVal;
        while (q - p > 1) {
            if ((p & 1) == 0) {
                ret = segfunc(ret, seg[p]);
            }
            if ((q & 1) == 1) {
                ret = segfunc(ret, seg[q]);
                q -= 1;
            }
            p = p / 2;
            q = (q - 1) / 2;
        }
        ret = segfunc(segfunc(ret, seg[p]), seg[q]);
        return ret;
    }
}

public class s764169243 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        int[] ans = new int[N];
        for (int i = 0; i < N; i++) {
            ans[i] = i + 1;
        }
        SegmentTree leftSeg = new SegmentTree(N, 0);
        for (int i = 0; i < N; i++) {
            ans[a[i] - 1] *= i + 1 - leftSeg.query(0, a[i]);
            leftSeg.update(a[i] - 1, i + 1);
        }
        SegmentTree rightSeg = new SegmentTree(N, 0);
        for (int i = 0; i < N; i++) {
            int num = a[N - 1 - i];
            ans[num - 1] *= i + 1 - rightSeg.query(0, num);
            rightSeg.update(num - 1, i + 1);
        }
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += ans[i];
        }
        System.out.println(sum);
    }
}

