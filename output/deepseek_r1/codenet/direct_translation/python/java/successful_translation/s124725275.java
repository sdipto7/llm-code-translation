
import java.util.*;

public class s124725275 {
    static class Node {
        int cost, i, j;
        Node(int cost, int i, int j) {
            this.cost = cost;
            this.i = i;
            this.j = j;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int W = scanner.nextInt();

        int si = scanner.nextInt() - 1;
        int sj = scanner.nextInt() - 1;
        int ti = scanner.nextInt() - 1;
        int tj = scanner.nextInt() - 1;

        scanner.nextLine();

        int[][] S = new int[H][W];
        for (int i = 0; i < H; i++) {
            String line = scanner.nextLine().trim();
            for (int j = 0; j < W; j++) {
                S[i][j] = line.charAt(j) == '#' ? 1 : 0;
            }
        }

        int[][] D = new int[H][W];
        for (int[] row : D) {
            Arrays.fill(row, -1);
        }

        Deque<Node> deque = new LinkedList<>();
        deque.add(new Node(0, si, sj));

        while (!deque.isEmpty()) {
            Node node = deque.poll();
            int c = node.cost;
            int i = node.i;
            int j = node.j;

            if (D[i][j] != -1) continue;
            D[i][j] = c;

            for (int di = -2; di <= 2; di++) {
                for (int dj = -2; dj <= 2; dj++) {
                    int ni = i + di;
                    int nj = j + dj;

                    if (ni < 0 || ni >= H || nj < 0 || nj >= W) continue;
                    if (D[ni][nj] != -1) continue;
                    if (ni == 0 && nj == 0) continue;
                    if (S[ni][nj] == 1) continue;

                    boolean isWalk = (di == 0 && Math.abs(dj) == 1) || (dj == 0 && Math.abs(di) == 1);
                    Node nextNode = new Node(isWalk ? c : c + 1, ni, nj);
                    if (isWalk) deque.addFirst(nextNode);
                    else deque.addLast(nextNode);
                }
            }
        }

        System.out.println(D[ti][tj]);
    }
}

