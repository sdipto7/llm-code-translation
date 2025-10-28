
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class atcoder_AGC002_B {
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int INF = (int) 1e9 + 7;
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] balls = new int[N][2];
        for (int i = 0; i < N; i++) {
            balls[i][0] = 1;
            balls[i][1] = 0;
        }
        balls[0][0] = 0;
        balls[0][1] = 1;
        for (int i = 0; i < M; i++) {
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;
            int w_x = balls[x][0];
            int r_x = balls[x][1];
            int w_y = balls[y][0];
            int r_y = balls[y][1];
            if (w_x >= 1 && r_x >= 1) {
                balls[x][0]--;
                balls[y][1]++;
            } else if (w_x == 0) {
                balls[x][1]--;
                balls[y][1]++;
            } else {
                balls[x][0]--;
                balls[y][0]++;
            }
        }
        int ans = 0;
        for (int i = 0; i < N; i++) {
            if (balls[i][1] != 0) {
                ans++;
            }
        }
        System.out.println(ans);
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

