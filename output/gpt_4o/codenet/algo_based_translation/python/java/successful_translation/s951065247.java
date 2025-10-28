
import java.util.Scanner;

public class s951065247 {

    private static int N;
    private static int A;
    private static int B;
    private static int C;
    private static int[] l;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        A = scanner.nextInt();
        B = scanner.nextInt();
        C = scanner.nextInt();
        l = new int[N];
        for (int i = 0; i < N; i++) {
            l[i] = scanner.nextInt();
        }
        scanner.close();
        
        System.out.println(dfs(0, 0, 0, 0));
    }

    private static int dfs(int cur, int a, int b, int c) {
        if (cur == N) {
            if (Math.min(Math.min(a, b), c) > 0) {
                return Math.abs(A - a) + Math.abs(B - b) + Math.abs(C - c) - 30;
            } else {
                return 1000000000;
            }
        }

        int noAdd = dfs(cur + 1, a, b, c);
        int addA = dfs(cur + 1, a + l[cur], b, c) + 10;
        int addB = dfs(cur + 1, a, b + l[cur], c) + 10;
        int addC = dfs(cur + 1, a, b, c + l[cur]) + 10;

        return Math.min(Math.min(noAdd, addA), Math.min(addB, addC));
    }
}

