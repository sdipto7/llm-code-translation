
import java.util.*;
import java.io.*;

public class atcoder_AGC002_B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int N = input[0];
        int M = input[1];
        
        int[][] balls = new int[N][2];
        for (int i = 0; i < N; i++) {
            balls[i][0] = 1;
            balls[i][1] = 0;
        }
        balls[0][0] = 0;
        balls[0][1] = 1;
        
        for (int i = 0; i < M; i++) {
            int[] xy = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int x = xy[0] - 1;
            int y = xy[1] - 1;
            
            int w_x = balls[x][0];
            int r_x = balls[x][1];
            int w_y = balls[y][0];
            int r_y = balls[y][1];
            
            if (w_x >= 1 && r_x >= 1) {
                balls[x][0] = w_x - 1;
                balls[y][1] = r_y + 1;
            } else if (w_x == 0) {
                balls[x][1] = r_x - 1;
                balls[y][1] = r_y + 1;
            } else {
                balls[x][0] = w_x - 1;
                balls[y][0] = w_y + 1;
            }
        }
        
        int ans = 0;
        for (int i = 0; i < N; i++) {
            if (balls[i][1] > 0) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}

