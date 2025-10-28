
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class s764169243 {

    static class SegmentTree {
        private int size;
        private int defaultValue;
        private int[] seg;

        public SegmentTree(int size, int defaultValue) {
            this.size = 1;
            while (this.size < size) this.size *= 2;
            this.defaultValue = defaultValue;
            this.seg = new int[2 * this.size - 1];
            for (int i = 0; i < seg.length; i++) {
                seg[i] = defaultValue;
            }
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
            if (q <= p) return this.defaultValue;
            p += this.size - 1;
            q += this.size - 2;
            int ret = this.defaultValue;
            while (q - p > 1) {
                if (p % 2 == 0) ret = segfunc(ret, seg[p]);
                if (q % 2 == 1) {
                    ret = segfunc(ret, seg[q]);
                    q--;
                }
                p = p / 2;
                q = (q - 1) / 2;
            }
            ret = segfunc(segfunc(ret, seg[p]), seg[q]);
            return ret;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());
        int[] a = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine().trim());
        for (int i = 0; i < N; i++) {
            a[i] = Integer.parseInt(st.nextToken());
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
        for (int value : ans) {
            result += value;
        }
        System.out.println(result);
    }
}

