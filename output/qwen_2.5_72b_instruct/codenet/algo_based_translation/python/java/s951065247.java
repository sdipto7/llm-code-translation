
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class s951065247 {
    static int N, A, B, C;
    static List<Integer> l;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        A = scanner.nextInt();
        B = scanner.nextInt();
        C = scanner.nextInt();
        l = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            l.add(scanner.nextInt());
        }
        System.out.println(dfs(0, 0, 0, 0));
    }

    static int dfs(int cur, int a, int b, int c) {
        if (cur == N) {
            if (Math.min(a, Math.min(b, c)) > 0) {
                return Math.abs(A - a) + Math.abs(B - b) + Math.abs(C - c) - 30;
            } else {
                return 1000000000;
            }
        } else {
            int no_add = dfs(cur + 1, a, b, c);
            int add_a = dfs(cur + 1, a + l.get(cur), b, c) + 10;
            int add_b = dfs(cur + 1, a, b + l.get(cur), c) + 10;
            int add_c = dfs(cur + 1, a, b, c + l.get(cur)) + 10;
            return Math.min(no_add, Math.min(add_a, Math.min(add_b, add_c)));
        }
    }
}

