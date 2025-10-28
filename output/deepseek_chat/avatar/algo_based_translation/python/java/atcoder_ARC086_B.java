
import java.util.*;
import java.io.*;

public class atcoder_ARC086_B {
    static final long mod = (long)1e9 + 7;
    
    static int mySign(int x) {
        return (x > 0) ? 1 : ((x < 0) ? -1 : 0);
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        String[] tokens = br.readLine().split(" ");
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = Integer.parseInt(tokens[i]);
        }
        
        int maxVal = 0;
        int maxSign = 0;
        int maxIndex = -1;
        
        for (int i = 0; i < N; i++) {
            int absVal = Math.abs(a[i]);
            if (absVal > maxVal) {
                maxVal = absVal;
                maxSign = mySign(a[i]);
                maxIndex = i;
            }
        }
        
        if (maxSign == 0) {
            System.out.println("0");
        } else if (maxSign == 1) {
            System.out.println(2 * N - 1);
            for (int i = 0; i < N; i++) {
                System.out.println((maxIndex + 1) + " " + (i + 1));
            }
            for (int i = 0; i < N - 1; i++) {
                System.out.println((i + 1) + " " + (i + 2));
            }
        } else {
            System.out.println(2 * N - 1);
            for (int i = 0; i < N; i++) {
                System.out.println((maxIndex + 1) + " " + (i + 1));
            }
            for (int i = N - 1; i >= 1; i--) {
                System.out.println((i + 1) + " " + i);
            }
        }
    }
}

