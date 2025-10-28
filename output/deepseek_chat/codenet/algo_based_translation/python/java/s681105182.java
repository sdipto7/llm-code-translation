
import java.util.*;
import java.lang.*;

public class s681105182 {
    static final long INF = 1000000000000000000L;
    static final long MOD = 1000000007;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        long[] a_li = new long[N];
        for (int i = 0; i < N; i++) {
            a_li[i] = sc.nextLong();
        }
        
        Arrays.sort(a_li);
        
        long n = a_li[N-1];
        long dif = INF;
        long prev_dif = INF;
        long r = 0;
        
        for (int i = 0; i < N-1; i++) {
            long a = a_li[i];
            long currentDif = Math.abs(n/2 - a);
            if (currentDif < dif) {
                dif = currentDif;
                r = a;
                prev_dif = dif;
            }
        }
        
        System.out.println(n + " " + r);
    }
}

