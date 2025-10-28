
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class s124725275 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int H = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int si = Integer.parseInt(st.nextToken()) - 1;
        int sj = Integer.parseInt(st.nextToken()) - 1;
        st = new StringTokenizer(br.readLine());
        int ti = Integer.parseInt(st.nextToken()) - 1;
        int tj = Integer.parseInt(st.nextToken()) - 1;

        int[][] S = new int[H][W];
        for (int i = 0; i < H; i++) {
            String line = br.readLine();
            for (int j = 0; j < W; j++) {
                S[i][j] = line.charAt(j) == '#' ? 1 : 0;
            }
        }

        int[][] D = new int[H][W];
        for (int[] row : D) {
            Arrays.fill(row, -1);
        }
        Deque<int[]> que = new ArrayDeque<>();
        que.addFirst(new int[]{0, si, sj});
        int[][] directions = {
                {-2, -2}, {-2, -1}, {-2, 0}, {-2, 1}, {-2, 2},
                {-1, -2}, {-1, -1}, {-1, 0}, {-1, 1}, {-1, 2},
                {0, -2}, {0, -1}, {0, 0}, {0, 1}, {0, 2},
                {1, -2}, {1, -1}, {1, 0}, {1, 1}, {1, 2},
                {2, -2}, {2, -1}, {2, 0}, {2, 1}, {2, 2}
        };

        while (!que.isEmpty()) {
            int[] current = que.pollFirst();
            int c = current[0];
            int i = current[1];
            int j = current[2];
            if (D[i][j] != -1) {
                continue;
            }
            D[i][j] = c;
            for (int[] dir : directions) {
                int ni = i + dir[0];
                int nj = j + dir[1];
                if (ni >= 0 && ni < H && nj >= 0 && nj < W && D[ni][nj] == -1 && S[ni][nj] == 0) {
                    if (Math.abs(dir[0]) + Math.abs(dir[1]) == 1) {
                        que.addFirst(new int[]{c, ni, nj});
                    } else {
                        que.addLast(new int[]{c + 1, ni, nj});
                    }
                }
            }
        }
        System.out.println(D[ti][tj]);
    }
}

