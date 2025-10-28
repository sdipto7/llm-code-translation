
import java.util.Scanner;
import java.util.Arrays;

public class atcoder_AGC038_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int W = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        solve(H, W, A, B);
        scanner.close();
    }

    public static void solve(int H, int W, int A, int B) {
        char[][] answer = new char[H][W];
        for (int i = 0; i < H; i++) {
            Arrays.fill(answer[i], '0');
        }
        
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (i < B) {
                    answer[i][j] = (j < A) ? '0' : '1';
                } else {
                    answer[i][j] = (j < A) ? '1' : '0';
                }
            }
        }
        
        for (int i = 0; i < H; i++) {
            System.out.println(new String(answer[i]));
        }
    }
}

