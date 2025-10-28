
import java.util.*;
import java.math.*;
import java.io.*;

public class atcoder_AGC019_A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int q = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(br.readLine());
        
        long best1L = Math.min(Math.min(q * 4, h * 2), s);
        long best2L = Math.min(d, best1L * 2);
        
        if (n % 2 == 0) {
            System.out.println(best2L * (n / 2));
        } else {
            System.out.println(best2L * (n / 2) + best1L);
        }
    }
}

