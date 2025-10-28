import java.util.Scanner;

public class s951065247 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int[] l = new int[N];
        for (int i = 0; i < N; i++) {
            l[i] = scanner.nextInt();
        }
        System.out.println(dfs(0, 0, 0, 0, A, B, C, l));
    }

    public static int dfs(int cur, int a, int b, int c, int A, int B, int C, int[] l) {
        if (cur == l.length) {
            return Math.min(a, Math.min(b, c)) > 0 ? Math.abs(A - a) + Math.abs(B - b) + Math.abs(C - c) - 30 : 1000000000;
        }
        int no_add = dfs(cur + 1, a, b, c, A, B, C, l);
        int add_a = dfs(cur + 1, a + l[cur], b, c, A, B, C, l) + 10;
        int add_b = dfs(cur + 1, a, b + l[cur], c, A, B, C, l) + 10;
        int add_c = dfs(cur + 1, a, b, c + l[cur], A, B, C, l) + 10;
        return Math.min(no_add, Math.min(add_a, Math.min(add_b, add_c)));
    }
}
