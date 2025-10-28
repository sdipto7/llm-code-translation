
import java.util.*;
import java.io.*;

public class atcoder_ABC165_C {
    static int res;
    
    public static void solve(int N, int M, int Q, List<Integer> a, List<Integer> b, List<Integer> c, List<Integer> d) {
        res = 0;
        rec(new ArrayList<>(), N, M, Q, a, b, c, d);
        System.out.println(res);
    }
    
    private static void rec(List<Integer> A, int N, int M, int Q, List<Integer> a, List<Integer> b, List<Integer> c, List<Integer> d) {
        if (A.size() == N) {
            int ans = 0;
            for (int i = 0; i < Q; i++) {
                if (A.get(b.get(i) - 1) - A.get(a.get(i) - 1) == c.get(i)) {
                    ans += d.get(i);
                }
            }
            res = Math.max(res, ans);
            return;
        }
        int lastMax = A.isEmpty() ? 1 : A.get(A.size() - 1);
        for (int i = lastMax; i <= M; i++) {
            List<Integer> newA = new ArrayList<>(A);
            newA.add(i);
            rec(newA, N, M, Q, a, b, c, d);
        }
    }
    
    public static void main(String[] args) {
        FastScanner scanner = new FastScanner();
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int Q = scanner.nextInt();
        List<Integer> a = new ArrayList<>(Q);
        List<Integer> b = new ArrayList<>(Q);
        List<Integer> c = new ArrayList<>(Q);
        List<Integer> d = new ArrayList<>(Q);
        for (int i = 0; i < Q; i++) {
            a.add(scanner.nextInt());
            b.add(scanner.nextInt());
            c.add(scanner.nextInt());
            d.add(scanner.nextInt());
        }
        solve(N, M, Q, a, b, c, d);
    }
    
    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;
        
        public FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        
        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}

