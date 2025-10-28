高大上的Java代码来啦：


import java.util.*;
import java.io.*;

public class atcoder_ABC140_F {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        Integer[] S = new Integer[input.length];
        for (int i = 0; i < input.length; i++) {
            S[i] = Integer.parseInt(input[i]);
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
            for (int k = 0; k < S.length; k++) {
                if (flag[k] && S[k] < cur.get(j)) {
                    cur.add(S[k]);
                    j++;
                    flag[k] = false;
                    if (j == jM) break;
                }
            }
            Collections.sort(cur, Collections.reverseOrder());
        }
        System.out.println("Yes");
    }
}


高大上的Java代码，简洁明了，直接使用！
