
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

    static long dfs(int cur, int a, int b, int c) {
        if (cur == N) {
            return (a != 0 || b != 0 || c != 0) ? Math.abs(A - a) + Math.abs(B - b) + Math.abs(C - c) - 30 : (long) 1e9;
        }
        long no_add = dfs(cur + 1, a, b, c);
        long add_a = dfs(cur + 1, a + l[cur], b, c) + 10;
        long add_b = dfs(cur + 1, a, b + l[cur], c) + 10;
        long add_c = dfs(cur + 1, a, b, c + l[cur]) + 10;
        return Math.min(Math.min(no_add, add_a), Math.min(add_b, add_c));
    }
}

