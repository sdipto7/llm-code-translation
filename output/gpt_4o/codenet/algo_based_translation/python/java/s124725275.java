
import java.io.*;
import java.util.*;

public class s124725275 {

    static final int MOD = 1000000007;
    static final int INF = (1 << 31) - 1;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(reader.readLine());
        int H = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(reader.readLine());
        int si = Integer.parseInt(st.nextToken()) - 1;
        int sj = Integer.parseInt(st.nextToken()) - 1;
        
        st = new StringTokenizer(reader.readLine());
        int ti = Integer.parseInt(st.nextToken()) - 1;
        int tj = Integer.parseInt(st.nextToken()) - 1;

        int[][] S = new int[H][W];
        for (int i = 0; i < H; i++) {
            String line = reader.readLine();
            for (int j = 0; j < W; j++) {
                S[i][j] = (line.charAt(j) == '#') ? 1 : 0;
            }
        }

        int[][] D = new int[H][W];
        for (int[] row : D) {
            Arrays.fill(row, -1);
        }

        Deque<int[]> que = new ArrayDeque<>();
        que.add(new int[] {0, si, sj});

        while (!que.isEmpty()) {
            int[] current = que.poll();
            int c = current[0];
            int i = current[1];
            int j = current[2];

            if (D[i][j] != -1)
                continue;
            D[i][j] = c;

            for (int di = -2; di <= 2; di++) {
                for (int dj = -2; dj <= 2; dj++) {
                    int ni = i + di;
                    int nj = j + dj;
                    if (ni < 0 || ni >= H || nj < 0 || nj >= W || D[ni][nj] != -1 || (ni == 0 && nj == 0) || S[ni][nj] == 1)
                        continue;
                    if ((di == 0 && Math.abs(dj) == 1) || (dj == 0 && Math.abs(di) == 1)) {
                        que.addFirst(new int[] {c, ni, nj});
                    } else {
                        que.add(new int[] {c + 1, ni, nj});
                    }
                }
            }
        }

        System.out.println(D[ti][tj]);
    }
}

