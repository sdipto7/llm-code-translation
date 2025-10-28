
import java.util.*;
import java.io.*;

public class s233116196 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        Map<Integer, List<Integer>> G = new HashMap<>();
        for (int i = 1; i <= N; i++) {
            G.put(i, new ArrayList<>());
        }
        
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            G.get(a).add(b);
            G.get(b).add(a);
        }
        
        int[] col = new int[N + 1];
        Arrays.fill(col, -1);
        int cnt = 0;
        
        for (int i = 1; i <= N; i++) {
            if (col[i] < 0) {
                col[i] = cnt;
                Queue<Integer> que = new LinkedList<>();
                que.add(i);
                
                while (!que.isEmpty()) {
                    int x = que.poll();
                    for (int y : G.get(x)) {
                        if (col[y] < 0) {
                            col[y] = cnt;
                            que.add(y);
                        }
                    }
                }
                cnt++;
            }
        }
        
        int cmax = 0;
        for (int i = 1; i <= N; i++) {
            if (col[i] > cmax) {
                cmax = col[i];
            }
        }
        
        System.out.println(cmax);
    }
}

