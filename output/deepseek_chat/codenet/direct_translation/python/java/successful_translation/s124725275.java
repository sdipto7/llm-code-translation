
import java.util.ArrayDeque;
import java.util.Scanner;

public class s124725275 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int si = sc.nextInt() - 1;
        int sj = sc.nextInt() - 1;
        int ti = sc.nextInt() - 1;
        int tj = sc.nextInt() - 1;

        int[][] S = new int[H][W];
        for (int i = 0; i < H; i++) {
            String line = sc.next();
            for (int j = 0; j < W; j++) {
                S[i][j] = line.charAt(j) == '#' ? 1 : 0;
            }
        }

        int[][] D = new int[H][W];
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                D[i][j] = -1;
            }
        }

        ArrayDeque<int[]> que = new ArrayDeque<>();
        que.add(new int[]{0, si, sj});

        while (!que.isEmpty()) {
            int[] curr = que.poll();
            int c = curr[0];
            int i = curr[1];
            int j = curr[2];

            if (D[i][j] != -1) {
                continue;
            }
            D[i][j] = c;

            for (int di = -2; di <= 2; di++) {
                for (int dj = -2; dj <= 2; dj++) {
                    int ni = i + di;
                    int nj = j + dj;

                    if (ni < 0 || ni >= H || nj < 0 || nj >= W || D[ni][nj] != -1 || S[ni][nj] == 1) {
                        continue;
                    }

                    if ((di == 0 && Math.abs(dj) == 1) || (dj == 0 && Math.abs(di) == 1)) {
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

