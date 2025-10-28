
import java.util.*;
import java.io.*;
import java.math.*;

public class atcoder_AGC013_A {
    static int INF = Integer.MAX_VALUE;
    static int mod = 1000000007;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());
        String[] input = br.readLine().trim().split(" ");
        
        List<Integer> A = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(input[i]);
            if (A.isEmpty() || A.get(A.size() - 1) != num) {
                A.add(num);
            }
        }
        
        N = A.size();
        int i = 1;
        int ans = 0;
        
        while (i < N - 1) {
            if ((A.get(i - 1) < A.get(i) && A.get(i) > A.get(i + 1)) || 
                (A.get(i - 1) > A.get(i) && A.get(i) < A.get(i + 1))) {
                ans++;
                i++;
            }
            i++;
        }
        
        System.out.println(ans + 1);
    }
}

