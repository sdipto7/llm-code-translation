
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class s951065247 {
    static int N, A, B, C;
    static List<Integer> l;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        l = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            l.add(sc.nextInt());
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
        }
        int no_add = dfs(cur + 1, a, b, c);
        int add_a = dfs(cur + 1, a + l.get(cur), b, c) + 10;
        int add_b = dfs(cur + 1, a, b + l.get(cur), c) + 10;
        int add_c = dfs(cur + 1, a, b, c + l.get(cur)) + 10;
        return Math.min(Math.min(no_add, add_a), Math.min(add_b, add_c));
    }
}

