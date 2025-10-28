
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Iterator;

public class atcoder_AGC013_A {
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int N = sc.nextInt();
        List<Integer> A = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            A.add(sc.nextInt());
        }
        A = compressList(A);
        N = A.size();
        int i = 1;
        int ans = 0;
        while (i < N - 1) {
            if ((A.get(i - 1) < A.get(i) && A.get(i) > A.get(i + 1)) || (A.get(i - 1) > A.get(i) && A.get(i) < A.get(i + 1))) {
                ans++;
                i++;
            }
            i++;
        }
        System.out.println(ans + 1);
    }

    private static List<Integer> compressList(List<Integer> A) {
        if (A.isEmpty()) return A;
        List<Integer> compressed = new ArrayList<>();
        compressed.add(A.get(0));
        for (int i = 1; i < A.size(); i++) {
            if (!A.get(i).equals(A.get(i - 1))) {
                compressed.add(A.get(i));
            }
        }
        return compressed;
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (Exception e) {
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

