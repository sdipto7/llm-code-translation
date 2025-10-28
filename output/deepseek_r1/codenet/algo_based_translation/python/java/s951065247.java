
import java.util.Scanner;

public class s951065247 {
    private static int N, A, B, C;
    private static int[] l;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] firstLine = scanner.nextLine().split(" ");
        N = Integer.parseInt(firstLine[0]);
        A = Integer.parseInt(firstLine[1]);
        B = Integer.parseInt(firstLine[2]);
        C = Integer.parseInt(firstLine[3]);
        l = new int[N];
        for (int i = 0; i < N; i++) {
            l[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(dfs(0, 0, 0, 0));
    }

    private static int dfs(int cur, int a, int b, int c) {
        if (cur == N) {
            if (a > 0 && b > 0 && c > 0) {
                return Math.abs(A - a) + Math.abs(B - b) + Math.abs(C - c) - 30;
            } else {
                return 1000000000;
            }
        }
        int noAdd = dfs(cur + 1, a, b, c);
        int addA = dfs(cur + 1, a + l[cur], b, c) + 10;
        int addB = dfs(cur + 1, a, b + l[cur], c) + 10;
        int addC = dfs(cur + 1, a, b, c + l[cur]) + 10;
        return Math.min(Math.min(Math.min(noAdd, addA), addB), addC);
    }
}

