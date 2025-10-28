
import java.util.Scanner;

public class s951065247 {
    static int N, A, B, C;
    static int[] l;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        l = new int[N];
        for (int i = 0; i < N; i++) {
            l[i] = sc.nextInt();
        }
        System.out.println(dfs(0, 0, 0, 0));
    }

    static int dfs(int cur, int a, int b, int c) {
        if (cur == N) {
            if (a > 0 && b > 0 && c > 0) {
                return Math.abs(A - a) + Math.abs(B - b) + Math.abs(C - c) - 30;
            } else {
                return 1000000000;
            }
        }
        int current = l[cur];
        int option1 = dfs(cur + 1, a, b, c);
        int option2 = dfs(cur + 1, a + current, b, c) + 10;
        int option3 = dfs(cur + 1, a, b + current, c) + 10;
        int option4 = dfs(cur + 1, a, b, c + current) + 10;
        return Math.min(Math.min(option1, option2), Math.min(option3, option4));
    }
}

