
import java.util.*;
import java.io.*;

public class atcoder_ABC140_F {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        String[] tokens = reader.readLine().split(" ");
        Integer[] S = new Integer[tokens.length];
        for (int i = 0; i < tokens.length; i++) {
            S[i] = Integer.parseInt(tokens[i]);
        }
        Arrays.sort(S, Collections.reverseOrder());
        
        boolean[] flag = new boolean[S.length];
        Arrays.fill(flag, true);
        ArrayList<Integer> cur = new ArrayList<>();
        cur.add(S[0]);
        flag[0] = false;
        
        for (int i = 0; i < N; i++) {
            int j = 0;
            int jM = cur.size();
            boolean foundEnough = false;
            
            for (int k = 0; k < S.length; k++) {
                if (flag[k] && S[k] < cur.get(j)) {
                    cur.add(S[k]);
                    j++;
                    flag[k] = false;
                    if (j == jM) {
                        foundEnough = true;
                        break;
                    }
                }
            }
            
            if (!foundEnough) {
                System.out.println("No");
                return;
            }
            
            Collections.sort(cur, Collections.reverseOrder());
        }
        
        System.out.println("Yes");
    }
}

