
import java.util.*;
import java.io.*;

public class atcoder_AGC004_D {
    static final int MAX_RECURSION = 1000000;
    static int n, k;
    static Set<Integer>[] links;

    public static void main(String[] args) throws IOException {
        Reader in = new Reader();
        n = in.nextInt();
        k = in.nextInt();
        int[] aaa = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            aaa[i] = in.nextInt();
        }
        links = new Set[n];
        for (int i = 0; i < n; i++) {
            links[i] = new HashSet<>();
        }
        for (int i = 0; i < n - 1; i++) {
            links[aaa[i] - 1].add(i + 1);
        }
        int[] res = dfs(0, 0);
        int ans = res[1];
        if (aaa[0] != 1) {
            ans++;
        }
        System.out.println(ans);
    }

    static int[] dfs(int v, int p) {
        int height_from_leaf = 0;
        int cut_count = 0;
        for (int u : links[v]) {
            if (u == p) {
                continue;
            }
            int[] res = dfs(u, v);
            height_from_leaf = Math.max(height_from_leaf, res[0]);
            cut_count += res[1];
        }
        height_from_leaf++;
        if (p != 0 && height_from_leaf == k) {
            height_from_leaf = 0;
            cut_count++;
        }
        return new int[]{height_from_leaf, cut_count};
    }

    static class Reader {
        final int SIZE = 1 << 13;
        byte[] buffer = new byte[SIZE];
        int index, size;

        int nextInt() throws IOException {
            int n = 0;
            byte c;
            boolean negative = false;
            while ((c = read()) <= 32);
            if (c == '-') {
                negative = true;
                c = read();
            }
            do n = (n << 3) + (n << 1) + (c & 15);
            while (isNumber(c = read()));
            return negative ? ~n + 1 : n;
        }

        byte read() throws IOException {
            if (index == size) {
                size = System.in.read(buffer, index = 0, SIZE);
                if (size < 0) buffer[0] = -1;
            }
            return buffer[index++];
        }

        boolean isNumber(byte c) {
            return 47 < c && c < 58;
        }
    }
}

