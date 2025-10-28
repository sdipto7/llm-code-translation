
import java.util.*;
import java.io.*;

public class s124725275 {
    static class Node {
        int c, i, j;
        Node(int c, int i, int j) {
            this.c = c;
            this.i = i;
            this.j = j;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int H = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        int si = Integer.parseInt(st.nextToken()) - 1;
        int sj = Integer.parseInt(st.nextToken()) - 1;
        
        st = new StringTokenizer(br.readLine());
        int ti = Integer.parseInt(st.nextToken()) - 1;
        int tj = Integer.parseInt(st.nextToken()) - 1;
        
        int[][] S = new int[H][W];
        for (int i = 0; i < H; i++) {
            String line = br.readLine();
            for (int j = 0; j < W; j++) {
                S[i][j] = line.charAt(j) == '#' ? 1 : 0;
            }
        }
        
        int[][] D = new int[H][W];
        for (int[] row : D) Arrays.fill(row, -1);
        Deque<Node> deque = new LinkedList<>();
        deque.add(new Node(0, si, sj));
        
        while (!deque.isEmpty()) {
            Node current = deque.pollFirst();
            if (D[current.i][current.j] != -1) continue;
            D[current.i][current.j] = current.c;
            
            for (int di = -2; di <= 2; di++) {
                for (int dj = -2; dj <= 2; dj++) {
                    int ni = current.i + di;
                    int nj = current.j + dj;
                    if (ni < 0 || ni >= H || nj < 0 || nj >= W) continue;
                    if (D[ni][nj] != -1 || S[ni][nj] == 1) continue;
                    
                    boolean adjacent = (di == 0 && Math.abs(dj) == 1) || (dj == 0 && Math.abs(di) == 1);
                    if (adjacent) {
                        deque.addFirst(new Node(current.c, ni, nj));
                    } else {
                        deque.addLast(new Node(current.c + 1, ni, nj));
                    }
                }
            }
        }
        
        System.out.println(D[ti][tj]);
    }
}

