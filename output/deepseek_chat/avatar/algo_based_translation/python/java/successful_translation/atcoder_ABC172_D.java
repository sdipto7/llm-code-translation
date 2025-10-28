import java.util.*;
import java.io.*;

public class atcoder_ABC172_D {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());
        long ans = 0;
        
        for (int i = 1; i <= N; i++) {
            int quotient = N / i;
            long term = (long) i * quotient * (quotient + 1) / 2;
            ans += term;
        }
        
        System.out.println(ans);
    }
}
