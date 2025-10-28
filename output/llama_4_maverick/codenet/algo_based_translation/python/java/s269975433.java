
import java.util.*;
import java.io.*;

public class s269975433 {
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
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    static void combinationUtil(int[] arr, int n, int r, int index, int[] data, int i, List<List<Integer>> result) {
        if (index == r) {
            List<Integer> temp = new ArrayList<>();
            for (int j = 0; j < r; j++) {
                temp.add(data[j]);
            }
            result.add(temp);
            return;
        }
        if (i >= n) {
            return;
        }
        data[index] = arr[i];
        combinationUtil(arr, n, r, index + 1, data, i, result);
        combinationUtil(arr, n, r, index, data, i + 1, result);
    }

    static List<List<Integer>> combinationsWithReplacement(int n, int r) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        int[] data = new int[r];
        List<List<Integer>> result = new ArrayList<>();
        combinationUtil(arr, n, r, 0, data, 0, result);
        return result;
    }

    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int N = fr.nextInt();
        int M = fr.nextInt();
        int Q = fr.nextInt();

        int[][] Q_groups = new int[Q][4];
        for (int i = 0; i < Q; i++) {
            for (int j = 0; j < 4; j++) {
                Q_groups[i][j] = fr.nextInt();
            }
        }

        int max_score = 0;
        List<List<Integer>> combinations = combinationsWithReplacement(M, N);
        for (List<Integer> p : combinations) {
            int temp_score = 0;
            for (int[] q : Q_groups) {
                if (p.get(q[1] - 1) - p.get(q[0] - 1) == q[2]) {
                    temp_score += q[3];
                }
            }
            max_score = Math.max(max_score, temp_score);
        }

        System.out.println(max_score);
    }
}

