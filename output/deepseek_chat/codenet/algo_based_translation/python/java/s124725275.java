
import java.util.*;
import java.io.*;

public class s124725275 {
    static final int MOD = 1000000007;
    static final int INF = 2147483648;
    
    static void exit(Object... argv) {
        System.out.println(Arrays.deepToString(argv));
        System.exit(0);
    }
    
    static int[] mina(int sub, int... argv) {
        int[] result = new int[argv.length];
        for (int i = 0; i < argv.length; i++) {
            result[i] = argv[i] - sub;
        }
        return result;
    }
    
    static int a_int(BufferedReader br) throws IOException {
        return Integer.parseInt(br.readLine());
    }
    
    static int[] ints(BufferedReader br) throws IOException {
        String[] parts = br.readLine().split(" ");
        int[] result = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            result[i] = Integer.parseInt(parts[i]);
        }
        return result;
    }
    
    static int[][] read_col(int H, BufferedReader br) throws IOException {
        int[][] ret = new int[H][];
        for (int i = 0; i < H; i++) {
            String[] parts = br.readLine().split(" ");
            ret[i] = new int[parts.length];
            for (int j = 0; j < parts.length; j++) {
                ret[i][j] = Integer.parseInt(parts[j]);
            }
        }
        return ret;
    }
    
    static int[][] read_map_as(int H, BufferedReader br, Map<Character, Integer> replace) throws IOException {
        int[][] ret = new int[H][];
        for (int i = 0; i < H; i++) {
            String line = br.readLine().trim();
            ret[i] = new int[line.length()];
            for (int j = 0; j < line.length(); j++) {
                ret[i][j] = replace.get(line.charAt(j));
            }
        }
        return ret;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int[] hw = ints(br);
        int H = hw[0], W = hw[1];
        
        int[] start = mina(1, ints(br));
        int si = start[0], sj = start[1];
        
        int[] end = mina(1, ints(br));
        int ti = end[0], tj = end[1];
        
        Map<Character, Integer> replace = new HashMap<>();
        replace.put('#', 1);
        replace.put('.', 0);
        int[][] S = read_map_as(H, br, replace);
        
        int[][] D = new int[H][W];
        for (int i = 0; i < H; i++) {
            Arrays.fill(D[i], -1);
        }
        
        Deque<int[]> que = new ArrayDeque<>();
        que.add(new int[]{0, si, sj});
        
        int[] diVals = {-2, -1, 0, 1, 2};
        int[] djVals = {-2, -1, 0, 1, 2};
        
        while (!que.isEmpty()) {
            int[] current = que.pollFirst();
            int c = current[0], i = current[1], j = current[2];
            
            if (D[i][j] != -1) {
                continue;
            }
            
            D[i][j] = c;
            
            for (int di : diVals) {
                for (int dj : djVals) {
                    int ni = i + di;
                    int nj = j + dj;
                    
                    if (ni < 0 || ni >= H || nj < 0 || nj >= W) continue;
                    if (D[ni][nj] != -1) continue;
                    if (ni == 0 && nj == 0) continue;
                    if (S[ni][nj] == 1) continue;
                    
                    if ((di == 0 && Math.abs(dj) == 1) || (dj == 0 && Math.abs(di) == 1)) {
                        que.addFirst(new int[]{c, ni, nj});
                    } else {
                        que.addLast(new int[]{c + 1, ni, nj});
                    }
                }
            }
        }
        
        System.out.println(D[ti][tj]);
    }
}

