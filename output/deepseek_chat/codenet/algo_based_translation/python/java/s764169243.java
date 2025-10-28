
import java.util.*;
import java.io.*;

public class s764169243 {
    static class SegmentTree {
        int size;
        int defaultVal;
        int[] seg;
        
        SegmentTree(int size, int defaultVal) {
            this.size = 1 << (32 - Integer.numberOfLeadingZeros(size - 1));
            this.defaultVal = defaultVal;
            this.seg = new int[2 * this.size - 1];
            Arrays.fill(this.seg, defaultVal);
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
                if (p % 2 == 0) {
                    ret = segfunc(ret, seg[p]);
                }
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
        
        void segPrint() {
            System.out.println(Arrays.toString(seg));
        }
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] a = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
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
            ans[num - 1] *= (i + 1) - leftSeg.query(0, num);
            leftSeg.update(num - 1, i + 1);
        }
        
        SegmentTree rightSeg = new SegmentTree(N, 0);
        for (int i = 0; i < N; i++) {
            int num = a[N - 1 - i];
            ans[num - 1] *= (i + 1) - rightSeg.query(0, num);
            rightSeg.update(num - 1, i + 1);
        }
        
        long sum = 0;
        for (long val : ans) {
            sum += val;
        }
        System.out.println(sum);
    }
}

