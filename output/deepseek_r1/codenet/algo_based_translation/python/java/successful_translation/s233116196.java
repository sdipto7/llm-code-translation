
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Arrays;

public class s233116196 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        ArrayList<Integer>[] G = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            G[i] = new ArrayList<>();
        }
        for (int _i = 0; _i < M; _i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            G[a].add(b);
            G[b].add(a);
        }
        int[] col = new int[N + 1];
        Arrays.fill(col, -1);
        int cnt = 0;
        for (int i = 1; i <= N; i++) {
            if (col[i] == -1) {
                col[i] = cnt;
                Queue<Integer> que = new LinkedList<>();
                que.add(i);
                while (!que.isEmpty()) {
                    int x = que.poll();
                    for (int y : G[x]) {
                        if (col[y] == -1) {
                            col[y] = cnt;
                            que.add(y);
                        }
                    }
                }
                cnt++;
            }
        }
        int cmax = -1;
        for (int value : col) {
            if (value > cmax) {
                cmax = value;
            }
        }
        System.out.println(cmax);
    }
}

