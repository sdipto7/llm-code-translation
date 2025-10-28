
import java.util.*;
import java.io.*;

public class atcoder_ABC089_C {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine().trim());
        String[] S = new String[N];
        for (int i = 0; i < N; i++) {
            S[i] = br.readLine().trim();
        }
        
        String[] march = {"M", "A", "R", "C", "H"};
        int[] march_lis = new int[5];
        
        for (String s : S) {
            String firstChar = String.valueOf(s.charAt(0)).toUpperCase();
            for (int i = 0; i < march.length; i++) {
                if (march[i].equals(firstChar)) {
                    march_lis[i]++;
                    break;
                }
            }
        }
        
        long ans = 0;
        for (int i = 0; i < march_lis.length; i++) {
            for (int j = i + 1; j < march_lis.length; j++) {
                for (int k = j + 1; k < march_lis.length; k++) {
                    ans += (long) march_lis[i] * march_lis[j] * march_lis[k];
                }
            }
        }
        
        System.out.println(ans);
    }
}

