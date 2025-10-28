
import java.util.Scanner;

public class atcoder_AGC002_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[][] balls = new int[N][2];
        
        for (int i = 0; i < N; i++) {
            balls[i][0] = 1;
            balls[i][1] = 0;
        }
        balls[0][0] = 0;
        balls[0][1] = 1;
        
        for (int i = 0; i < M; i++) {
            int x = scanner.nextInt() - 1;
            int y = scanner.nextInt() - 1;
            int wX = balls[x][0];
            int rX = balls[x][1];
            
            if (wX >= 1 && rX >= 1) {
                balls[x][0]--;
                balls[y][1]++;
            } else if (wX == 0) {
                balls[x][1]--;
                balls[y][1]++;
            } else {
                balls[x][0]--;
                balls[y][0]++;
            }
        }
        
        int ans = 0;
        for (int[] ball : balls) {
            if (ball[1] > 0) {
                ans++;
            }
        }
        System.out.println(ans);
        scanner.close();
    }
}

