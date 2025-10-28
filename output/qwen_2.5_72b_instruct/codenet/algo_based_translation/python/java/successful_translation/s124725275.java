
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class s124725275 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] tokens = reader.readLine().split(" ");
        int H = Integer.parseInt(tokens[0]);
        int W = Integer.parseInt(tokens[1]);
        
        tokens = reader.readLine().split(" ");
        int si = Integer.parseInt(tokens[0]) - 1;
        int sj = Integer.parseInt(tokens[1]) - 1;
        
        tokens = reader.readLine().split(" ");
        int ti = Integer.parseInt(tokens[0]) - 1;
        int tj = Integer.parseInt(tokens[1]) - 1;
        
        int[][] S = new int[H][W];
        for (int i = 0; i < H; i++) {
            char[] chars = reader.readLine().toCharArray();
            for (int j = 0; j < W; j++) {
                S[i][j] = (chars[j] == '#') ? 1 : 0;
            }
        }
        
        int[][] D = new int[H][W];
        for (int[] row : D) {
            Arrays.fill(row, -1);
        }
        
        Deque<int[]> que = new LinkedList<>();
        que.addFirst(new int[]{0, si, sj});
        
        while (!que.isEmpty()) {
            int[] current = que.pollFirst();
            int c = current[0];
            int i = current[1];
            int j = current[2];
            
            if (D[i][j] != -1) {
                continue;
            }
            
            D[i][j] = c;
            
            for (int di = -2; di <= 2; di++) {
                for (int dj = -2; dj <= 2; dj++) {
                    int ni = i + di;
                    int nj = j + dj;
                    
                    if (ni < 0 || ni >= H || nj < 0 || nj >= W || D[ni][nj] != -1 || (ni == 0 && nj == 0) || S[ni][nj] == 1) {
                        continue;
                    }
                    
                    int nc;
                    if ((di == 0 && Math.abs(dj) == 1) || (dj == 0 && Math.abs(di) == 1)) {
                        nc = c;
                        que.addFirst(new int[]{nc, ni, nj});
                    } else {
                        nc = c + 1;
                        que.addLast(new int[]{nc, ni, nj});
                    }
                }
            }
        }
        
        System.out.println(D[ti][tj]);
    }
}

