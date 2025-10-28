
import java.io.*;
import java.util.*;

public class s124725275 {
    static final int MOD = (int) (1e9 + 7);
    static final int INF = (1 << 31) - 1;

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

    static int[][] readMapAs(int H, Map<Character, Integer> replace) {
        int[][] grid = new int[H][];
        for (int i = 0; i < H; i++) {
            String line = new FastReader().nextLine().trim();
            int[] row = new int[line.length()];
            for (int j = 0; j < line.length(); j++) {
                row[j] = replace.getOrDefault(line.charAt(j), 0);
            }
            grid[i] = row;
        }
        return grid;
    }

    static void zeroOneBFS(int[][] grid, int si, int sj, int[][] D) {
        int H = grid.length;
        int W = grid[0].length;
        Deque<int[]> que = new ArrayDeque<>();
        que.addFirst(new int[] { 0, si, sj });
        while (!que.isEmpty()) {
            int[] arr = que.removeFirst();
            int c = arr[0], i = arr[1], j = arr[2];
            if (D[i][j] != -1) continue;
            D[i][j] = c;
            for (int di = -2; di <= 2; di++) {
                for (int dj = -2; dj <= 2; dj++) {
                    int ni = i + di, nj = j + dj;
                    if (ni >= 0 && ni < H && nj >= 0 && nj < W && D[ni][nj] == -1 && grid[ni][nj] != 1) {
                        if ((Math.abs(di) + Math.abs(dj)) == 1) {
                            que.addFirst(new int[] { c, ni, nj });
                        } else {
                            que.addLast(new int[] { c + 1, ni, nj });
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int H = fr.nextInt();
        int W = fr.nextInt();
        int si = fr.nextInt() - 1;
        int sj = fr.nextInt() - 1;
        int ti = fr.nextInt() - 1;
        int tj = fr.nextInt() - 1;

        Map<Character, Integer> replace = new HashMap<>();
        replace.put('#', 1);
        replace.put('.', 0);
        int[][] S = readMapAs(H, replace);

        int[][] D = new int[H][W];
        for (int[] row : D) {
            Arrays.fill(row, -1);
        }

        zeroOneBFS(S, si, sj, D);
        System.out.println(D[ti][tj]);
    }
}

